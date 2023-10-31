package retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double base, altura, area, perimetro, diagonal;
		
		System.out.print("Base do retangulo: ");
		base = scanner.nextDouble();
		System.out.print("Altura do retangulo: ");
		altura = scanner.nextDouble();
		
		area = base * altura;
		perimetro = 2 * (base + altura);
		diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
		
		System.out.printf("Area = %.4f%n", area);
		System.out.printf("Perimetro = %.4f%n", perimetro);
		System.out.println("Diagonal = " + String.format("%.4f%n", diagonal));
		
		
		scanner.close();

	}

}
