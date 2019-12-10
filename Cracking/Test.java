import java.util.*;

public class Test {
    public static void main(String[] args) {
        String[] arr = {"apple", "app", "ape", "abandon", "allow"};
        Arrays.sort(arr);
        for(String str: arr) {
            System.out.print(str+" ");
        }
        System.out.println();
    }
}