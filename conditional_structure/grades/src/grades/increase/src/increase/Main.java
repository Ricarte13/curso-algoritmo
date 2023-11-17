package increase;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type the person´s salary: ");
		double salary = scanner.nextDouble();
		
		double increase = 0; 
		double newSalary;
		int percent;
		if(salary <= 1000.0) {
			newSalary = salary + 0.2 * salary;
			increase = newSalary - salary;
			percent = 20;
		}else if(salary <= 3000.0) {
			newSalary = salary + 0.15 * salary;
			increase = newSalary - salary;
			percent = 15;
		}else if(salary <= 8000.0) {
			newSalary = salary + 0.1 * salary;
			increase = newSalary - salary;
			percent = 10;
		}else {
			newSalary = salary + 0.05 * salary;
			increase = newSalary - salary;
			percent = 5;
		}
		
		System.out.printf("New salary = R$ %.2f%n", newSalary);
		System.out.printf("Increase = R$ %.2f%n", increase);
		System.out.printf("Percent = %d %% %n", percent);
		
		
		scanner.close();

	}

}
