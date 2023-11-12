package dart;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type the three distances: ");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		double far;
		
		if(a > b && a > c) {
			far = a;
		}else if(b > c) {
			far = b;
		}else {
			far = c;
		}
		
		System.out.println("Greatest distance = " + String.format("%.2f", far));
		
		scanner.close();

	}

}
