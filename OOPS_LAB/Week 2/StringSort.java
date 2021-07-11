/*
String sort
*/

import java.util.Arrays;

public class StringSort {
    public static void main(String args[]) {
        //defining an array of type String  
        String[] names = {
            "Varun",
            "Kiran",
            "Raju",
            "Rakesh",
            "Ashish",
            "Ganesh"
        };
        int size = names.length;
        //logic for sorting   
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                //compares each elements of the array to all the remaining elements  
                if (names[i].compareTo(names[j]) > 0) {
                    //swapping array elements  
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        //prints the sorted array in ascending order  
        System.out.println(Arrays.toString(names));
    }
}