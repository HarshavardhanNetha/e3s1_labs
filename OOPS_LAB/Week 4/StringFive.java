
class StringFive{
	public static void main(String[] args) {
		String s1 = new String("Varun"), s3 = "Testone", s4 = new String("TestOne");
		String s2 = "Tharun";

		int count_vowel=0;

		char arr[] = {'a','e','i','o','u','A','E','I','O','U'};
		for(char i: arr){
			for(int j=0;j<s1.length();j++)
				if(s1.charAt(j) == i)
					count_vowel++;
		}
		System.out.println("Vowel Count\t:" + count_vowel+ "\nConsonant Count\t:" + (s1.length()-count_vowel));
		//
	}
}