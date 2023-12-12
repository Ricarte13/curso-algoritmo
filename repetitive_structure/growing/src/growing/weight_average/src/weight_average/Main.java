package weight_average;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Hom many cases will you type?");
		int n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Type %d numbers: %n", n);
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			double c = scanner.nextDouble();
			double average = ( a * 2 + b * 3 + c * 5)  / 10;
			
			System.out.println("AVERAGE = " + String.format("%.1f", average));
		}
		
		scanner.close();

	}

}
