package factorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type N value: ");
		int n = scanner.nextInt();
		
		int factorial = 1;
		for(int i = 1; i <= n; i++) {
			factorial = factorial * (i);
		}
		
		System.out.printf("FACTORIAL = %d%n", factorial);
		
		scanner.close();

	}

}
