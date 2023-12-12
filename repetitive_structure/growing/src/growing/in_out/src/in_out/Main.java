package in_out;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many numbers will you type? ");
		int n = scanner.nextInt();
		
		int in = 0;
		int out = 0;
		for(int i = 0; i < n; i++) {
			System.out.print("Type a number: ");
			int number = scanner.nextInt();
			if(number >= 10 && number <= 20) {
				in = in + 1;
			}else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " IN");
		System.out.println(out + " OUT");
		
		scanner.close();

	}

}
