package experiences;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in); 
		
		System.out.print("How many cases will be type? ");
		int n = scanner.nextInt();
		
		int mouse = 0;
		int frog = 0;
		int rabbit = 0;
		double total = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Quantity of guinea pigs: ");
			int guineaPigs = scanner.nextInt();
			System.out.print("Type of guinea pigs: ");
			char type = scanner.next().charAt(0);
			
			if(type == 'R') {
				rabbit = rabbit + guineaPigs;
			}else if(type == 'M') {
				mouse = mouse + guineaPigs;
			}else {
				frog = frog + guineaPigs;
			}
			total = total + guineaPigs;
		}
		
		double rabbitPercentage = rabbit * 100 / total;
		double mousePercentage = mouse * 100 / total;
		double frogPercentage = frog * 100 / total;
		
		System.out.println();
		System.out.println("Final report: ");
		System.out.println("Total: " + total + " guinea pigs");
		System.out.println("Total number of rabbits: " + rabbit);
		System.out.println("Total number of mice: " + mouse);
		System.out.println("Total number of frogs: " + frog);
		System.out.printf("Percentage of rabbits: %.2f%n", rabbitPercentage);
		System.out.printf("Percentage of mice: %.2f%n", mousePercentage);
		System.out.printf("Percentage of frogs: %.2f%n", frogPercentage);
			
		scanner.close();

	}

}
