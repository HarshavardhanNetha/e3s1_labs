/*
Sum and avg of 3 numbers
*/

import java.util.Scanner;

class SumAvg{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int i;
		for(i=0; i<3; i++){
			System.out.print("Enter number");
			int num = input.nextInt();
			sum+=num;
		}

		System.out.println("Sum: "+sum);
		System.out.println("Average: "+sum/i);
	}
}