/*
Die Rollin attempts
*/

import java.util.Scanner;
import java.util.Random;

class Die{
	static Scanner input = new Scanner(System.in);
	static Random rand = new Random();


	static int generateRandomNumber(int min,int max){
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	public static void main(String[] args) {

		int min = 1;
		int max = 6;

		int successVals=0;

		for(int i = 0;i<10;i++){
			int a = generateRandomNumber(min,max);
			int b = generateRandomNumber(min,max);

			System.out.println(a+" "+b);

			if(a==b)
				successVals++;
		}
		System.out.println("Success Attemts:"+successVals);
	}

}
