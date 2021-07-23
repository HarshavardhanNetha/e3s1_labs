/*
Quadratic equation
*/

import java.util.Scanner;
import java.lang.Math;

class QuadraticEq{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a:");
		int a = input.nextInt();
		System.out.print("Enter b:");
		int b = input.nextInt();
		System.out.print("Enter c:");
		int c = input.nextInt();

		System.out.printf("Given equation: %d x^2 + %d x + %d\n",a,b,c);

		//finding determinant
		double d = (b*b) - 4*a*c;

		System.out.println("Value of determinant:"+d);

		if(d>0){
			System.out.println("Roots are real and distinct.");
		}
		else if(d==0){
			System.out.println("Roots are real and equal.");
		}
		else {
			System.out.println("Roots are imaginary");
		}
		//(double)d = d;

		double sq = Math.sqrt(Math.abs(d));
		System.out.println(sq);

		if(d>=0){
			double x1 = (-b + sq ) / 2*a;
			double x2 = (-b - sq ) / 2*a;

			System.out.printf("X1: %f\nX2: %f\n",x1,x2);
		}
		else{
			double val = (-(double)b)/(2*a);
			System.out.printf("X1: %f + i %f\nX2: %f - i %f",val,sq,val,sq);
		}
	}
}