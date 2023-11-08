package payment;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = scanner.nextLine();
		System.out.print("Value per hour: ");
		Double value = scanner.nextDouble();
		System.out.print("Worked hours: ");
		Integer hours = scanner.nextInt();
		
		Double payment = value * hours;
		
		System.out.printf("The payment to %s should be %.2f%n", name, payment);
		
		
		
		scanner.close();

	}

}
