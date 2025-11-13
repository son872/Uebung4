package h2;

public class H2_main {

	public static void main(String[] args) {
	boolean x,y = true;
	boolean a,b,c = false;
	int input = 11;
	
	x = false;
	y = false;
	a = false;
	b = false;
	c = false;
	
	switch (input) {
	case 0:
		x = false;
		y = false;
		c = true;
		break;
	case 1:
		x = false;
		y = true;
		b = true;
		c = false;
		break;
	case 10:
		x = true;
		y = false;
		b = true;
	    c = true;
		break;	
	case 11:
		x = true;
		y = true;
		a = true;
		b = true;
		c = false;
		break;	
	}
	
	System.out.println(a+" "+b+" "+c+" "+x+" "+y+" ");
	

	}

}
