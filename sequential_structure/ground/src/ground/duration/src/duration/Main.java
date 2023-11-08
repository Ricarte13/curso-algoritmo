package duration;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type the duration in duration: ");
		int duration = scanner.nextInt();
		
		int hours = duration / 3600;
		int minutes = duration % 3600 / 60;
		int seconds = duration % 60;
		
		System.out.println(hours + ":" + minutes + ":" + seconds);
		
		
		
		
		scanner.close();

	}

}
