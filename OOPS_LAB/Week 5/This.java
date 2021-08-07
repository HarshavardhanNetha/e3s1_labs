/*
This keyword
*/

class ThisKeyword{
	int a;
	int b;

	void set(int a, int b){
		this.a = a;
		this.b = b;
	}
}

class This{
	public static void main(String[] args) {
		ThisKeyword th = new ThisKeyword();
		th.set(10,20);
		System.out.println(th.a+" "+th.b);
		//ThisKeyword.set(30,40);
		//System.out.println(ThisKeyword.a+" "+ThisKeyword.b);
	}
}