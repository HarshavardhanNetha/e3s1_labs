/*
Linear search
*/

import java.util.Scanner;

class LinearSearch{
	public static void main(String[] args) {
		int[] a = new int[20];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length of array:");
		int n = input.nextInt();
		System.out.print("Enter array:");
		for(int i=0;i<n;i++){
			int x = input.nextInt();
			a[i] = x;
		}

		System.out.print("Enter what to search:");
		int find = input.nextInt();
		int flag=0;

		for(int i=0;i<n;i++){
			if(a[i]==find){
				System.out.println("Found at index:"+i);
				flag = 1;
				break;
			}
		}
		if(flag==0){
			System.out.println("Value not found.");
		}
	}
}