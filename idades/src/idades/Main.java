package idades;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		String name1, name2;
		Integer age1, age2;
		Double average;
		
		System.out.println("First person data: ");
		System.out.print("Name: ");
		name1 = scanner.nextLine();
		System.out.print("Age: ");
		age1 = scanner.nextInt();
		
		System.out.println("Second person data: ");
		
		System.out.print("Name: ");
		scanner.nextLine();
		name2 = scanner.nextLine();
		System.out.print("Age: ");
		age2 = scanner.nextInt();
		
		average = (double)(age1 + age2) / 2.0;
		
		System.out.println("The avarage age of " + name1 + " and " + name2 + " is " + String.format("%.1f", average) + " years");
		
		scanner.close();
	}

}
