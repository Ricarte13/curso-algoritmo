package multiple;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type two integers: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if(a % b == 0 || b % a == 0) {
			System.out.println("They are multiple");
		}else {
			System.out.println("They are not multiple");
		}
		
		scanner.close();

	}

}
