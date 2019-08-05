import java.util.ArrayList;
import java.util.Random;

public class cpdifficulty1 extends computerPlayer{
	private int difficulty=1;

	public cpdifficulty1(Player player) {
		super(player);
		
	}
	
//	public int getDifficulty() {
//		return this.difficulty;
//	}
	
	public static int computerUseStealCard(ArrayList<Property> propertyList,Player computerPlayer) {
		Random rand = new Random();
		int n = rand.nextInt(20);
		int owner=propertyList.get(n).getOwner();
		int currentPlayerNumber=computerPlayer.getPlayerNumber();
		while(owner!=currentPlayerNumber) {
			n = rand.nextInt(20);
		}
		return n;
	}
	public static int computerUseMoveCard(ArrayList<Property> propertyList,Player computerPlayer) {
		Random rand = new Random();
		int n = rand.nextInt(20);
		return n;
	}
	public static void computerUseRandom(ArrayList<Property> propertyList,Player computerPlayer) {
		int luckNumber=UsingRandomCard.reciveCard();
		
		if (luckNumber==1) {
			UsingRandomCard.jailCard(computerPlayer);
		}
		
		else if(luckNumber==2) {
			int propertyNumber=computerUseStealCard(propertyList,computerPlayer);
			Property chosenProperty=propertyList.get(propertyNumber);
			System.out.println(""+computerPlayer.getPlayerName()+"get the property"+chosenProperty.getPropertyName());
			UsingRandomCard.useStealCard(propertyList,computerPlayer,propertyNumber);
		}
		
		else if(luckNumber==3) {
			System.out.println("do not get any card, but recive the money(200)");
			UsingRandomCard.addMoney(computerPlayer);
		}
		
		else if(luckNumber==4) {
			System.out.println("do not get any card and lose the money(200)");
			UsingRandomCard.lostMoney(computerPlayer);
		}
		
		else if(luckNumber==5){
			System.out.println("Computer player"+computerPlayer.getPlayerNumber()+
								"Recive a move card");
			computerUseMoveCard(propertyList,computerPlayer);
		}
		
		else {
			System.out.println(""+computerPlayer.getPlayerName()+"Recive 200 money a rob card");
			int propertyNumber=computerUseStealCard(propertyList,computerPlayer);
			Property chosenProperty=propertyList.get(propertyNumber);
			System.out.println(""+computerPlayer.getPlayerName()+"get the property"+chosenProperty.getPropertyName());
			UsingRandomCard.useStealCard(propertyList,computerPlayer,propertyNumber);
			UsingRandomCard.addMoney(computerPlayer);
		}
	}
	public static void GUIcomputerUseRandom(ArrayList<Property> propertyList,Player computerPlayer,String infotext) {
		int luckNumber=UsingRandomCard.reciveCard();
		if (luckNumber==1) {
			infotext+=computerPlayer.getPlayerName()+"go tot the jail";
			UsingRandomCard.jailCard(computerPlayer);
		}
		
		else if(luckNumber==2) {
			infotext+="Get a steal property card";
			int propertyNumber=computerUseStealCard(propertyList,computerPlayer);
			Property chosenProperty=propertyList.get(propertyNumber);
			infotext+=""+computerPlayer.getPlayerName()+"get the property"+chosenProperty.getPropertyName();
			UsingRandomCard.useStealCard(propertyList,computerPlayer,propertyNumber);
		}
		
		else if(luckNumber==3) {
			infotext+=computerPlayer.getPlayerName()+"do not get any card, but recive the money(200)";
			UsingRandomCard.addMoney(computerPlayer);
		}
		
		else if(luckNumber==4) {
			infotext+=computerPlayer.getPlayerName()+"do not get any card and lose the money(200)";
			UsingRandomCard.lostMoney(computerPlayer);
		}
		
		else if(luckNumber==5){
			infotext+=computerPlayer.getPlayerNumber()+
								"Recive a move card";
			computerUseMoveCard(propertyList,computerPlayer);
		}
		
		else {
			infotext+=""+computerPlayer.getPlayerName()+"Recive 200 money a rob card";
			int propertyNumber=computerUseStealCard(propertyList,computerPlayer);
			Property chosenProperty=propertyList.get(propertyNumber);
			infotext+=""+computerPlayer.getPlayerName()+"get the property"+chosenProperty.getPropertyName();
			UsingRandomCard.useStealCard(propertyList,computerPlayer,propertyNumber);
			UsingRandomCard.addMoney(computerPlayer);
		}
	}
	
	
}
