/*
Calculator operations
*/

import java.util.Scanner;

class Calculator{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a:");
		int a = input.nextInt();
		System.out.print("Enter b:");
		int b = input.nextInt();
		int x = 0;
		do{
			System.out.print("\nEnter an option:\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Modulus\n6.Exit\nChoose:");
			x = input.nextInt();
			switch(x){
				case 1:
					System.out.printf("Addition: %d",a+b);
					break;
				case 2:
					System.out.printf("Subtraction: %d",a-b);
					break;
				case 3:
					System.out.printf("Multiply: %d",a*b);
					break;
				case 4:
					System.out.printf("Divide: %d",a/b);
					break;
				case 5:
					System.out.printf("Modulus: %d",a%b);
					break;
				case 6:
					break;
				default:
					System.out.println("Enter a valid option.");
			}
		}
		while(x!=6);
	}
}