package grade_validation;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type the first grade: ");
		double firstGrade = scanner.nextDouble();
		
		while(firstGrade < 0 || firstGrade > 10) {
			System.out.print("Invalid value! Type the first grade: ");
			firstGrade = scanner.nextDouble();
		}
		System.out.print("Type the second grade: ");
		double secondGrade = scanner.nextDouble();
		
		while(secondGrade < 0 || secondGrade > 10) {
			System.out.print("Invalid Value! Type the second grade: ");
			secondGrade = scanner.nextDouble();
		}
		
		double average = (firstGrade + secondGrade) / 2;
		System.out.printf("AVERAGE = %.2f%n", average);
		
		scanner.close();
	}

}
