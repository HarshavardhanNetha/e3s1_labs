/*
Salary: given Hours and Pay
*/

import java.util.Scanner;

class Salary{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of hours:");
		int n = input.nextInt();
		System.out.print("Basic hourly pay:");
		int pay = input.nextInt();

		System.out.println("Salary = "+n*pay);
	}
}