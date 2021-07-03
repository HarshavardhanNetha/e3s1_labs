/*
Plindrome or not
*/

import java.util.Scanner;

class Polindrome{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number:");
		int a = input.nextInt();
		int x = a;
		int temp = 0;
		while(a>0){
			int mod = a%10;
			temp = (temp * 10) + mod;
			a/=10;
		}
		if(temp == x)
			System.out.println("Polindrome");
		else
			System.out.println("Not a polindrome");
	}
}