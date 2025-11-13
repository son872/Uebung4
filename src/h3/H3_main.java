package h3;

public class H3_main {

	public static void main(String[] args) {
	float celsiusFloat = 14.2F, fahrenheitFloat = 70F;
	double celsiusDouble = 14.2, fahrenheitDouble = 69;
	
	fahrenheitFloat = celsiusFloat * 9/5 + 32;
	System.out.println(fahrenheitFloat);
	
	fahrenheitDouble = celsiusDouble * 9/5 + 32;
	System.out.println(fahrenheitDouble);
	

	}

}
