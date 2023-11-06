package sum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x, y, sum;
		
		System.out.print("Type x value: ");
		x = scanner.nextInt();		
		System.out.print("Type y value: ");
		y = scanner.nextInt();	
		
		sum = x + y;
		
		System.out.println("SUM = " + sum);
		
		scanner.close();

	}

}
