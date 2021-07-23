/*
Library Books
*/

import java.util.Scanner;

class Books{
	String bookName;
	String bookAuthor;
	int bookCount;

	public void getData(String name, String auth, int count){
		bookName = name;
		bookAuthor = auth;
		bookCount = count;
	}

	public void printBookData(){
		System.out.println("Book Name:"+bookName);
		System.out.println("Book Author:"+bookAuthor);
		System.out.println("Book Count:"+bookCount);
		System.out.println();
	}

	public void sellBook(int count){
		if(count<bookCount){
			bookCount-=count;
			System.out.println("Thanks for the purchase.");
			System.out.println("Remaining Books: "+bookCount);
		}
		else{
			System.out.println("Not enough stock");
		}
	}

}

class Customers{
	int cID;
	String cName;
	String cAddr;

	public void getData(int cid, String cname, String caddr){
		cID = cid;
		cName = cname;
		cAddr = caddr;
	}

	public void printCustData(){
		System.out.println("Name: "+ cName);
		System.out.println("ID: "+ cID);
		System.out.println("Address: "+ cAddr);
		System.out.println();
	}

	/*
	public void getBook(String name, int count){
		b[0].printBookData();
	}
	*/

}

class Library{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Customers c[] = new Customers[3];

		for(int i=0; i<3;i++)
		    c[i] = new  Customers();

		c[0].getData(1,"Harsha","Maaroon Beach");
		c[1].getData(2,"Vinay","Sikkim");
		c[2].getData(3,"Mahipal","Govari");

		for(int i=0;i<3;i++)
			c[i].printCustData();

		Books b[] = new Books[3];

		for(int i=0;i<3;i++)
			b[i] = new Books();

		b[0].getData("OOPS","Jenkins",10);
		b[1].getData("DAA","Richie",15);
		b[2].getData("DS","Quich",5);

		for(int i=0;i<3;i++)
			b[i].printBookData();

		for(int j=0;j<3;j++){
			System.out.print("Enter Name:");
			String enteredName = input.nextLine();


			int flag=0;
			for(int i=0;i<3;i++){
				if(c[i].cName.equals(enteredName)){
					System.out.println("Welcome...");
					c[i].printCustData();
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.println("Who the hell are you man!");
			}
			else{

				System.out.print("Enter Book Name:");
				String enteredBookName = input.nextLine();
				System.out.print("Enter count:");
				int numOfBooks = input.nextInt();

				int bflag = 0;

				for(int i=0;i<3;i++){
					if(b[i].bookName.equals(enteredBookName)){
						b[i].sellBook(numOfBooks);
						bflag=1;
						break;
					}
				}
				if(bflag==0)
					System.out.println("Enter valid book name buddy!");
			}
		}
	}
}