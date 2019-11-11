/*package whatever //do not write package name here 
https://practice.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array/0#ExpectOP
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class FindUnique {
    static String getUniqueNum(String[] arr) {
        Set<String> set = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            String n = arr[i];
            if(set.contains(n))
                set.remove(n);
            else
                set.add(n);
        }
        String res = "";
        for(String n: set)
            res = n;
        return res;
    }
    
    static String getUniqueNum2(String[] arr) {
        if(arr == null)
            return "";
        if(arr.length == 1)
            return arr[0];
        return binarySearch(arr, 0, arr.length-1);
    }
    
    static String binarySearch(String[] arr, int i, int j) {
        if(i > j)
            return "";
        int mid = i + (j-i)/2;
        if(mid == 0 && arr[mid] != arr[mid+1])
            return arr[mid];
        else if(mid == arr.length-1 && arr[mid] != arr[mid-1])
            return arr[mid];
        else if(mid != 0 && mid != arr.length-1 && arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1])
            return arr[mid];
        String l = binarySearch(arr, i, mid-1);
        String r = binarySearch(arr, mid+1, j);
        if(l != "")
            return l;
        if(r != "")
            return r;
        return "";
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTest = Integer.parseInt(sc.nextLine());
        List<String> tests = new ArrayList<>();
        for(int i=0; i<numTest; i++) {
            int num = Integer.parseInt(sc.nextLine());
            String[] arr = sc.nextLine().split(" ");
            System.out.println(getUniqueNum2(arr));
        }
        
    }
}