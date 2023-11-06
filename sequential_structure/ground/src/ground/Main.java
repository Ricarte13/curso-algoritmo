package ground;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double width, height, meter, area, price;
		
		System.out.print("Type the ground width: ");
		width = scanner.nextDouble();
		System.out.print("Type the height ground: ");
		height = scanner.nextDouble();		
		System.out.print("Type the square meter value: ");
		meter = scanner.nextDouble();
		
		area = width * height;
		System.out.println("Ground area = " + String.format("%.2f", area));
		
		price = meter * area;
		
		System.out.printf("Ground price = %.2f%n", price);
		
		scanner.close();

	}

}
