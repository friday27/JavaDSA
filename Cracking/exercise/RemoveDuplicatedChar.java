/*
    Cracking 1.3
    Design an algorithm and write code to remove the duplicate characters 
    in a string without using any additional buffer 
    NOTE: One or two additional variables are fine An extra copy of the array is not
    
    FOLLOW UP
    Write the test cases for this method
*/

import java.util.*;

public class RemoveDuplicatedChar {
    public static String removeDupChar(String str) {
        String res = "";
        Set<Character> set = new HashSet<>();
        for(int i=0; i<str.length(); i++) {
            if(set.add(str.charAt(i)))
                res += str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String test1 = "aaaaaa";
        System.out.println(removeDupChar(test1));
        String test2 = "abcde";
        System.out.println(removeDupChar(test2));
        String test3 = "kingslanding";
        System.out.println(removeDupChar(test3));
    }
}