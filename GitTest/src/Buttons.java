import javafx.animation.RotateTransition; 
import javafx.application.Application; 
import static javafx.application.Application.launch; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon; 
import javafx.stage.Stage; 
import javafx.util.Duration; 
	import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
	import javafx.scene.Scene;
	import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.*;
	import javafx.stage.*;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javafx.application.*;
import javafx.application.Application;  
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;



	public class sdf extends Application {
		static private int btnWidth = 100; // width of buttons
		static private int btnHeight = 100; //height of buttons
		static private int infoWidth = 500; //width of info text box
		static private int infoHeight = 200; //height of info text box 
		static private String infoText = "";
		static ArrayList<Player> playersList = InitialList.playersList(); // arraylist made for the player 0th indecy is first player
		static ArrayList<Property> propertiesList = InitialList.propertiesList(); // arraylist made for the property 0th indecy is first property
		static ArrayList<Circle> circs = new ArrayList<Circle>(); //arraylist made for the cirlces 0th indecy is first circle correlating to first player
		static private int turn = 0; // whose turn it is 0 means it is first players turn
		
		//the buttons used
			static Button infos = new Button("information");
			static Button buy = new Button("Buy");
			static Button endturn = new Button("endturn");
			static Button build = new Button("Build House");
			static Button random = new Button("Random");
			static Button roll = new Button("Roll Dice");
			static Button a = new Button("Go          ");
			static Button b = new Button(propertiesList.get(1).getPropertyName());
			static Button c = new Button(propertiesList.get(2).getPropertyName());
			static Button d = new Button(propertiesList.get(3).getPropertyName());
			static Button e = new Button(propertiesList.get(4).getPropertyName());
			static Button f = new Button("Random 1   ");
			static Button g = new Button(propertiesList.get(6).getPropertyName());
			static Button h = new Button(propertiesList.get(7).getPropertyName());
			static Button i = new Button(propertiesList.get(8).getPropertyName());
			static Button j = new Button(propertiesList.get(9).getPropertyName());
			static Button k = new Button("Jail        ");
			static Button l = new Button(propertiesList.get(11).getPropertyName());
			static Button m = new Button(propertiesList.get(12).getPropertyName());
			static Button n = new Button(propertiesList.get(13).getPropertyName());
			static Button o = new Button(propertiesList.get(14).getPropertyName());
			static Button p = new Button("Random 2    ");
			static Button q = new Button(propertiesList.get(16).getPropertyName());
			static Button r = new Button(propertiesList.get(17).getPropertyName());
			static Button s = new Button(propertiesList.get(18).getPropertyName());
			static Button t = new Button(propertiesList.get(19).getPropertyName());
			static Circle circle = new Circle();
			static Circle circle2 = new Circle();
			static Circle circle3 = new Circle();
			static Circle circle4 = new Circle();
			public boolean ii = false;
			//setter for setting whose turn it is
			public static void setTurn(int a) {
				if(a >= 0 && a <= 3) {
					turn = a;
				}
			}
			
@Override
	public void start(Stage grid) throws Exception {
	grid.setTitle("Monopoly Board"); //grid title
	
	//adding circles
	circs.add(circle);
	circs.add(circle2);
	circs.add(circle3);
	circs.add(circle4);
	
	//coloring circles
	circle.setFill(Color.BLUE);
	circle2.setFill(Color.RED);
	circle3.setFill(Color.Green);
	circle4.setFill(Color.GOLD);

	//setting circles radiuses
	circle.setRadius(5);
	circle2.setRadius(5);
	circle3.setRadius(5);
	circle4.setRadius(5);
	
	// the gridpane I used
	BorderPane borderPane = new BorderPane();
	GridPane gridPane = new GridPane();
	AnchorPane anchorPane = new AnchorPane();
	borderPane.setCenter(gridPane);
	
	
	//gonna be in the center
	gridPane.setAlignment(Pos.CENTER);
	
	//spacing between the objects is 10
	gridPane.setHgap(10);
	gridPane.setVgap(10);
	
	//information label and text settings
	Label info = new Label("Information");
	
	Label infoTextField = new Label();
	infoTextField.setWrapText(true);
	infoTextField.setStyle("-fx-background-color: white;");;
	infoTextField.setPrefSize(infoWidth, infoHeight);
	borderPane.setBottom(infoTextField);
	borderPane.setAlignment(infoTextField, Pos.CENTER);

	//setting the buttons to the width and height we want
	a.setPrefSize(btnWidth, btnHeight);
	b.setPrefSize(btnWidth, btnHeight);
	c.setPrefSize(btnWidth, btnHeight);
	d.setPrefSize(btnWidth, btnHeight);
	e.setPrefSize(btnWidth, btnHeight);
	f.setPrefSize(btnWidth, btnHeight);
	g.setPrefSize(btnWidth, btnHeight);
	h.setPrefSize(btnWidth, btnHeight);
	i.setPrefSize(btnWidth, btnHeight);
	j.setPrefSize(btnWidth, btnHeight);
	k.setPrefSize(btnWidth, btnHeight);
	l.setPrefSize(btnWidth, btnHeight);
	m.setPrefSize(btnWidth, btnHeight);
	n.setPrefSize(btnWidth, btnHeight);
	o.setPrefSize(btnWidth, btnHeight);
	p.setPrefSize(btnWidth, btnHeight);
	q.setPrefSize(btnWidth, btnHeight);
	r.setPrefSize(btnWidth, btnHeight);
	s.setPrefSize(btnWidth, btnHeight);
	t.setPrefSize(btnWidth, btnHeight);
	infos.setPrefSize(btnWidth, btnHeight);
	buy.setPrefSize(btnWidth, btnHeight);
	endturn.setPrefSize(btnWidth, btnHeight);
	build.setPrefSize(btnWidth, btnHeight);
	random.setPrefSize(btnWidth, btnHeight);
	roll.setPrefSize(btnWidth, btnHeight);


	//event handler for all the map square buttons, when pressed they write their functions in the information text box.
	a.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {

		        infoTextField.setText("Go square: The Go square cannot be bought or sold, every time you pass this square you get $200!");
		        
		    }
		});
		b.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {

		        infoTextField.setText("Property 1: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		c.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("Property 2: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		d.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("Property 3: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		e.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("Property 4: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		f.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("Random 1 square: If you land here pick up a random card");
		        
		    }
		});
		g.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("Property 6: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		h.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("Property 7: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		i.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("Property 8: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		j.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("Property 9: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		k.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("Jail button: If you land here you have $50");
		        
		    }
		});
		l.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("Italy: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		m.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("South Africa: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		n.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("South Korea: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		o.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("Columbia: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		p.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("Random 2 square: If you land here pick up a random card");
		        
		    }
		});
		q.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("China: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		r.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("India: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		s.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("United States: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		t.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("Japan: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		
		// moves a players circle relative to the map depending on whose turn it is
		

		roll.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		    	roll.setDisable(true);
		    	int newroll = Services.locationUpdate(playersList.get(turn));
		    	infoText=turn + " Congrats, you rolled a " + newroll+"\n";
		    	infoTextField.setText(infoText);
		    	playersList.get(turn).setLocation(playersList.get(turn).getLocation());
		    	
		    	//bigproblem
//		    	if (playersList.get(turn).getLocation() == 10) {
//					Services.payJail(playersList.get(turn));
//					infoText=turn + "You are in jail, lose 50 dollar.\n";
//					infoTextField.setText(infoText);
//				}else if (propertiesList.get(playersList.get(turn).getLocation()).getOwner() != playersList.get(turn).getPlayerNumber()) {
//					Services.rent(playersList.get(turn), propertiesList, playersList);
//					infoText = infoText +playersList.get(turn).getPlayerName()+" pays "+propertiesList.get(playersList.get(turn).getLocation()).getRent()+" to "+Services.searchPlayer(playersList.get(turn).getLocation(), propertiesList, playersList).getPlayerName()+"\n";
//					infoTextField.setText(infoText);
//				}
		    	gridPane.add(circs.get(turn), change.changex(playersList.get(turn).getLocation()), change.changey(playersList.get(turn).getLocation()));

		    }
		});
		buy.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		    	buy.setDisable(true);
		    	build.setDisable(true);
		    	if (propertiesList.get(playersList.get(turn).getLocation()).getOwner() == 5&&
		    		!(playersList.get(turn).getLocation()==5)&&
		    		!(playersList.get(turn).getLocation()==15)&&
		    		!(playersList.get(turn).getLocation()==0)&&
		    		!(playersList.get(turn).getLocation()==10)){
		    			infoText = infoText + "You have bought "+propertiesList.get(playersList.get(turn).getLocation()).getPropertyName()+".\n";
		    			infoTextField.setText(infoText);
			        	Services.buyLand(playersList.get(turn), propertiesList);
			        	setColor();
		    	}else {
		    		infoText = infoText + "You can not buy this property..\n";
					infoTextField.setText(infoText);
				}
		    }
		});
		endturn.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		    	roll.setDisable(false);
		    	buy.setDisable(false);
		    	build.setDisable(false);
		    	random.setDisable(false);
		    	infoText="";
		    	int a = turn + 1;
		    	int newturn = a%4;
		    	turn = newturn;
		    	infoText = infoText + "you have ended your turn its now player" + turn + "'s turn\n";
		    	infoTextField.setText(infoText);
		    	setColor();
		    	if (Services.winingCondiction(playersList)) {
					//jump to next scene and end game
				}
		    }
		});
		infos.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		    	infoTextField.setText("Please, pressing roll fisrt!!!");
		    }
		});

		random.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				if (playersList.get(turn).getLocation()==15||
					playersList.get(turn).getLocation()==5) {
					//use random card
				}else {
					random.setDisable(true);
					infoText = infoText + "You do not have chance to use random card.\n";
					infoTextField.setText(infoText);
					
				}
	    }
	});
		
		build.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		    	
		    	build.setDisable(true);
				if (propertiesList.get(playersList.get(turn).getLocation()).getOwner() == playersList.get(turn).getPlayerNumber()) {

			        	Services.buildHouse(playersList.get(turn), propertiesList);
			        	buy.setDisable(true);
				}else {
					infoText = infoText + "This property does not belong to you.\n";
					infoTextField.setText(infoText);
				}
		    }
		});
		
		gridPane.add(circle, change.changex(playersList.get(0).getLocation()), change.changey(playersList.get(0).getLocation()));
		gridPane.add(circle2, change.changex(playersList.get(1).getLocation()), change.changey(playersList.get(1).getLocation()));
		gridPane.add(circle3, change.changex(playersList.get(2).getLocation()), change.changey(playersList.get(2).getLocation()));
		gridPane.add(circle4, change.changex(playersList.get(3).getLocation()), change.changey(playersList.get(3).getLocation()));
		
	
	//setting padding and adding buttons to the coordinates we want
		gridPane.setPadding(new Insets (25, 25, 25, 25));
		gridPane.add(infos, 12, 3);
		gridPane.add(buy, 12, 1);
		gridPane.add(endturn, 11, 1);
		gridPane.add(build, 11, 3);
		gridPane.add(random, 12, 2);
		gridPane.add(roll, 11, 2);
		gridPane.add(a, 1, 1,1,1);
		gridPane.add(b, 2, 1,1,1);
		gridPane.add(c, 3, 1,1,1);
		gridPane.add(d, 4, 1,1,1);
		gridPane.add(e, 5, 1,1,1);
		gridPane.add(f, 6, 1,1,1);
		gridPane.add(g, 6, 2,1,1);
		gridPane.add(h, 6, 3,1,1);
		gridPane.add(i, 6, 4,1,1);
		gridPane.add(j, 6, 5,1,1);
		gridPane.add(k, 6, 6,1,1);
		gridPane.add(l, 5, 6,1,1);
		gridPane.add(m, 4, 6,1,1);
		gridPane.add(n, 3, 6,1,1);
		gridPane.add(o, 2, 6,1,1);
		gridPane.add(p, 1, 6,1,1);
		gridPane.add(q, 1, 5,1,1);
		gridPane.add(r, 1, 4,1,1);
		gridPane.add(s, 1, 3,1,1);
		gridPane.add(t, 1, 2,1,1);

		
		Scene a1 = new Scene(borderPane,150,150);
		grid.setHeight(1000);
		grid.setWidth(1200);
		grid.setScene(a1);
		grid.setTitle("okay");
		grid.show();


	}


