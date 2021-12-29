class Throw{
	public static void main(String[] args) {
		try{
			throw new Exception();
		}
		catch(Exception err){

			System.out.println("This is generated manually");
			System.out.println(err);
		}
	}
}