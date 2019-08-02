import java.util.ArrayList;

public class cpdifficulty2 extends computerPlayer{
	private int difficulty=2;
	public cpdifficulty2(int PlayerNumber,int difficulty) {
		super(PlayerNumber);
		this.difficulty =difficulty;
		// TODO Auto-generated constructor stub
	}
	
	public cpdifficulty2(Player player,int difficulty) {
		super(player);
		this.difficulty=difficulty;
	}
	
	public int getDifficulty() {
		return this.difficulty;
	}
	public cpdifficulty2(Player player) {
		super(player);
	}



	public static int computerUseStealCard(ArrayList<Property> propertyList,Player computerPlayer) {
		int highestRent=0;
		Property highestRentProperty=null;
		for(Property i :propertyList) {
			if (i.getOwner()!=computerPlayer.getPlayerNumber()&&i.getRent()>highestRent) {
				highestRent=i.getRent();
				}
			}
		for(Property i:propertyList) {
			if(i.getRent()==highestRent&&i.getOwner()!=computerPlayer.getPlayerNumber()) {
				highestRentProperty=i;
			}
		}
		return highestRentProperty.getPosition();
	}
	
	
	
	//this part of program allow the computer check if there are any property that do not owned by any player
	public static Boolean haveEmptyProperty(ArrayList<Property> propertyList,Player computerPlayer) {
		Boolean result=false;
		for(Property i:propertyList) {
			if(i.getOwner()==5
			&&i.getPosition()!=Constant.JAIL
			&&i.getPosition()!=Constant.FIRST_RANDOM
			&&i.getPosition()!=Constant.SECOND_RANDOM
			&&i.getPosition()!=Constant.START_POSITION) 
			{
					result=true;
					break;
			}
		}
		return result;
		
	}
public static void computerUseMoveCard(ArrayList<Property> propertyList,Player computerPlayer) {
		
		if(haveEmptyProperty(propertyList,computerPlayer)) {
			for(Property i:propertyList) {
				if(i.getOwner()==5
				&&i.getPosition()!=Constant.JAIL
				&&i.getPosition()!=Constant.FIRST_RANDOM
				&&i.getPosition()!=Constant.SECOND_RANDOM
				&&i.getPosition()!=Constant.START_POSITION) 
				{	
					System.out.println(computerPlayer.getPlayerName()+"move to property"+i.getPosition());
					computerPlayer.setLocation(i.getPosition());
					break;
				}
			}
		}
		else {
			for(Property i:propertyList) {
				if(i.getOwner()==computerPlayer.getPlayerNumber()) {
					computerPlayer.setLocation(i.getPosition());
					break;
					
				}
			}
		}
		
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
	
}