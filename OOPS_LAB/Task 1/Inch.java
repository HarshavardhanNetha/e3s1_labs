/*
Inch to cm conversion
*/

import java.util.Scanner;

class Inch{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a = input.nextInt();

		System.out.printf("%d Inch = %f cm",a,a*2.54);
	}
}