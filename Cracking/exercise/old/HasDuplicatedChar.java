/*
    Cracking 1.1 
    Implement an algorithm to determine if a string has all unique characters 
    What if you can not use additional data structures?
*/

import java.util.*;

public class HasDuplicatedChar {
    public static boolean hasDuplicatedChar(String str) {
        Set<Character> set = new HashSet<>();
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(!set.add(c))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String test1 = "test";
        System.out.println(hasDuplicatedChar(test1));
        String test2 = "zxcvbnm";
        System.out.println(hasDuplicatedChar(test2));
        String test3 = "aaa";
        System.out.println(hasDuplicatedChar(test3));
    }
}
