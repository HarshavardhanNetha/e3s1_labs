/*
Escape sequences
*/


class Escape{
	public static void main(String[] args) {
		System.out.println("New line \nTab space\tis given backsp\bace");
		System.out.println("Return\ncarriage\rto the first");
		System.out.println("Single quote \' double quote \" backslash \\ form \f feed ");
		System.out.println("%d: Integer\n%f: Floating point\n%c: Character\n%s String\n%x Hexadecimal\n%u unsigned  number\n%o octal");
		System.out.printf("Format specifiers: %%c %c %%d %d %%F %f %%x %x %%s %s",'c',10,20.342,16,"String");
	}
}