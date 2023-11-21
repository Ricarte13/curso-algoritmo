package fuel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int gas = 0;
		int alcohol = 0;
		int diesel = 0;
		
		System.out.print("Type a code (1, 2, 3) or 4 to stop: ");
		int code = scanner.nextInt();
		
		while(code != 4) {
			if(code == 1) {
				alcohol = alcohol + 1;
			}else if(code == 2) {
				gas = gas + 1;
			}else if(code == 3) {
				diesel = diesel + 1;
			}
		System.out.print("Type a code (1, 2, 3) or 4 to stop: ");
		code = scanner.nextInt();
		}
		
		System.out.println("THANK YOU SO MUCH");
		
		System.out.println("Alcohol: " + alcohol);
		System.out.println("Gas: " + gas);
		System.out.println("Diesel: " + diesel);
		
		scanner.close();

	}

}
