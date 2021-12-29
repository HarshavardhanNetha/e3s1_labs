
class StringTwo{
	public static void main(String[] args) {
		String s1 = new String("Varun"), s3 = "Testone", s4 = new String("TestOne");
		String s2 = "Tharun";

		boolean result = s1.equals(s2);
		System.out.println(result);

		System.out.println(s3.equalsIgnoreCase(s4));

		//
	}
}