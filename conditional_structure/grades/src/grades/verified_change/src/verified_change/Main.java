package verified_change;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Unit product price: ");
		double price = scanner.nextDouble();
		System.out.print("Quantity purchased: ");
		int quantity = scanner.nextInt();
		System.out.print("Money received: ");
		double money = scanner.nextDouble();
		
		double total = price * quantity;
		if(money < total) {
			double remaining = total - money;
			System.out.println("Insufficient money. It is missing " + String.format("%.2f", remaining) + " BRL");
		}else {
			double change = money - total;
			System.out.println("Change = " + String.format("%.2f", change));
		}
		
		
		
		scanner.close();

	}

}
