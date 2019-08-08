# CoronaProject 
Project Title:Monopoly(Board game)

1.prerequisites
	(1)for the player who only want to play text version game.
		If just want to play the text version game, installation of java is enough to play the game
		Download Updated_Main.java,Services.java,Player.java,Property.java,UseRandomCard.java,computerUseRandomCard.java,Constant.java,Gameplay.java
		InitialList.java, computerPlayer.java, cpdifficulty1.java ,cpdifficulty2.java, createCP.java.
	(2)if want to player the GUI version of the game
		Install both java and javaFX, and download all the java file that is used in text version game.
		Also download sd.java
		
	
2. Intro of the project
	A board game called Monopoly, all the players stand on the start location, they are allowed to move(the number of steps they moved depend on the
 	the dice number)buy property and sell property.  Created by Joseph Yiu Chu Lam,Sarmad Manzar,Ali Parsaee,Xudong Miao,Xinzhou Li.
	
	Technology used:   Java and javaFX

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
	
		ComputerPlayer.java:extends Player.java,contain the information of computer player.

		cpdifficulty1.java: set the level of difficulty of the computer player to 1.

		cpdifficulty2.java: set the difficulty of the computer palyer to 2.

		createCP.java:where we create the computer player.

	(2)part of the GUI game:
		All the java file in the text version is introduced above.
		
		
		sd.java:where the board is created, all the button are set.

4.Run the game
	(1)Run the java file that called Updated_Main.java for the text version game.
	    make sure that the Gameplay.startGame(InitialList.playersList(), InitialList.propertiesList()); is the only code in the file.

	(2)For the GUI part, go to sd.java  (download all the java file needed for text version game) run the file.


5.Project states
	Changes of Computer Player:
		The computer player becomes more wisely than the first version due to they are allowed to use random card. Different difficulty level of computer players.
	
	GUI part:
		GUI is added to the game, and the player can play either text version game or GUI version game.
		The player can check there money amount in the bank by just click the information button, the adding of random card allow the user make 
		more choices, If player get steal property card and move card, they are allowed to click the button to choose the property they want to steal or location that they want to move.
		The circle with different color represents different player, and the location of the circle is player's location.
		Player can click the button which represents property, and the information of this property is shown aat the bottom.
		
	
	We transfer from JButton to Button.
	
	There is a Junit for the program, it tests the Services.java, service.java contain all the method to update the information of the player, property,it is the most important class
	so we choose to test this class. Import Junit test and put ServicesTest.java and Sevices.java to start testing.


6Future expect:
	Insert picture, more clear information, insert music, animation after rolling the dice.

		website:		https://github.com/joseph5-ship/Corona




