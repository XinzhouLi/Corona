# CoronaProject 

Title:Monopoly(Board game)

1.prerequisites
	Installation of java,must download the   main.java,service.java,monopolyMap.java,player.java,constant.java,property.java

2. Intro of the project
	A board game called Monopoly, all the players stand on the start location, they are allowed to move(the number of steps they moved depend on the dice number).  Created by Joseph Yiu Chu Lam,Sarmad Manzar,Ali Parsaee,Xudong Miao,Xinzhou Li.
	
	Technology used:   Java.

	Rule of the game:
		(1)if the player stand on other people's property, the player will pay the money to the owner of the property.
		(2)if the player stand on the jail,they will lose money.
		(3)if the player stand on the property that no one owns, they can buy the land(except the jail and the start location of the game.)
		(4)Each player can roll the dice at their turn.
		(5)Once a player lose all their money, the game end.
		(6)At the end of the game,all the property owned by the player in the world will be sold. The richest player is the winner of the game.

3.Information about each java file
	
	main.java:where the program start to run.

	service.java:include all the method that used in main method
	   	   for example check if the player stand on his/her own property or others and calculate player's ramained money.

	player.java: set and get the information of the player.
	   	   such as location, money amount in player's bank.
	   

	monopolyMap.java: The creation of the monopoly world.
 	                 	  includes the size of the world.

	property.java:set and get the information of the property.
	      	      allow people to check the state of the property, for example the level of building, the owner of the property.

	constant.java:Contain all the constant number will be used in the project.

3.Run the game
	Run the java file that called main.java
4Project states
	For now,it only allow 4 computer players to play the game, and it is text version game. After the running of the program, it allowed to give the name to the computer player, after the adding of GUI(next week), the player can choose the number of players, and allow the player to play the game.


