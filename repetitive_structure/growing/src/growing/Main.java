package growing;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type two numbers: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		while( x != y) {
			if(x < y) {
				System.out.println("GROWING!");
			}else{
			System.out.println("DECREASING!");
		}
		
		System.out.println("Type two numbers: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		}
		
		scanner.close();

	}

}
