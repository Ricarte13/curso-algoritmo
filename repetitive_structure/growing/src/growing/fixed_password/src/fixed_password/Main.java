package fixed_password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type your password: ");
		int password = scanner.nextInt();
		
		while(password != 2002) {
			System.out.print("Invalid password! Try again: ");
			password = scanner.nextInt();
		}
		 System.out.println("Access allowed!");
		scanner.close();

	}

}
