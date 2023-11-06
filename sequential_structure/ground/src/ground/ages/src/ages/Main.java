package ages;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		String name1, name2;
		int age1, age2;
		double avarage;
		
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
		
		avarage = (double)(age1 + age2) / 2;
		
		System.out.println("The " + name1 + " and " + name2 + " avarage age is " + String.format("%.1f", avarage) + " years");
		
		
		
		
		
		
		scanner.close();
	}

}
