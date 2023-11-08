package consumption;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Travelled distance: ");
		int distance = scanner.nextInt();
		System.out.print("Fuel spent: ");
		double fuel = scanner.nextDouble();
		
		double averageConsumption = distance / fuel;
		
		System.out.println("Avarage consumption = " + String.format("%.3f", averageConsumption));
		
		
		
		scanner.close();

	}

}
