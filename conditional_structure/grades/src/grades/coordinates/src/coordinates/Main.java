package coordinates;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("X value: ");
		double x = scanner.nextDouble();
		System.out.print("Y value: ");
		double y = scanner.nextDouble();
		
		if(x > 0 && y > 0) {
			System.out.println("Q1");
		}else if(x < 0 && y > 0) {
			System.out.println("Q2");
		}else if(x < 0 && y < 0) {
			System.out.println("Q3");
		}else if(x > 0 && y < 0) {
			System.out.println("Q4");
		}else if(x == 0 && y != 0){
			System.out.println("Y axis");
		}else if(x != 0 && y == 0 ){
			System.out.println("X axis");
		}else {
			System.out.println("Origin");
		}
		
		scanner.close();
	}

}
