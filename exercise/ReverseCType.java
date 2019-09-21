/*
    Cracking 1.2
    Write code to reverse a C-Style String 
    (C-String means that “abcd” is represented as five characters, 
    including the null character )
*/

public class ReverseCType {
    public static String reverseCType(String str) {
        String res = "";
        for(int i=str.length()-1; i>-1; i--) {
            res += str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String test1 = "test";
        System.out.println(reverseCType(test1));
        String test2 = "happyberry";
        System.out.println(reverseCType(test2));
        String test3 = "wonderwoman";
        System.out.println(reverseCType(test3));
    }
}