import java.util.*;
interface payable {
  public abstract void getAmount();
}
class Invoice implements payable {
  public void getAmount() {
    int a;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter amount to be paid to Invoice :");
    a = scan.nextInt();
    System.out.println("The total amount that need to be paid is :" + a);
  }
}
class InterfacePayable {
  public static void main(String[] args) {
    Invoice emp1 = new Invoice();
    emp1.getAmount();
  }
}