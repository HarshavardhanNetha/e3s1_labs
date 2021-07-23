/*
Binary search
*/

import java.util.Scanner;

class BinarySearch{
	public static void main(String[] args) {
		int[] a = new int[20];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length of array:");
		int n = input.nextInt();
		System.out.print("Enter sorted array:");
		for(int i=0;i<n;i++){
			int x = input.nextInt();
			a[i] = x;
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		System.out.print("Enter what to search:");
		int ele = input.nextInt();

		int flag=0;

		int index;
		int end = n;
		int start = 0;

		//System.out.println((start+end)/2);
		int r = 0;
		int half = (start+end)/2;

		while(r<half){
			int value = a[(start+end)/2];
			if(value == ele){
				flag=1;
				System.out.println("Found at: "+(start+end)/2);
				break;
			}
			else if(value<ele){
				//int dummy = end;
				start = (start+end)/2;
				r++;
			}
			else{
				//int dummy = start;
				end = (start+end)/2;
				r++;
			}
		}

		if(flag==0){
			System.out.println("Value not found.");
		}
	}
}