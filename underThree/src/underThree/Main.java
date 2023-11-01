package underThree;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a, b, c, smaller ;
		
		System.out.print("First value: ");
		a = scanner.nextInt();
		System.out.print("Second value: ");
		b = scanner.nextInt();
		System.out.print("Third value: ");
		c = scanner.nextInt();
		
		if (a < b && a < c) {
			smaller = a;

		} else if (b < c) {
			smaller = b;
		}else {
			smaller = c;
		}
		
		System.out.println("Smaller = " + smaller);
		
		scanner.close();

	}

}
