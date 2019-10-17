/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int num = sc.nextInt();
            int sum = sc.nextInt();
            
            int[] arr = new int[num];
            for(int j=0; j<num; j++)
                arr[j] = sc.nextInt();
            findSubArr(sum, arr);
        }
    }
    
    private static void findSubArr(int sum, int[] arr) {
        int first = 0, last = 0;
        int res = arr[first];
        
        while(first < arr.length) {
            res = arr[first];
            last = first;
            if(arr[first] == sum)
                break;
            else if(arr[first] < sum) {
                for(last=first+1; last<arr.length; last++) {
                    res += arr[last];
                    if(res == sum) {
                        System.out.println((first+1)+" "+(last+1));
                        return;
                    }else if(res > sum)
                        break;
                }
            }
            first++;
        }
        
        if(res == sum) {
            System.out.println((first+1)+" "+(last+1));
        }else {
            System.out.println(-1);
        }
    }
}