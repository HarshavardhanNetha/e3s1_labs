/*
Method override
*/

class Override {
  public void sum() {
    System.out.println("Eat");
  }
}
class Child extends Override{
  public void sum() {
    System.out.println("Eat in child!");
  }
}

class Overriding_Animal
{
  public static void main(String args[]){
    Child d1=new Child();
    Override a1=new Override();
    d1.sum();
    a1.sum();
  }
}