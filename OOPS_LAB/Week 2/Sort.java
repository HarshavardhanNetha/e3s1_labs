/*
Sort an integer array
*/

import java.util.Scanner;

class Sort{
	public static void main(String[] args) {		
		int[] a = new int[20];
		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of array:");
		int n = input.nextInt();
		
		System.out.print("Enter array:");
		
		for(int i=0;i<n;i++){
			int x = input.nextInt();
			a[i] = x;
			System.out.print(a[i]+" ");
		}

		System.out.println();

		int min;
		int point = 0;

		while(point<=n){

			min = a[point];
			int temp = min;
			for(int j=point+1;j<n;j++){
				if(min>a[j]){
					min=a[j];
					a[j]=temp;
					temp = min;
				}
			}
			a[point]=min;
			point++;
		}

		System.out.print("Sorted Array:");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}