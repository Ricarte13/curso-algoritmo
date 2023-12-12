package division;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many cases will you type? ");
		int n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Type the numerator: ");
			double numerator = scanner.nextDouble();
			System.out.print("Type the denominator: ");
			double denominator = scanner.nextDouble();
			
			if(denominator == 0) {
				System.out.println("IMPOSSIBLE DIVISION: ");
			}else {
				double division = numerator / denominator;
				
				System.out.println("DIVISION = " + String.format("%.2f", division));
			}
		}
		
		scanner.close();

	}

}
