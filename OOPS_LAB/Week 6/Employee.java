/*
Employee sub and super
*/

import java.util.*;
class Employee {
  String FirstName, LastName;
  public void getFirstName(String FirstName) {
    this.FirstName = FirstName;
  }
  public void getLastName(String LastName) {
    this.LastName = LastName;
  }
}
class Contract_Employee extends Employee {
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
class Regular_Employee extends Employee {
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
class Employee_Details {
  public static void main(String args[]) {
	  int op;
	  double slry;
	  String fname, lname, dept, desgn;
	  Scanner scan = new Scanner(System.in);
	  do {
        System.out.println("1 to enter Contract_Employee Details\n2 to enter Regular_Employee Details\n3 to exit\nEnter your option ");
	      op = scan.nextInt();
	      switch (op) {
	      case 1:
	        Contract_Employee emp1 = new
	        Contract_Employee();
	        System.out.println("Enter the FirstName, LastName, salary, designation and department ");
	          fname = scan.next(); lname = scan.next(); slry = scan.nextDouble(); dept = scan.next(); desgn = scan.next(); emp1.getFirstName(fname); emp1.getLastName(lname); emp1.getDepartment(dept); emp1.getDesgnation(desgn); emp1.DisplayFullName(); emp1.display_details(slry);
	          break;
	          case 2:
	          Regular_Employee emp2 = new Regular_Employee(); System.out.println("Enter the FirstName, LastName, salary, designation and department ");
	            fname = scan.next(); lname = scan.next(); slry = scan.nextDouble(); dept = scan.next(); desgn = scan.next(); emp2.getFirstName(fname); emp2.getLastName(lname); emp2.getDepartment(dept); emp2.getDesgnation(desgn); emp2.DisplayFullName(); emp2.display_details(slry);
	            break;
	            case 3:
	            break;
	            default:
	            System.out.println("Invcalid option");
	            break;
	          }
	        }
        while (op != 3);
	}
}