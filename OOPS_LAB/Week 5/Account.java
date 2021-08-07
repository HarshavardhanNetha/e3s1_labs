/*
Balance credit debit
*/

import java.util.Scanner;

class Account{

	Scanner inp = new Scanner(System.in);

	double balance;

	//constructor same name as class
	Account(){
		balance = 100;
		System.out.println("Account created with Initial Balance 100/-");
	}
	void creditBal(){
		System.out.print("Enter Credit Amount:");
		double b = inp.nextDouble();

		balance+=b;
		System.out.println("Credit Successful.\nUpdated Balance:"+balance);
	}
	void debitBal(){
		System.out.print("Enter Debit Amount:");
		double b = inp.nextDouble();

		if(balance>=b){
			balance-=b;
			System.out.println("Withdraw Successful.\nBalance:"+balance);
		}
		else{
			System.out.println("No enough balance.");
		}
	}
	void dispalyBal(){
		System.out.println("Balance:"+balance);
	}
}

class CreateAccount{
	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.dispalyBal();
		acc1.creditBal();
		acc1.debitBal();
	}
}