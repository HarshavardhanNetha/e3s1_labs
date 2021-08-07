/*
Areas using polymorphism
*/

import java.util.Scanner;

class AreaPoly{
	void areaOf(int a){
		System.out.println("Area of square:"+a*a);
	}
	void areaOf(int a, int b){
		System.out.println("Area of rectangle:"+a*b);
	}
	void areaOf(double a){
		System.out.println("Area of circle:"+3.14*a*a);
	}
}

class Poly{
	public static void main(String[] args) {
		AreaPoly a = new AreaPoly();
		a.areaOf(10);
		a.areaOf(10.0);
		a.areaOf(10,20);
	}
}