import java.util.*;
interface Fare {
  public void getAmount(int a);
}
class Bus implements Fare {
  public void getAmount(int a) {
    int fare = a * 10;
    System.out.println("Fare paid by bus is: " + fare);
  }
}
class Train implements Fare {
  public void getAmount(int a) {
    int fare = a * 5;
    System.out.println("Fare paid by train is: " + fare);
  }
}
class Fare_Paid {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    Scanner im = new Scanner(System.in);
    System.out.print("Enter the Distance to be travelled by Bus::");
    int a = in .nextInt();
    Bus b = new Bus();
    System.out.print("Enter the Distance to be travelled by Train::");
    Train t = new Train();
    a = im.nextInt();
    b.getAmount(a);
    t.getAmount(a);
  }
}