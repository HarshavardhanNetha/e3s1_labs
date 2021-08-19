import java.util.*;
class Emp{
  String FirstName, LastName;
  public void getFirstName(String FirstName) {
    this.FirstName = FirstName;
  }
  public void getLastName(String LastName) {
    this.LastName = LastName;
  }
}
class Contract_Emp extends Emp {
  String Department, Designation;
  public void DisplayFullName() {
    System.out.println("The full name is: " + this.FirstName + " . " + this.LastName);
  }
  public void getDepartment(String Department) {
    this.Department = Department;
  }
  public void getDesgnation(String Designation) {
    this.Designation = Designation;
  }
  public void display_details(double salary) {
    System.out.println("The Department is : " + Department);
    System.out.println("The Designation is : " + Designation);
    System.out.println("The Salary is:" + salary);
  }
}
class Hourly_Emp extends Contract_Emp {
  int no_of_hours;
  final int wage_per_hour = 200;
  void Calculate_Wages(int no_of_hours) {
    double Salary = (no_of_hours * wage_per_hour) * 30;
    System.out.println("The salary is: " + Salary);
    //calculated no. of hours working daily for 30 days.
  }
}
class Weekly_Emp extends Contract_Emp {
  int no_of_weeks;
  final int wage_per_week = 1500;
  void Calculate_Wages(int no_of_weeks) {
    double Salary = (no_of_weeks * wage_per_week);
    System.out.println("The salary is: " + Salary);
  }
}
class Regular_Emp extends Emp {
  String Department, Designation;
  public void DisplayFullName() {
    System.out.println("The full name is" + this.FirstName + " " + this.LastName);
  }
  public void getDepartment(String Department) {
    this.Department = Department;
  }
  public void getDesgnation(String Designation) {
    this.Designation = Designation;
  }
  public void display_details(double salary) {
    System.out.println("Department: " + Department);
    System.out.println("Designation: " + Designation);
    System.out.println("Salary is:" + salary);
  }
}
class Emp_Details_DetailContract {
  public static void main(String args[]) {
    int op;
    double slry;
    String fname, lname, dept, desgn;
    int hrs, weeks;
    Scanner scan = new Scanner(System.in);
    do {
      System.out.println("1 to enter Hourly_Contract_Emp Details\n2 to enter weekly_Contract_Emp Details \n3 to enter Regular_Emp Details \n 4 to exit \nEnter your option");
      op = scan.nextInt();
      switch (op) {
      case 1:
        Hourly_Emp emp1 = new Hourly_Emp();
        System.out.println("Enter the FirstName,LastName,salary,designation and department, and no.of Hours working in a day");
        fname = scan.next();
        lname = scan.next();
        slry = scan.nextDouble();
        dept = scan.next();
        desgn = scan.next();
        hrs = scan.nextInt();
        emp1.getFirstName(fname);
        emp1.getLastName(lname);
        emp1.getDepartment(dept);
        emp1.getDesgnation(desgn);
        emp1.DisplayFullName();
        emp1.display_details(slry);
        emp1.Calculate_Wages(hrs);
        break;
      case 2:
        Weekly_Emp emp2 = new Weekly_Emp();
        System.out.println("Enter the FirstName,LastName,salary,designation and department and no of weeks work in a month");
        fname = scan.next();
        lname = scan.next();
        slry = scan.nextDouble();
        dept = scan.next();
        desgn = scan.next();
        weeks = scan.nextInt();
        emp2.getFirstName(fname);
        emp2.getLastName(lname);
        emp2.getDepartment(dept);
        emp2.getDesgnation(desgn);
        emp2.DisplayFullName();
        emp2.display_details(slry);
        emp2.Calculate_Wages(weeks);
        break;
      case 3:
        Regular_Emp emp3 = new Regular_Emp();
        System.out.println("Enter the FirstName,LastName,salary,designation and department");
        fname = scan.next();
        lname = scan.next();
        slry = scan.nextDouble();
        dept = scan.next();
        desgn = scan.next();
        emp3.getFirstName(fname);
        emp3.getLastName(lname);
        emp3.getDepartment(dept);
        emp3.getDesgnation(desgn);
        emp3.DisplayFullName();
        emp3.display_details(slry);
        break;
      case 4:
        break;
      default:
        System.out.println("Invcalid option");
        break;
      }
    } while (op != 4);
  }
}