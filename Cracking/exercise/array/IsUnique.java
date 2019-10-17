/*
    Cracking 1.1
    Is Unique: Implement an algorithm to determine if a string has all unique characters. 
    What if you cannot use additional data structures?
*/

import java.util.*;


public class IsUnique {
    public boolean isUnique(String s) {
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s.length(); i++) {
            if(!set.add(s.charAt(i)))
                return false;
        }
        return true;
    }

    public boolean isUnique2(String s) {
        // Assume the input string only contains lowercases
        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++) {
            int idx = (int)s.charAt(i) - 97;
            if(arr[idx] == 1)
                return false;
            else
                arr[idx] = 1;
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "abcdefghijklmnopqrstuvwxyz";
        String test2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        IsUnique iu = new IsUnique();
        System.out.println(iu.isUnique2("zxcvbn"));
        System.out.println(iu.isUnique2("zxcvbnzxcvbn"));
        System.out.println(iu.isUnique2("zxcvbnuytrewedx"));
    }
}