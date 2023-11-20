package avarage_age;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type the ages: ");
		int age = scanner.nextInt();
		
		int sum = 0;
		double cont = 0;
		if (age > 0) {
			while (age >= 0) {
				sum = sum + age;
				cont = cont + 1;
				age = scanner.nextInt();	
			}
			double average = sum / cont;
			System.out.println("AVARAGE = " + String.format("%.2f", average));
			
		} else {
			System.out.println("IMPOSSIBLE TO CALCULATE");
		}

		scanner.close();

	}

}
