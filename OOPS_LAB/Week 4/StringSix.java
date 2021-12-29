//length of a string

import java.util.Scanner;

class StringSix{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();

		//s1+="$";
		int x=0; //count

		char arr[] = s1.toCharArray();

		for(char c: arr)
			x+=1;
		
		System.out.println(x);
		//
	}
}