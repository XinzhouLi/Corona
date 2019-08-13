
public class change {
public static int changeX(int a) {
	int b = a + 1;
	int c = 0;
	int d = 0;
	if(b <= 6){
		c = b;
		d = 0;
	}
	if(b <= 11 && b > 6) {
		c = 7;
		d = b - 5;

	}
	if(b <= 16 && b > 11) {
		c = 17 - b;
		d = 7;
	}
	if(b <= 20 && b > 16) {
		c = 0;
		d = 22 - b;
	}
	c = c;
	d = d;
	return c;

}
public static int changeY(int a) {
	int b = a + 1;
	int c = 0;
	int d = 0;
	if(b <= 6) {
		c = b;
		d = 0;
	}
	if(b <= 11 && b > 6) {
		c = 7;
		d = b - 5;
	}
	if(b <= 16 && b > 11) {
		c = 17 - b;
		d = 7;
	}
	if(b <= 20 && b >16) {
		c = 0;
		d = 22 - b;
	}
	
	c = c;
	d = d;
	return d;
}
}
