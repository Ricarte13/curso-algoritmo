package negative_diagonal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int n, quantity;
		
		System.out.print("What is the matrix order? ");
		n = scanner.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("Element [" + i + "," + j + "]: ");
				mat[i][j] = scanner.nextInt();
			}
			
		}
		
		System.out.println("MAIN DIAGONAL: ");
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if( i == j) {
					 System.out.print(mat[i][j] + " ");
				}
			}
		}
		System.out.println();
		
		quantity = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if( mat[i][j] < 0) {
					 quantity = quantity + 1;
				}
			}
		}
		
		System.out.println("NUMBER OF NEGATIVES = " + quantity );
		
		
		
		scanner.close();

	}

}
