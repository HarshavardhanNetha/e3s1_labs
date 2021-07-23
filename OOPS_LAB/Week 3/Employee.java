/*
Employee data based on his ID
*/

import java.util.Scanner;

class Employee{
	static	Scanner input = new Scanner(System.in);
	static Scanner inpStr = new Scanner(System.in);

	int emp_id;
	String emp_name;
	int emp_age;
	String emp_gender;
	String emp_designation;
	int emp_salary;
	String emp_address;

	void getEmpData(){
		System.out.print("Enter ID:");
		emp_id = input.nextInt();
		System.out.print("Enter name:");
		emp_name = inpStr.nextLine();
		System.out.print("Enter age:");
		emp_age = input.nextInt();
		System.out.print("Enter gender:");
		emp_gender = inpStr.nextLine();
	}

	void printEmpData(){
		System.out.println("Employee ID:"+emp_id);
		System.out.println("Employee Name:"+emp_name);
		System.out.println("Employee age:"+emp_age);
		System.out.println("Employee gender:"+emp_gender);
		System.out.println("Employee Designation:"+emp_designation);
		System.out.println("Employee Salary:"+emp_salary);
		System.out.println("Employee Address:"+emp_address);
		System.out.println();
	}

	public static void main(String[] args) {

		System.out.print("Enter number of employees:");
		int n = input.nextInt();

		Employee emp[] = new Employee[n];
		for(int i=0;i<n;i++){
			emp[i] = new Employee();
			emp[i].getEmpData();
		}

		System.out.print("Enter employee ID:");
		int temp = input.nextInt();

		int flag = 0;

		for(int i=0;i<n;i++){
			if(emp[i].emp_id==temp){
				emp[i].printEmpData();
				flag=1;
				break;
			}
		}
		if(flag==0){
			System.out.println("No Employee Found.");
		}
	}
}