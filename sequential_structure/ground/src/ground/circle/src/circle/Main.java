package circle;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double area;
		
		System.out.print("Type the circle radius value: ");
		double r = scanner.nextDouble();
		
		area = Math.PI *(Math.pow(r, 2));
		
		System.out.printf("AREA = %.3f%n", area);
		
		scanner.close();

	}

}
