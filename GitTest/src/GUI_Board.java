import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class GUI_Board {
	public static void setColor(ArrayList<Property> propertiesList, ArrayList<Button> buttons) {
		for(Property a : propertiesList) {
			if(a.getOwner() == 0) {
				buttons.get(a.getPosition()).setStyle("-fx-background-color: Blue");
			}
			if(a.getOwner() == 1) {
				buttons.get(a.getPosition()).setStyle("-fx-background-color: Red");
			}
			if(a.getOwner() == 2) {
				buttons.get(a.getPosition()).setStyle("-fx-background-color: Green");
			}
			if(a.getOwner() == 3) {
				buttons.get(a.getPosition()).setStyle("-fx-background-color: Yellow");
			}
			if(a.getOwner() == 5) {
				buttons.get(a.getPosition()).setStyle("-fx-background-color: Tan");
			}
			
		}
	}
	public static void buttonHandler(ArrayList<Button> buttons,Label infoTextField) {
	buttons.get(0).setOnAction(new EventHandler<ActionEvent>() {
		 
	    @Override
	    public void handle(ActionEvent e) {

	        infoTextField.setText("Go square: The Go square cannot be bought or sold, every time you pass this square you get $200!");
	        if (Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==5&&
	    			Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==15) {
	    			Constant.CHOSENNUM = 0;
	    		}
	    }
	});
	buttons.get(1).setOnAction(new EventHandler<ActionEvent>() {
		 
	    @Override
	    public void handle(ActionEvent e) {

	        infoTextField.setText("Canada: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
	        if (Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==5&&
	    			Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==15) {
	    			Constant.CHOSENNUM = 1;
	    		}
	    }
	});
	buttons.get(2).setOnAction(new EventHandler<ActionEvent>() {
		 
	    @Override
	    public void handle(ActionEvent e) {
	        infoTextField.setText("Brazil: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
	        if (Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==5&&
	    			Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==15) {
	    			Constant.CHOSENNUM = 2;
	    		}
	    }
	});
	buttons.get(3).setOnAction(new EventHandler<ActionEvent>() {
		 
	    @Override
	    public void handle(ActionEvent e) {
	        infoTextField.setText("Russia: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
	        if (Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==5&&
	    			Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==15) {
	    			Constant.CHOSENNUM = 3;
	    		}
	    }
	});
	buttons.get(4).setOnAction(new EventHandler<ActionEvent>() {
		 
	    @Override
	    public void handle(ActionEvent e) {
	        infoTextField.setText("Mexico: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
	        if (Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==5&&
	    			Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==15) {
	    			Constant.CHOSENNUM = 4;
	    		}
	    }
	});
	buttons.get(5).setOnAction(new EventHandler<ActionEvent>() {
		 
	    @Override
	    public void handle(ActionEvent e) {
	        infoTextField.setText("Random 1 square: If you land here pick up a random card");
	        if (Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==5&&
	    			Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==15) {
	    			Constant.CHOSENNUM = 5;
	    		}
	    }
	});
	buttons.get(6).setOnAction(new EventHandler<ActionEvent>() {
		 
	    @Override
	    public void handle(ActionEvent e) {
	        infoTextField.setText("Egypt: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
	        if (Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==5&&
	    			Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==15) {
	    			Constant.CHOSENNUM = 6;
	    		}
	    }
	});
	buttons.get(7).setOnAction(new EventHandler<ActionEvent>() {
		 
	    @Override
	    public void handle(ActionEvent e) {
	        infoTextField.setText("Turkey: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
	        if (Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==5&&
	    			Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==15) {
	    			Constant.CHOSENNUM = 7;
	    		}
	    }
	});
	buttons.get(8).setOnAction(new EventHandler<ActionEvent>() {
		 
	    @Override
	    public void handle(ActionEvent e) {
	        infoTextField.setText("Germany: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
	        if (Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==5&&
	    			Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==15) {
	    			Constant.CHOSENNUM = 8;
	    		}
	    }
	});
	buttons.get(9).setOnAction(new EventHandler<ActionEvent>() {
		 
	    @Override
	    public void handle(ActionEvent e) {
	        infoTextField.setText("United Kingdoms: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
	        if (Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==5&&
	    			Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==15) {
	    			Constant.CHOSENNUM = 9;
	    		}
	    }
	});
	buttons.get(10).setOnAction(new EventHandler<ActionEvent>() {
		 
	    @Override
	    public void handle(ActionEvent e) {
	        infoTextField.setText("Jail button: If you land here you have $50");
	        if (Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==5&&
	    			Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==15) {
	    			Constant.CHOSENNUM = 10;
	    		}
	    }
	});
	buttons.get(11).setOnAction(new EventHandler<ActionEvent>() {
		 
	    @Override
	    public void handle(ActionEvent e) {
	        infoTextField.setText("Italy: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
	        if (Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==5&&
	    			Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==15) {
	    			Constant.CHOSENNUM = 11;
	    		}
	    }
	});
	buttons.get(12).setOnAction(new EventHandler<ActionEvent>() {
		 
	    @Override
	    public void handle(ActionEvent e) {
	        infoTextField.setText("South Africa: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
	        if (Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==5&&
	    			Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==15) {
	    			Constant.CHOSENNUM = 12;
	    		}
	    }
	});
	buttons.get(13).setOnAction(new EventHandler<ActionEvent>() {
		 
	    @Override
	    public void handle(ActionEvent e) {
	        infoTextField.setText("South Korea: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
	        if (Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==5&&
	    			Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==15) {
	    			Constant.CHOSENNUM = 13;
	    		}
	    }
	});
	buttons.get(14).setOnAction(new EventHandler<ActionEvent>() {
		 
	    @Override
	    public void handle(ActionEvent e) {
	        infoTextField.setText("Columbia: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
	        if (Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==5&&
	    			Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==15) {
	    			Constant.CHOSENNUM = 14;
	    		}
	    }
	});
	buttons.get(15).setOnAction(new EventHandler<ActionEvent>() {
		 
	    @Override
	    public void handle(ActionEvent e) {
	        infoTextField.setText("Random 2 square: If you land here pick up a random card");
	        if (Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==5&&
	    			Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==15) {
	    			Constant.CHOSENNUM = 15;
	    		}
	    }
	});
	buttons.get(16).setOnAction(new EventHandler<ActionEvent>() {
		 
	    @Override
	    public void handle(ActionEvent e) {
	        infoTextField.setText("China: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
	        if (Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==5&&
	    			Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==15) {
	    			Constant.CHOSENNUM = 16;
	    		}
	    }
	});
	buttons.get(17).setOnAction(new EventHandler<ActionEvent>() {
		 
	    @Override
	    public void handle(ActionEvent e) {
	        infoTextField.setText("India: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
	        if (Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==5&&
	    			Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==15) {
	    			Constant.CHOSENNUM = 17;
	    		}
	    }
	});
	buttons.get(18).setOnAction(new EventHandler<ActionEvent>() {
		 
	    @Override
	    public void handle(ActionEvent e) {
	        infoTextField.setText("United States: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
	        if (Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==5&&
	    			Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==15) {
	    			Constant.CHOSENNUM = 18;
	    		}
	    }
	});
	buttons.get(19).setOnAction(new EventHandler<ActionEvent>() {
		 
	    @Override
	    public void handle(ActionEvent e) {
	        infoTextField.setText("Japan: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
	        if (Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==5&&
	    			Gameplay_GUI.playersList.get(Gameplay_GUI.getTurn()).getLocation()==15) {
	    			Constant.CHOSENNUM = 19;
	    		}
	    }
	});
	}
}

