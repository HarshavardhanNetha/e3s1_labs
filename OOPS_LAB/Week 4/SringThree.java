import java.util.Scanner;

class SringThree{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string:");
		String s1 = input.nextLine();
		System.out.print("Enter any char to count occurences:");
		char s2 = input.next().charAt(0);

		int count=0;

		int size = s1.length();
		for(int i=0;i<size;i++){
			//if(s1[s1.indexOf(s1.indexOf[i])]==s2)
			if(s1.charAt(s1.indexOf(s1.charAt(i)))==s2)
				count++;
		}

		System.out.println(count);

	}
}