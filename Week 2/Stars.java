/*

input: 5

*
**
***
****
*****

    *
   **
  ***
 ****
*****

*/

import java.util.Scanner;

class Stars{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = input.nextInt();
		n+=1;
		for(int i = 0; i<n;i++){
			for(int j = 0; j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}

		int x = 1;

		for(int i = n-1; i>0;i--){
			for(int j = 1; j<i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<x+1;k++){
				System.out.print("*");
			}
			System.out.println("");
			x++;
		}
	}
}