import java.util.*;
import java.lang.*;
import java.io.*;

// Execution Time:2.59
class GFG {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTest = sc.nextInt();
        
        for(int i=0; i<numTest; i++) {
            int num = sc.nextInt()-1;
            int[] input = new int[num];
            for(int j=0; j<num; j++) {
                input[j] = sc.nextInt();
            }
            Arrays.sort(input);
            findMissing(input);
        }
    }
    
    private static void findMissing(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            if(arr[i] != i+1) {
                System.out.println(i+1);
                return;
            }else {
                i++;
            }
        }
        System.out.println(i+1);
    }
}