/*
    Cracking 1.9
    String Rotation: 
    Assume you have amethod isSubstring which checks ifone word is asubstring of another. 
    Given two strings, 51 and 52, write code to check if 52 is a rotation of 51 using 
    only one call to isSubstring (e.g.,"waterbottle"is a rotation of"erbottlewat").

    Idea: s1 = xy, s2 = yx.
    If s2 is a rotation of s1, then s2(yx) must be a substring of s1(xyxy).
*/

public class StringRotation {
    public boolean isRotation(String s1, String s2) {
        String s1s1 = s1 + s1;
        return isSubstring(s1s1, s2);
    }

    public boolean isSubstring(String s1, String s2) {
        //...
    }
}