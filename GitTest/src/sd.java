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
	import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.TriangleMesh;
import javafx.scene.*;
	import javafx.stage.*;

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



	public class sd extends Application {
		static private int btnWidth = 100; // width of buttons
		static private int btnHeight = 100; //height of buttons
		static private int infoWidth = 400; //width of info text bo
		static private int infoHeight = 350; //height of info text box 
		static ArrayList<Player> align = InitialList.playersList(); // arraylist made for the player 0th indecy is first player
		static ArrayList<Property> properties = InitialList.propertiesList(); // arraylist made for the property 0th indecy is first property
		static ArrayList<Circle> circs = new ArrayList<Circle>(); //arraylist made for the cirlces 0th indecy is first circle correlating to first player
		static boolean you;
		static private int turn = 0; // whose turn it is 0 means it is first players turn
		
		//the buttons used
			static Button infos = new Button("information");
			static Button buy = new Button("Buy");
			static Button endturn = new Button("endturn");
			static Button build = new Button("Build House");
			static Button random = new Button("Random");
			static Button roll = new Button("Roll Dice");
			static Button a = new Button("Go          ");
			static Button b = new Button("Property 1 ");
			static Button c = new Button("Property 2 ");
			static Button d = new Button("Property 3 ");
			static Button e = new Button("Property 4 ");
			static Button f = new Button("Random 1   ");
			static Button g = new Button("Property 6 ");
			static Button h = new Button("Property 7 ");
			static Button i = new Button("Property 8 ");
			static Button j = new Button("Property 9 ");
			static Button k = new Button("Jail        ");
			static Button l = new Button("Property 11");
			static Button m = new Button("Property 12");
			static Button n = new Button("Property 13");
			static Button o = new Button("Property 14");
			static Button p = new Button("Random 2    ");
			static Button q = new Button("Property 16");
			static Button r = new Button("Property 17");
			static Button s = new Button("Property 18");
			static Button t = new Button("Property 19");
			static Circle circle = new Circle();
			static Circle circle2 = new Circle();
			static Circle circle3 = new Circle();
			static Circle circle4 = new Circle();
			
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
	circle3.setFill(Color.GREEN);
	circle4.setFill(Color.GOLD);

	//setting circles radiuses
	circle.setRadius(5);
	circle2.setRadius(5);
	circle3.setRadius(5);
	circle4.setRadius(5);
	
	// the gridpane I used
	GridPane alskf = new GridPane();
	
	//gonna be in the center
	alskf.setAlignment(Pos.CENTER);
	
	//spacing between the objects is 10
	alskf.setHgap(10);
	alskf.setVgap(10);
	
	//information label and text settings
	Label info = new Label("Information");
	alskf.add(info, 10, 8);
	TextField infoTextField = new TextField();
	infoTextField.setPrefSize(800, infoHeight);
	alskf.add(infoTextField, 12, 9);
	
	
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
//		    	printMessage.setFill(Color.FIREBRICK);
//		        printMessage.setText("Go button was pressed. Hurray!");
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
		        infoTextField.setText("Property 11: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		m.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("Property 12: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		n.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("Property 13: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		o.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("Property 14: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
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
		        infoTextField.setText("Property 16: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		r.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("Property 17: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		s.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("Property 18: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		t.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) {
		        infoTextField.setText("Property 19: This property can be sold if you own it and bought if no one owns it, the cost is $200 and the rent is $150");
		        
		    }
		});
		
		// moves a players circle relative to the map depending on whose turn it is
		roll.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		    	int newroll = Services.locationUpdate(align.get(turn));
		    	infoTextField.setText(turn + " Congrats, you rolled a " + newroll);
		    	align.get(turn).setLocation(align.get(turn).getLocation());
		    	alskf.add(circs.get(turn), change.changex(align.get(turn).getLocation()), change.changey(align.get(turn).getLocation()));
		    	
		    }
		});
		buy.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
				int location=align.get(turn).getLocation();
				int money = align.get(turn).getMoney();
				if (align.get(turn).getMoney()>=200) {
					properties.get(location).setOwner(align.get(turn).getPlayerNumber());
					money-=200;
					align.get(turn).setMoney(money);
			    	infoTextField.setText("Congrats you bought it!");
				}else {
			    	infoTextField.setText("Sorry you dont have enought money");
			    	}
				setColor();
		    	
		    }
		});
		endturn.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		    	int a = turn + 1;
		    	int newturn = a%4;
		    	turn = newturn;
		    	infoTextField.setText("you have ended your turn its now player" + turn + "'s turn");
		    	setColor();
		    }
		});
		infos.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		    	infoTextField.setText("Player name: " + align.get(turn).getPlayerName());
		    	infoTextField.setText("Player number: " + align.get(turn).getPlayerNumber());
		    	infoTextField.setText("Player location: " + align.get(turn).getLocation());
		    	infoTextField.setText("Player money: " + align.get(turn).getMoney());
		    	infoTextField.setText("Player properties: " + align.get(turn).getProperties());
		    	
		    }
		});

		
		build.setOnAction(new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent e) {
		    	String text = Services.buildHouse(align.get(turn),properties);
		    	infoTextField.setText(text);
		    }
		});
		
		alskf.add(circle, change.changex(align.get(0).getLocation()), change.changey(align.get(0).getLocation()));
		alskf.add(circle2, change.changex(align.get(1).getLocation()), change.changey(align.get(1).getLocation()));
		alskf.add(circle3, change.changex(align.get(2).getLocation()), change.changey(align.get(2).getLocation()));
		alskf.add(circle4, change.changex(align.get(3).getLocation()), change.changey(align.get(3).getLocation()));
		

	
	//setting padding and adding buttons to the coordinates we want
		alskf.setPadding(new Insets (25, 25, 25, 25));
		alskf.add(infos, 13, 1);
		alskf.add(buy, 12, 1);
		alskf.add(endturn, 11, 1);
		alskf.add(build, 13, 2);
		alskf.add(roll, 11, 2);
		alskf.add(a, 1, 1,1,1);
		alskf.add(b, 2, 1,1,1);
		alskf.add(c, 3, 1,1,1);
		alskf.add(d, 4, 1,1,1);
		alskf.add(e, 5, 1,1,1);
		alskf.add(f, 6, 1,1,1);
		alskf.add(g, 6, 2,1,1);
		alskf.add(h, 6, 3,1,1);
		alskf.add(i, 6, 4,1,1);
		alskf.add(j, 6, 5,1,1);
		alskf.add(k, 6, 6,1,1);
		alskf.add(l, 5, 6,1,1);
		alskf.add(m, 4, 6,1,1);
		alskf.add(n, 3, 6,1,1);
		alskf.add(o, 2, 6,1,1);
		alskf.add(p, 1, 6,1,1);
		alskf.add(q, 1, 5,1,1);
		alskf.add(r, 1, 4,1,1);
		alskf.add(s, 1, 3,1,1);
		alskf.add(t, 1, 2,1,1);

		
		Scene a1 = new Scene(alskf,150,150);

		grid.setScene(a1);
		grid.setTitle("okay");

		grid.show();

	}


static ArrayList<Button> buttons = new ArrayList<Button>(); // arraylist for buttons



// colors the properties based on who owns them
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
		
launch(args);
}
}

