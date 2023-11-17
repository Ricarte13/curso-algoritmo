package snack_bar;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Product code purchased: ");
		int code = scanner.nextInt();
		System.out.print("Quantity purchased: ");
		int quantity = scanner.nextInt();
		
//		double value;
//		if(code == 1) {
//			value = quantity * 5.0;
//		}else if(code == 2){
//			value = quantity * 3.5;
//		}else if(code == 3){
//			value = quantity * 4.80;
//		}else if(code == 4){
//			value = quantity * 8.90;
//		}else {
//			value = quantity * 7.32;
//		}
		double value = 0;
		switch(code) {
		case 1 :
			value = quantity * 5.0;
			break;
		case 2 :
			value = quantity * 5.0;
			break;
		case 3 :
			value = quantity * 5.0;
			break;
		case 4 :
			value = quantity * 5.0;
			break;
		case 5 :
			value = quantity * 5.0;
			break;
		default:
			System.out.println("Error");
			break;
		}
		
		System.out.println("Value to pay: R$" + String.format("%.2f", value) );
		
		scanner.close();

	}

}
