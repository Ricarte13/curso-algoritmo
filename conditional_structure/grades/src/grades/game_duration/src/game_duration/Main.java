package game_duration;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Start time: ");
		int start = scanner.nextInt();
		System.out.print("End time: ");
		int end = scanner.nextInt();
		
		int duration = 0;
		if(start > end) {
			duration = 24 - start + end;
		}else if( start < end) {
			duration = end - start;
		}else {
			duration = 24;
		}
				
		System.out.printf("The game lasted %d hour(s) %n", duration);		
		scanner.close();

	}

}
