/*
    Cracking 1.4
    Write a method to decide if two strings are anagrams or not
*/

import java.util.*;

public class IsAnagram {
    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str1.length(); i++) {
            char c = str1.charAt(i);
            if(map.containsKey(c))
                map.put(c, map.get(c)+1);
            else
                map.put(c, 1);
        }
        for(int i=0; i<str2.length(); i++) {
            char c = str2.charAt(i);
            if(map.containsKey(c))
                map.put(c, map.get(c)-1);
            else
                return false;
            if(map.get(c) == 0)
                map.remove(c);
        }
        return map.isEmpty();
    }    

    public static void main(String[] args) {
        String test11 = "aaaaaa";
        String test12 = "aaaaa";
        System.out.println(isAnagram(test11, test12));
        String test21 = "smile";
        String test22 = "elims";
        System.out.println(isAnagram(test21, test22));
        String test31 = "kingslanding";
        String test32 = "landingkings";
        System.out.println(isAnagram(test31, test32));
    }
}