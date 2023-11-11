package bhaskara;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Coefficient A: ");
		double a = scanner.nextDouble();
		System.out.print("Coefficient B: ");
		double b = scanner.nextDouble();
		System.out.print("Coefficient C: ");
		double c = scanner.nextDouble();
		
		double delta = Math.pow(b, 2) - 4 * a * c;
		
		if(delta < 0 || a == 0) {
			System.out.println("This equation has no real roots");
		}else {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.printf("X1 = %.4f%n", x1);
			System.out.printf("X2 = %.4f%n", x2);
		}
		
		scanner.close();
	}

}
