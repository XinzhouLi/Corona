package com.Logic;
import java.util.ArrayList;
import java.util.Scanner;
import com.Function.*;
import com.Data.*;

/**
 * Represents the information needed to run the text-based version of 
 * the Monopoly Game. Uses the method startGame() to handle the logic of running the
 * game and printing the results into the console. 
 */
public class Gameplay {

	/**
	 * Method startGame handles the logic necessary to run the text-based version of Monopoly.
	 * It uses the Services class to constantly check if the winning conditions have been 
	 * met every turn. It will iterate through the players list and check every player. The method 
	 * will use getLocation() to locate the player's location relative to the board. If the integer value
	 * is special (Jail, GO, Chance, or Treasure), enact special logic code.
	 * @param playersList the list of players
	 * @param propertiesList the list of properties
	 */
	public static void startGame(ArrayList<Player> playersList, ArrayList<Property> propertiesList) {
		while(Services.winingCondiction(playersList)) {
			for (Player currentPlayer:playersList) {
				if (!Services.winingCondiction(playersList)) {
					break;
				}
				System.out.println(currentPlayer.getPlayerName() + "'s turn");
				System.out.println("Money: " + currentPlayer.getMoney());
				System.out.println("Location: " + currentPlayer.getLocation());
				Services.locationUpdate(currentPlayer);
				System.out.println("Location: " + currentPlayer.getLocation());
				System.out.println("Property name: " + propertiesList.get(currentPlayer.getLocation()).getPropertyName());
								
				if(currentPlayer.getLocation() == 10) {
					Services.payJail(currentPlayer);
					continue;
				}else if (currentPlayer.getLocation() == 5||currentPlayer.getLocation() == 15) {
					if (currentPlayer.getPlayerNumber()==0) {
						UsingRandomCard.humanUseRandomCard(propertiesList, currentPlayer);
					}else {
						computerUseRandomCard.computerUseRandom(propertiesList, currentPlayer);
					}
					continue;
				}else if (currentPlayer.getLocation() == 0) {
					currentPlayer.setMoney(currentPlayer.getMoney()+200);
					continue;
				}

				if (currentPlayer.getPlayerNumber()==0) {
		        	if (propertiesList.get(currentPlayer.getLocation()).getOwner() == currentPlayer.getPlayerNumber()) {
		        		System.out.println("Do you want to bulid house on this property? (Y/N)");
						Scanner input = new Scanner(System.in);
				        String choice = input.nextLine();
				        if (choice.equalsIgnoreCase("Y")) {
				        	Services.buildHouse(currentPlayer, propertiesList);
				        }
					
					}else if (propertiesList.get(currentPlayer.getLocation()).getOwner() == 5) {
						System.out.println("Do you want to buy this property? (Y/N)");
						Scanner input = new Scanner(System.in);
				        String choice = input.nextLine();
				        if (choice.equalsIgnoreCase("Y")) {
				        	Services.buyLand(currentPlayer, propertiesList);
				        }
					}else if (propertiesList.get(currentPlayer.getLocation()).getOwner() != currentPlayer.getPlayerNumber()) {
						Services.rent(currentPlayer, propertiesList, playersList);
					}
				}else {
					//AI turn
						if (propertiesList.get(currentPlayer.getLocation()).getOwner() == currentPlayer.getPlayerNumber()) {
							if (currentPlayer.getMoney()>=400) {
								Services.buildHouse(currentPlayer, propertiesList);
							}
						}else if (propertiesList.get(currentPlayer.getLocation()).getOwner() == 5) {
							if (currentPlayer.getMoney()>=300) {
								Services.buyLand(currentPlayer, propertiesList);
							}	
						}else if (propertiesList.get(currentPlayer.getLocation()).getOwner() != currentPlayer.getPlayerNumber()) {
							Services.rent(currentPlayer, propertiesList, playersList);
						}
				}
				System.out.println("");
			}
		}
		
		Services.findWinner(playersList, propertiesList);
		System.out.println("End Game");
		
	}
	
}
