import java.util.*;
abstract class Shapes {
  abstract void getArea();
  abstract void getVolume();
}
class Dimensions extends Shapes {
  Scanner scan = new Scanner(System.in);
  double side, radius;
  void getArea() {
    System.out.println("****AREA of SQUARE****");
    double Area_square, Area_circle;
    System.out.print("Enter the Side of a Square :");
    side = scan.nextDouble();
    Area_square = 4 * side;
    System.out.println("The Area of the Square is :" + Area_square);
    System.out.println("****AREA of CIRCLE****");
    System.out.print("Enter the radius of Circle :");
    radius = scan.nextDouble();
    Area_circle = 3.14 * radius * radius;
    System.out.println("The Area of the Circle is :" + Area_circle);
  }
  void getVolume() {
    System.out.println("****VOLUME of CUBE****");
    double Volume_cube, Volume_sphere;
    System.out.print("Enter the Side of a Cube :");
    side = scan.nextDouble();
    Volume_cube = side * side * side;
    System.out.println("The Volume of Cube is :" + Volume_cube);
    System.out.println("****VOLUME of SPHERE****");
    System.out.print("Enter the radius of Sphere :");
    radius = scan.nextDouble();
    Volume_sphere = (4 * 3.14 * radius * radius * radius) / 3;
    System.out.println("The Volume of Sphere is :" + Volume_sphere);
  }
}
class Area_Abstract {
  public static void main(String[] args) {
    Dimensions obj = new Dimensions();
    obj.getArea();
    obj.getVolume();
  }
}