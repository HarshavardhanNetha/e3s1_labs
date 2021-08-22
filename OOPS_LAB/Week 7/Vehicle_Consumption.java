import java.util.*;
interface Vehicle {
  public void getColour(String a);
  public void getNumber(String b);
  public void getConsumption(float c, float m);
}
class Twowheeler implements Vehicle {
  public void getColour(String a) {
    System.out.println("Colour of a Two Wheeler is " + a);
  }
  public void getNumber(String b) {
    System.out.println("Model Number of a Two Wheeler is " + b);
  }
  public void getConsumption(float c, float m) {
    float cal = c / m;
    System.out.println("Fuel Consumption by Two Wheeler is " + cal + " litres");
  }
}
class Fourwheeler implements Vehicle {
  public void getColour(String a) {
    System.out.println("Colour of a Four Wheeler is " + a);
  }
  public void getNumber(String b) {
    System.out.println("Model Number of a four Wheeler is " + b);
  }
  public void getConsumption(float c, float m) {
    float cal = c / m;
    System.out.println("Fuel Consumption by four Wheeler is " + cal + " litres");
  }
}
class Vehicle_Consumption {
  public static void main(String agrs[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the colour of a two wheeler:");
    String a = in .nextLine();
    System.out.print("Enter the Model number of a two wheeler:");
    String b = in .nextLine();
    System.out.print("Enter the Distance travelled by a two wheeler in km:");
    float c = in .nextFloat();
    System.out.print("Enter the mileage of a two km/lit:");
    float m = in .nextFloat();
    Twowheeler tw = new Twowheeler();
    tw.getColour(a);
    tw.getNumber(b);
    tw.getConsumption(c, m);
    Scanner im = new Scanner(System.in);
    Fourwheeler fw = new Fourwheeler();
    System.out.print("Enter the colour of a four wheeler:");
    a = im.nextLine();
    System.out.print("Enter the Model number of a four wheeler:");
    b = im.nextLine();
    System.out.print("Enter the Distance travelled by a four wheeler in km:");
    c = im.nextFloat();
    System.out.print("Enter the mileage of a four wheeler km/lit:");
    m = im.nextFloat();
    fw.getColour(a);
    fw.getNumber(b);
    fw.getConsumption(c, m);
  }
}