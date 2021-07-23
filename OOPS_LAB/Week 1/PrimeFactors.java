/*
Prime factors of a number
*/

import java.util.Scanner;

class PrimeFactors{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = input.nextInt();

		for(int i = 2 ; i < num; i++){
			while(num%i == 0){
				System.out.print(i + " ");
				num /= i;
			}
		}
		if(num >= 2){
			System.out.println(num);
		}
	}
}