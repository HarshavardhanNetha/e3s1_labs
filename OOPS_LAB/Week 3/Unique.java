/*
5 inputs, print unique b/w 10 and 100 inclusive
*/

import java.util.Scanner;

class Unique{

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		

		int[] list = new int[10];


		int ind = -1;

		for(int i = 0;i<5;i++){
			System.out.println("Enter a number:");
			int num = input.nextInt();

			if(num<10 || num>100){
				System.out.println("Enter a valid number");
				break;
			}
			else{
				int flag = 0;
				for(int j = 0;j<i;j++){
					if(list[j]==num){
						flag=1;
						break;
					}
				}
				if(flag==0){
					ind++;
					list[ind]=num;
				}
			}

			print(ind,list);
		}
	}
	static void print(int indVal, int[] listArr){
		for(int x = 0; x<indVal+1;x++)
			System.out.print(listArr[x]+" ");
		System.out.println();
	}
}