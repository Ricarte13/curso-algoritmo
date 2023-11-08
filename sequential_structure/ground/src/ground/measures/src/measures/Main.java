package measures;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type A measure: ");
		double a = scanner.nextDouble();
		System.out.print("Type B measure: ");
		double b = scanner.nextDouble();
		System.out.print("Type C measure: ");
		double c = scanner.nextDouble();
		
		double squareArea = Math.pow(a, 2);
		double triangleArea = a * b / 2;
		double trapezeArea = (a + b) * c / 2;
		
		System.out.println("Square area = " + String.format("%.4f", squareArea));
		System.out.println("Triangle area = " + String.format("%.4f", triangleArea));
		System.out.println("Trapeze area = " + String.format("%.4f", trapezeArea));
				
				
		scanner.close();
	}

}
