/*
Static variable and method
*/

class StaticMethod{
	static int a = 10; //static variable
	static void get(){
		System.out.println("This is static method!"); //no need of instance
	}
}
class Static{
	public static void main(String[] args) {
		StaticMethod.get();
		System.out.println(StaticMethod.a);
	}
}