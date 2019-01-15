package array;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/*
 * [Medium] 442. Find All Duplicates in an Array
 * 
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * Find all the elements that appear twice in this array.
 * Could you do it without extra space and in O(n) runtime?
 */

public class FindDupInArray {

	public static boolean search(int[] arr, int target) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==target)	return true;
		}
		return false;
	}
	
	public static List<Integer> findDup(int[] a) {
		List<Integer> ans = new ArrayList<Integer>();
		for(int i=1; i<a.length; i++) {
			if(search(Arrays.copyOfRange(a, 0, i), a[i])) {
				ans.add(a[i]);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] in = {4,3,2,7,8,2,3,1};
		List<Integer> out = findDup(in);
		for(int n:out)	System.out.print(n+" ");
	}

}
