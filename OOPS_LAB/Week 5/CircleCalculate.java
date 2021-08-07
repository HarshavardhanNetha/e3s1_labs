/*
User input, circleArea circlePerimeter method
*/

import java.util.Scanner;

class Circle{

  final double PI = 3.14;

  double circleArea(double r){
    double ar = PI*r*r;
    return ar;
  }

  double circlePerimeter(double r){
    double pr = 2*PI*r;
    return pr;
  }

}

class Calculate{

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter Radius:");
    double radius = inp.nextDouble();

    Circle c = new Circle();
    double area = c.circleArea(radius);
    double perimeter = c.circlePerimeter(radius);

    System.out.println("Area:"+area+"\nPerimeter:"+perimeter);

  }

}
