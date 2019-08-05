
import javafx.application.Application;
	import javafx.stage.Stage;
	import javafx.scene.Scene;
	import javafx.scene.control.*;
	import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
	import javafx.scene.*;
	import javafx.stage.*;

import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.*;
	public class okay extends Application {
		static ArrayList<Player> align = InitialList.playersList();
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
@Override
	public void start(Stage grid) throws Exception {
		GridPane alskf = new GridPane();

		alskf.add(a, 0, 0,1,1);
		alskf.add(b, 0, 1,1,1);
		alskf.add(c, 0, 2,1,1);
		alskf.add(d, 0, 3,1,1);
		alskf.add(e, 0, 4,1,1);
		alskf.add(f, 0, 5,1,1);
		alskf.add(g, 1, 5,1,1);
		alskf.add(h, 2, 5,1,1);
		alskf.add(i, 3, 5,1,1);
		alskf.add(j, 4, 5,1,1);
		alskf.add(k, 5, 5,1,1);
		alskf.add(l, 5, 4,1,1);
		alskf.add(m, 5, 3,1,1);
		alskf.add(n, 5, 2,1,1);
		alskf.add(o, 5, 1,1,1);
		alskf.add(p, 5, 0,1,1);
		alskf.add(q, 4, 0,1,1);
		alskf.add(r, 3, 0,1,1);
		alskf.add(s, 2, 0,1,1);
		alskf.add(t, 1, 0,1,1);

		
		Scene a1 = new Scene(alskf,150,150);
		grid.setScene(a1);
		grid.setTitle("okay");
		grid.show();
	}
static ArrayList<Button> buttons = new ArrayList<Button>();
static ArrayList<String> ognames = new ArrayList<String>();
public static void setLocation() {
	for(Player a : align) {
		String b = buttons.get(a.getLocation()).getText();
		buttons.get(a.getLocation()).setText(b + " " + a.getPlayerNumber());
	}
}
public void correctLocation() {
	for(int a = 0; a< 20; a++) {
		buttons.get(a).setText(ognames.get(a));
	}
}
public void setColor() {
	for(Property a : InitialList.propertiesList()) {
		if(a.getOwner() == 0) {
			buttons.get(a.getPosition()).setTextFill(Color.RED);
		}
		if(a.getOwner() == 1) {
			buttons.get(a.getPosition()).setTextFill(Color.ALICEBLUE);
		}
		if(a.getOwner() == 2) {
			buttons.get(a.getPosition()).setTextFill(Color.ANTIQUEWHITE);
		}
		if(a.getOwner() == 3) {
			buttons.get(a.getPosition()).setTextFill(Color.BEIGE);
		}
		if(a.getOwner() == 0) {
			buttons.get(a.getPosition()).setTextFill(Color.ANTIQUEWHITE);
		}
	}
}
	public static void main(String[] args) {
		
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

//		setLocation();
		for(Player a : align) {
			String b = buttons.get(a.getLocation()).getText();
			buttons.get(a.getLocation()).setText(b + " " + a.getPlayerName());
			System.out.println(a.getLocation());
		}

		launch(args);

	}
	}