static ArrayList<Button> buttons = new ArrayList<Button>(); // arraylist for buttons
static ArrayList<String> ognames = new ArrayList<String>();


public static void setLocation() {
	for(Player a : playersList) {
		String b = buttons.get(a.getLocation()).getText();
		buttons.get(a.getLocation()).setText(b + " " + a.getPlayerNumber());
	}
}
public static void correctLocation() {
	for(int a = 0; a< 19; a++) {
		buttons.get(a).setText(ognames.get(a));
	}
}

//colors the properties based on who owns them
public static void setColor() {
	for(Property a : properties) {
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
			buttons.get(a.getPosition()).setStyle("-fx-background-color: White");
		}
		
	}
}
	public static void main(String[] args) {
		
		//adding the map buttons to the buttons arraylist
		buttons.add(a);
		buttons.add(b);
		buttons.add(c);
		buttons.add(d);
		buttons.add(e);
		buttons.add(f);
		buttons.add(g);
		buttons.add(h);
		buttons.add(i);
		buttons.add(j);
		buttons.add(k);
		buttons.add(l);
		buttons.add(m);
		buttons.add(n);
		buttons.add(o);
		buttons.add(p);
		buttons.add(q);
		buttons.add(r);
		buttons.add(s);
		buttons.add(t);
		

//Li

launch(args);
}
}


