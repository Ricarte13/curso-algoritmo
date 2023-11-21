package consecutive_evens;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type a integer: ");
		int x = scanner.nextInt();
		
		int sum = 0;
		while(x != 0) {
			if(x % 2 == 0) {
				sum = 5 * x + 20;
			}else {
				sum = 5 * x + 25;
			}
		System.out.println("SUM = " + sum);
		System.out.print("Type a integer: ");
		x = scanner.nextInt();
		}
		
		scanner.close();

	}

}
