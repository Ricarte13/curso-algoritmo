package change;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Unity price product: ");
		double price = scanner.nextDouble();
		System.out.print("Quantity purchased: ");
		int quantity = scanner.nextInt();
		System.out.print("Payment received: ");
		double payment = scanner.nextDouble();
		
		double change = payment -  (price * quantity);
		
		System.out.println("CHANGE = " + String.format("%.2f", change));
		
		scanner.close();
		
	}

}
