class Try{
	Try(){
		System.out.println("Constrctoir");
	}

	public static void main(String[] args) {
		Try t1 = new Try();
		
		try{
			int a = 10/0;
		}
		catch(Exception err){
			System.out.println(err);
		}
		finally{
			System.out.println("Execute");
		}
		System.out.println("Outside");
	}
}