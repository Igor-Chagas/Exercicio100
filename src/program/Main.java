package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o numero de linhas e de colunas da matriz: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for (int i = 0; i < mat.length; i++) {
			System.out.print("Insira a linha " + i + " da matriz: ");
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();		
		System.out.print("Qual numero, pertencente a matriz, deseja escolher? ");
		int z = sc.nextInt();
		System.out.println();
		
		
		for (int i = 0; i < mat.length; i++) {
			for (int j =0; j < mat[i].length; j++) {				
				if (mat[i][j] == z) {
					System.out.printf("Position: %d, %d\n", i, j);
					if (j-1 >= 0 ) {
					System.out.printf("Left: %d\n", mat[i][j-1]);
					}
					if (j+1 < mat[i].length) {
					System.out.printf("Right: %d\n", mat[i][j+1]);
					}
					if (i-1 >= 0) {
					System.out.printf("Up: %d\n", mat[i-1][j]);
					}
					if (i+1 < mat.length) {
					System.out.printf("Down: %d\n", mat[i+1][j]);
					}
					System.out.println("-------------------------------------");
				}
			}
		}
		
		
		
		sc.close();
	}

}
