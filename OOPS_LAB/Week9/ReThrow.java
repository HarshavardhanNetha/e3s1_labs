class ReThrow{

	void Two() throws ArithmeticException{
		//expected error
		try{
			int a = 10/0;
		}
		catch(Exception err){
			System.out.println(err);
		}
	}

	void One(){
		try{
			ReThrow one = new ReThrow();
			one.Two();
		}
		catch(Exception err){
			System.out.println(err);
		}
	}


	public static void main(String[] args) {
		try{
			ReThrow m1 = new ReThrow();
			m1.One();
		}
		catch(Exception err){
			System.out.println("Main Exception");
		}
		finally{
			System.out.println("Done");
		}
	}
}