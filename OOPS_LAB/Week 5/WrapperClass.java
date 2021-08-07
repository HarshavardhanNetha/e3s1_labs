/*
1. Write a Java Program to implement Wrapper classes and their methods.
https://www.geeksforgeeks.org/utility-methods-wrapper-classes-valueof-xxxvalue-parsexxx-tostring/
*/

import java.util.*;

class WrapperClass{

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();

		Integer I = new Integer(10);
		//Integer II = new Integer("10.2"); format exception
		Character C = new Character('X');
		//Character CC = new Character("X"); error
		Boolean B = new Boolean(true);
		Boolean BB = new Boolean("true");
		Boolean BBB = new Boolean("TrUe");

		System.out.println( " " +I+C+B+BB+BBB);
		arr.add(I);
		arr.add(BBB);
		System.out.println(arr);

		//methods
		// System.out.println(BBB.toString("782")); //CompileTimeError 
		Integer number = Integer.valueOf("29");
		arr.add(number);
		System.out.println(arr);

		Integer base2 = Integer.valueOf("111",2);
		System.out.println(base2);

		System.out.println("xxxValue");

		///xxxValue() returns primitive Values of given input
		Integer xVal = new Integer(100);

		System.out.println(xVal.byteValue());
		System.out.println(xVal.intValue());
		//System.out.println(xVal.booleanValue());

		//parseXxx(String)
		System.out.println("parseXxx");

		double doub = Double.parseDouble("124.245");
		System.out.println(doub);
		int parInt = Integer.parseInt("1010",2);
		System.out.println(parInt);

		System.out.println("toString");
		// primitive to radix conversion using toString()
		//primitive to string and wrapper to string
		String radStr = Integer.toString(255,2);
		System.out.println(radStr);

	}
}