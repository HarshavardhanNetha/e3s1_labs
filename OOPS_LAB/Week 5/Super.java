/*
super method
*/

class Parent{
	int a = 10; //static variable
}
class Child extends Parent{
	int a = 20;
	void get(){
		System.out.println("Parent:"+super.a);
		System.out.println("Child:"+a);
	}
}
class Super{
	public static void main(String[] args) {
		Child c = new Child();
		c.get();
	}
}