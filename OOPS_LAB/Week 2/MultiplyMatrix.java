/*
Multiply two matrices
*/

import java.util.Scanner;

class MultiplyMatrix{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rows and cols of Matrix A: ");
		int row1 = input.nextInt();
		int col1 = input.nextInt();

		System.out.print("Enter rows and cols of Matrix A: ");
		int row2 = input.nextInt();
		int col2 = input.nextInt();

        if (row2 != col1) {
            System.out.println("\nMultiplication Not Possible");
            return;
        }

		int[][] a = new int[row1][col1];
		int[][] b = new int[row2][col2];		

		System.out.println("Enter matrix one:");
		for(int i = 0;i<row1;i++){
			for(int j=0;j<col1;j++){
				int x = input.nextInt();
				a[i][j] = x;
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}

		System.out.println("Enter matrix two:");
		for(int i = 0;i<row2;i++){
			for(int j=0;j<col2;j++){
				int x = input.nextInt();
				b[i][j] = x;
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("Result Matrix:");

        int c[][] = new int[row1][col2];
  
        // Multiply the two marices
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++)
                    c[i][j] += a[i][k] * b[k][j];
            }
        }

		for(int i = 0;i<row1;i++){
			System.out.print("[ ");
			for(int j=0;j<col2;j++){
				System.out.print(c[i][j]+ " ");
			}
			System.out.println("]");
		}
	}
}