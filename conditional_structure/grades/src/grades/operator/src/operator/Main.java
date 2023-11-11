package operator;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type the minutes quantity: ");
		int minutes = scanner.nextInt();
		
		double value = 0;
		if( minutes <= 100) {
			value = 50.0;
		}else {
			value = 50 + 2 * (minutes - 100);
		}
		
		System.out.printf("Value to pay: R$ %.2f%n", value);
		
		scanner.close();

	}

}
