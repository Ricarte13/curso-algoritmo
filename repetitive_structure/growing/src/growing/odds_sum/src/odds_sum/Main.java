package odds_sum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type two numbers: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		int change;
		if( x > y) {
			change = x;
			x = y;
			y = change;
		}
		
		int sum = 0;
		for(int i = x + 1; i < y; i++) {
			if(i % 2 != 0) {
				sum = sum + i;
			}
		}
		
		System.out.println("ODDS SUM = " + sum);
		
		scanner.close();

	}

}
