/*
Retail Price of product
*/

import java.util.Scanner;

class Product{
	int productId;
	String productName;
	double productPrice;
	int productQuantity;
	int ordered;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//can also be initialised as method .getData(params pass)

		Product p1 = new Product();
		p1.productId = 1;
		p1.productName = "Item 1";
		p1.productQuantity = 10;
		p1.productPrice = 99.90;
		p1.ordered = 0;

		Product p2 = new Product();
		p2.productId = 2;
		p2.productName = "Item 2";
		p2.productQuantity = 20;
		p2.productPrice = 20.20;
		p2.ordered = 0;

		Product p3 = new Product();
		p3.productId = 3;
		p3.productName = "Item 3";
		p3.productQuantity = 25;
		p3.productPrice = 6.87;
		p3.ordered = 0;


		Product p4 = new Product();
		p4.productId = 4;
		p4.productName = "Item 4";
		p4.productQuantity = 15;
		p4.productPrice = 45.50;
		p4.ordered = 0;

		Product p5 = new Product();
		p5.productId = 5;
		p5.productName = "Item 5";
		p5.productQuantity = 35;
		p5.productPrice = 40.49;
		p5.ordered = 0;

		double sum=0;

		for(int i=0;i<5;i++){
			System.out.print("Enter prodcut ID:");
			int temp = input.nextInt();
			System.out.print("Enter quantity:");
			int quan = input.nextInt();
			System.out.println();
			// quantity validation can be added.

			switch(temp){
				case 1:
					if(quan>p1.productQuantity){
						System.out.println("Not enough quantity.");
						System.out.println("Remaining quantity:"+p1.productQuantity);
					}
					else{
						sum+=quan*p1.productPrice;
						p1.ordered += quan;
						p1.productQuantity-=quan;
					}
					break;
				case 2:
					if(quan>p2.productQuantity){
						System.out.println("Not enough quantity.");
						System.out.println("Remaining quantity:"+p2.productQuantity);
					}
					else{
						sum+=quan*p2.productPrice;
						p2.ordered += quan;
						p2.productQuantity-=quan;
					}
					break;
				case 3:
					if(quan>p3.productQuantity){
						System.out.println("Not enough quantity.");
						System.out.println("Remaining quantity:"+p3.productQuantity);
					}
					else{
						sum+=quan*p3.productPrice;
						p3.ordered += quan;
						p3.productQuantity-=quan;
					}				
					break;
				case 4:
					if(quan>p4.productQuantity){
						System.out.println("Not enough quantity.");
						System.out.println("Remaining quantity:"+p4.productQuantity);
					}
					else{
						sum+=quan*p4.productPrice;
						p4.ordered += quan;
						p4.productQuantity-=quan;
					}
					break;
				case 5:
					if(quan>p5.productQuantity){
						System.out.println("Not enough quantity.");
						System.out.println("Remaining quantity:"+p5.productQuantity);
					}
					else{
						sum+=quan*p5.productPrice;
						p5.ordered += quan;
						p5.productQuantity-=quan;
					}
					break;
				default:
					System.out.println("Not a valid product ID");
					i--;
			}
		}

		System.out.print("Enter <productNumber> (1 to 5) for details or 6 for total cost:");
		int choice = input.nextInt();

		switch(choice){
			case 1:
				System.out.printf("ID: %d\nName: %s\nPrice: %f\nOrdered: %d\nQuantity Left: %d\n",p1.productId,p1.productName,p1.productPrice,p1.ordered,p1.productQuantity);
				break;
			case 2:
				System.out.printf("ID: %d\nName: %s\nPrice: %f\nOrdered: %d\nQuantity Left: %d\n",p2.productId,p2.productName,p2.productPrice,p2.ordered,p2.productQuantity);
				break;
			case 3:
				System.out.printf("ID: %d\nName: %s\nPrice: %f\nOrdered: %d\nQuantity Left: %d\n",p3.productId,p3.productName,p3.productPrice,p3.ordered,p3.productQuantity);
				break;
			case 4:
				System.out.printf("ID: %d\nName: %s\nPrice: %f\nOrdered: %d\nQuantity Left: %d\n",p4.productId,p4.productName,p4.productPrice,p4.ordered,p4.productQuantity);
				break;
			case 5:
				System.out.printf("ID: %d\nName: %s\nPrice: %f\nOrdered: %d\nQuantity Left: %d\n",p5.productId,p5.productName,p5.productPrice,p5.ordered,p5.productQuantity);
				break;
			case 6:
				System.out.println("Total Cost: "+sum);
				break;
		}

	}
}