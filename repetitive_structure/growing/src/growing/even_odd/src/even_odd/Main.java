package even_odd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many numbers will you type? ");
		int n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Type a number: ");
			int number = scanner.nextInt();
			if(number % 2 != 0 && number < 0) {
				System.out.println("NEGATIVE ODD");
			}else if(number % 2 != 0) {
				System.out.println("POSITVE ODD");
			}else if(number % 2 == 0 && number < 0) {
				System.out.println("NEGATIVE EVEN");
			}else if(number % 2 == 0 && number > 0) {
				System.out.println("POSITIVE EVEN");
			}else {
				System.out.println("NULO");
			}
		}

				
		scanner.close();
	}

}
