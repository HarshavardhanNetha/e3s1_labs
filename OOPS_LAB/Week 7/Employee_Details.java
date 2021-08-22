import java.util.*;
class Employee_Details {
  public static void main(String[] args) {
    Weekly_Employee emp1 = new Weekly_Employee();
    emp1.getAmount();
    Hourly_Employee emp2 = new Hourly_Employee();
    emp2.getAmount();
  }
}
abstract class Employee {
  abstract void getAmount();
}
class Hourly_Employee extends Employee {
  void getAmount() {
    Scanner scan = new Scanner(System.in);
    int no_of_hrs, total_hrs, total_amount;
    System.out.print("Enter the number of hours working per day :");
    no_of_hrs = scan.nextInt();
    total_hrs = 30 * no_of_hrs;
    System.out.println("The total number of hours worked in a 30days are :" + total_hrs);
    System.out.println("The amount given per an hour is :" + 100 + "Rs");
    total_amount = total_hrs * 100;
    System.out.println("The total amount to be paid is :" + total_amount);
  }
}
class Weekly_Employee extends Employee {
  void getAmount() {
    Scanner scan = new Scanner(System.in);
    int no_of_weeks, total_amount;
    System.out.print("Enter the number of weeks ");
    no_of_weeks = scan.nextInt();
    total_amount = no_of_weeks * 4500;
    System.out.println("The total amount to be paid is" + total_amount);
  }
}