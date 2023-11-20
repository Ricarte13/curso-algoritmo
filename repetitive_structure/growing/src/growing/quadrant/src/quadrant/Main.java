package quadrant;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Type the X and Y coordinates value: ");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		while(x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("QUADRANT Q1");
			}else if(x < 0 && y > 0) {
				System.out.println("QUADRANT Q2");
			}else if(x < 0 && y < 0) {
				System.out.println("QUADRANT Q3");
			}else if(x > 0 && y < 0) {
				System.out.println("QUADRANT Q4");
			}
			
			System.out.println("Type the X and Y coordinates value: ");
			x = scanner.nextInt();
			y = scanner.nextInt();
		}
		scanner.close();
	}

}
