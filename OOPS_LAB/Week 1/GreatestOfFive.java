/*
Greatest and smallest amoung 5 numbers

String input = scanner.nextLine();    // get the entire line after the prompt 
String[] numbers = input.split(" "); // split by spaces

*/

import java.util.Scanner;

class Greatest{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int low = 9999;
		int high = -9999;

		for(int i = 0; i<5; i++){
			System.out.printf("Enter num %d:",i+1);
			int x = input.nextInt();

			if(x<low)
				low = x;
			if(x>high)
				high = x;
		}

		System.out.printf("Greatest: %d \nSmallest %d \n",high, low);
	}
}