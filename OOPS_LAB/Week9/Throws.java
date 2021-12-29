class Throws{
	void method() throws ArithmeticException, IndexOutOfBoundsException, ClassNotFoundException{
		//expected error
		int a = 10/0;
	}

	public static void main(String[] args) {
		try{
			Throws m1 = new Throws();
			m1.method();
		}

		catch(IndexOutOfBoundsException err){
			System.out.println(err);
		}
		catch(ArithmeticException err){
			System.out.println(err);
		}
		catch (ClassNotFoundException err){

		}
		catch(Exception err){
			System.out.println("Main Exception");
		}
		finally{
			System.out.println("Done");
		}
	}
}