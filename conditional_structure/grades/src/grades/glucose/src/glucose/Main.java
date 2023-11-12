package glucose;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type the glucose average: ");
		double glucose = scanner.nextDouble();
		
		if(glucose <= 100.0) {
			System.out.println("Classsification: normal");
		}else if( glucose <= 140.0) {
			System.out.println("Classsification: high");
		}else {
			System.out.println("Classsification: diabetes");
		}
		
		scanner.close();
	}

}
