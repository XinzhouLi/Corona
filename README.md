# CoronaProject 

Project Title:Monopoly(Board game)

1.prerequisites
	(1)for the player who only want to play text version game.
		If just want to play the text version game, installation of java is enough to play the game
		Download Updated_Main.java,Services.java,Player.java,Property.java,UseRandomCard.java,computerUseRandomCard.java,Constant.java,Gameplay.java
		InitialList.java.
	(2)if want to player the GUI version of the game
		Install both java and javaFX, and download all the java file that is used in text version game.
		Also download GUI_Board.java,mainforsettingbuttons.java,gui123.java,Gameplay_GUI.java.
		
	
2. Intro of the project
	A board game called Monopoly, all the players stand on the start location, they are allowed to move(the number of steps they moved depend on the
 	the dice number)buy property and sell property.  Created by Joseph Yiu Chu Lam,Sarmad Manzar,Ali Parsaee,Xudong Miao,Xinzhou Li.
	
	Technology used:   Java and javaFX()

	Rule of the game:
		(1)if the player stand on other people's property, the player will pay the money to the owner of the property.
		(2)if the player stand on the jail,they will lose money.
		(3)if the player stand on the property that no one owns, they can buy the land(except the jail and the start location of the game.)
		(4)Each player can roll the dice at their turn.
		(5)Once a player lose all their money, the game end.
		(6)At the end of the game,all the property owned by the player in the world will be sold. The richest player is the winner of the game.
		(7)Random Card: the player has chance to use random card, there are 6 different random card, the player may lose or gain the money, or the player will be throw into the jail.
		    there is also move card and steal property card, the player may move to the location they want by the using of move card,and steal property card allow the player to 
		    steal property from other players.

3.Information about each java file
	(1) part of text version game:
		Updated_Main.java:where the program start to run.

		Services.java:include all the method that used in main method
	   	   	for example check if the player stand on his/her own property or others and calculate player's ramained money.

		Player.java: set and get the information of the player.
	   	                   such as location, money amount in player's bank.


		Property.java:set and get the information of the property.
	      	      	      allow people to check the state of the property, for example the level of building, the owner of the property.

		Constant.java:Contain all the constant number will be used in the project.
	
		InitialList.java:This part of the code is where we create the property and the player. Set the name or the money amount the player has at the start of the game

		UsingRandomCard.java: this part of code allow the player to use random card, the probability that the player to gain the money is 2/7,and the probability of others are same.

		computerUseRandomCard.java: the computer player will choose how to use move card and steal property card more wisely, it increase the level of difficulty.
	
		Gameplay.java: Contain most of the logic.for example ask the player to input.
	


	(2)part of the GUI game:
		All the java file in the text version is introduced above.
		
		GUI_Board.java:Create the visual board, it shows the property and the player's location, and it is make by the collections of button(JButton).

		mainforsettingbuttons.java: Set the name of the button and also put those property into the arraylist.

		gui123.java:Contain all the changes for the world, if a player buy the property the colour of the property will changed

		Gameplay_GUI.java:same as the Gameplay.java, the main logic is same as Gameplay.java, connect the logic code to the GUI

		

4.Run the game
	(1)Run the java file that called Updated_Main.java for the text version game.
	    make sure that the Gameplay.startGame(InitialList.playersList(), InitialList.propertiesList()); is the only code in the file.

	(2)For the GUI part, go to Updated_Main.java, change Gameplay.startGame(InitialList.playersList(), InitialList.propertiesList());
	     to Gameplay_GUI.startGame(InitialList.playersList(), InitialList.propertiesList());  and run the Updated_Main.java
5.Project states
	The computer player becomes more wisely than the last version due to they are allowed to use random card.
	
	The game can run but there are some error:
		GUI is added to the game, and the player can play either text version game or GUI version game.
		The player can check there money amount in the bank by just click the information button, the adding of random card allow the user make 
		more choices. The GUI allow the player to update their location by adding their player number after the name of the property but there is a 
		bug that can not delete the name of the player. We will fix it.
	
	We do not use javaFX, and we used the JButton which is not allowed, we will transfer to javaFX as soon as possible.
	
	There is no test for the program right now, and we will add it

6Expect in future:
	Adding of JUNIT test, and allow the player to choose the difficulty of the game(computer player). More information is shown and show it more clearly.
	 make the game looks better, insert the picture that on the internet. If we still have time, we will allow the player to enter how many human player.

		website:		https://github.com/joseph5-ship/Corona


