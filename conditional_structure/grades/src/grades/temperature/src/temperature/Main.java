package temperature;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What scale will you type the temperature on(C/F)? ");
		char temperature = scanner.next().charAt(0);
		
		if( temperature == 'F') {
			System.out.print("Type the temperature in Fahrenheit: ");
			double fahrenheit = scanner.nextDouble();
			double celsius = 5 * (fahrenheit - 32) / 9;
			System.out.println("Equivalent temperature in Celsius: " + String.format("%.2f", celsius));
		}else if( temperature == 'C') {
			System.out.print("Type the temperature in Celsius: ");
			double celsius = scanner.nextDouble();
			double fahrenheit = (9 * celsius + 160) / 5;
			System.out.println("Equivalent temperature in Fahrenheit: " + String.format("%.2f", fahrenheit));
		}
	}

}
