package grades;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type the first grade: ");
		double n1 = scanner.nextDouble();
		System.out.print("Type the first grade: ");
		double n2 = scanner.nextDouble();
		
		double finalGrade = n1 + n2;
		System.out.println("FINAL GRADEs = " + String.format("%.1f", finalGrade));
		
		if(finalGrade < 60) {
			System.out.println("FAILED");
		}
		
		
		scanner.close();

	}

}
