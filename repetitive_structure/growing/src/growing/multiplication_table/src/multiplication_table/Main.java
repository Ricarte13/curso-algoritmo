package multiplication_table;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Would you like what value for the multiplication table? ");
		int n = scanner.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			int result = n * i;
			System.out.println(n + " X " + i + " = " + result);
		}
		
		
		
		
		scanner.close();
	}

}
