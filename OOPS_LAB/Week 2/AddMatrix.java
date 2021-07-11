/*
Add two matrices
*/

import java.util.Scanner;

class AddMatrix{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rows and cols: ");
		int row = input.nextInt();
		int col = input.nextInt();

		int[][] a = new int[row][col];
		int[][] b = new int[row][col];		

		System.out.println("Enter matrix one:");
		for(int i = 0;i<row;i++){
			for(int j=0;j<col;j++){
				int x = input.nextInt();
				a[i][j] = x;
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}

		System.out.println("Enter matrix two:");
		for(int i = 0;i<row;i++){
			for(int j=0;j<col;j++){
				int x = input.nextInt();
				b[i][j] = x;
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("Result Matrix:");
		for(int i = 0;i<row;i++){
			System.out.print("[ ");
			for(int j=0;j<col;j++){
				System.out.print(a[i][j]+b[i][j]+" ");
			}
			System.out.println("]");
		}
	}
}