/*
Areas of shapes
*/

import java.util.Scanner;

class Area{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("\nArea:\n1.Circle\n2.Rectangle\n3.Right Triangle\n4.Sqaure\nEnter a choice:");
		int choice = input.nextInt();

		switch(choice){
			case 1:
				System.out.print("Enter value of radius:");
				int r = input.nextInt();
				System.out.println("Area of circle: "+3.14*r*r);
				break;
			case 2:
				System.out.print("Length:");
				int l = input.nextInt();
				System.out.print("Breadth:");
				int b = input.nextInt();
				System.out.println("Area of rectangle: "+l*b);
				break;
			case 3:
				System.out.print("Length: ");
				int ll = input.nextInt();
				System.out.print("Breadth:");
				int bb = input.nextInt();
				System.out.println("Area of Triangle (if forms): "+ 0.5* ll * bb);
				break;
			case 4:
				System.out.print("Length: ");
				int len = input.nextInt();
				System.out.println("Area of Square: "+ len*len);
		}

	}
}