package vector_sum;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double sum, avarage;
		
		System.out.print("How many numbers will you tapying? ");
		int n = scanner.nextInt();
		
		Double[] number = new Double[n];
		
		
		for(int i = 0; i < n; i++) {
			System.out.print("Type one number: ");
			number[i] = scanner.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALUES = ");
		
		for(int i = 0; i < n; i++) {
			System.out.print(String.format("%.1f ", number[i]));
		}
		System.out.println();
		
		sum = 0;
		for(int i = 0; i < n; i++) {
			sum = sum + number[i];
		}
		System.out.println("SUM = " + String.format("%.2f", sum));
		
		avarage = sum / n;
		System.out.println("AVARAGE = " + String.format("%.2f", avarage));
		
		scanner.close();
	}

}
