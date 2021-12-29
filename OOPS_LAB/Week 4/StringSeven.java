import java.util.Scanner;

class StringSeven{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();

		int n = s1.length();

		for(int i=n-1; i>=0; i--){
			System.out.print(s1.charAt(i));
		}
		System.out.println();
	}
}