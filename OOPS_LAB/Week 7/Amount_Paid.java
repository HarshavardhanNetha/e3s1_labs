import java.util.*;
interface studentFee {
  public void getFirstName(String fn);
  public void getLastName(String ln);
  public void getAddress(String ad);
  public void getContact(String c);
  public void getAmount(int amt);
}
class hostler implements studentFee {
  public void getFirstName(String fn) {
    System.out.println("First name of the Hostler student :" + fn);
  }
  public void getLastName(String ln) {
    System.out.println("Last name of the Hostler student :" + ln);
  }
  public void getAddress(String ad) {
    System.out.println("Address of the Hostler student :" + ad);
  }
  public void getContact(String c) {
    System.out.println("Contact of the Hostler student :" + c);
  }
  public void getAmount(int amt) {
    System.out.println("Amount paid by Hostler student :" + amt);
  }
}
class nonhostler implements studentFee {
  public void getFirstName(String fn) {
    System.out.println("First name of the Non-Hostler student :" + fn);
  }
  public void getLastName(String ln) {
    System.out.println("Last name of the Non-Hostler student :" + ln);
  }
  public void getAddress(String ad) {
    System.out.println("Address of the Non-hostler student :" + ad);
  }
  public void getContact(String c) {
    System.out.println("Contact of the Non-Hostler student :" + c);
  }
  public void getAmount(int amt) {
    System.out.println("Amount paid by Non-Hostler student :" + amt);
  }
}
class Amount_Paid {
  public static void main(String agrs[]) {
    Scanner sc = new Scanner(System.in);
    hostler hs = new hostler();
    System.out.println("Details of the Non Hostler Student:::");
    System.out.println("Enter the First name of the Hostler Student::");
    String fn = sc.nextLine();
    System.out.println("Enter Last name of the Hostler::");
    String ln = sc.nextLine();
    System.out.println("Enter the address of the Hostler::");
    String ad = sc.nextLine();
    System.out.println("Enter the Contact number of Hostler::");
    String c = sc.nextLine();
    System.out.println("Enter the amount to pay by the Hostler::");
    int amt = sc.nextInt();
    hs.getFirstName(fn);
    hs.getLastName(ln);
    hs.getAddress(ad);
    hs.getContact(c);
    hs.getAmount(amt);
    Scanner s = new Scanner(System.in);
    nonhostler nhs = new nonhostler();
    System.out.println("Details of the Non Hostler Student:::");
    System.out.println("Enter the First name of the Non-Hostler Student::");
    String fn1 = s.nextLine();
    System.out.println("Enter Last name of the Non-Hostler::");
    String ln1 = s.nextLine();
    System.out.println("Enter the address of the Non-Hostler::");
    String ad1 = s.nextLine();
    System.out.println("Enter the Contact number of Non-Hostler::");
    String c1 = s.nextLine();
    System.out.println("Enter the amount to pay by the NonHostler::");
    int amt1 = s.nextInt();
    nhs.getFirstName(fn1);
    nhs.getLastName(ln1);
    nhs.getAddress(ad1);
    nhs.getContact(c1);
    nhs.getAmount(amt1);
  }
}