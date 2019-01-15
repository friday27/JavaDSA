package array;

import java.util.Stack;

/*
 * [Easy] 922. Sort Array By Parity II
 * 
 *  Given an array A of non-negative integers, half of the integers in A are odd, 
 *  and half of the integers are even.
 *  Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
 *  You may return any answer array that satisfies this condition.
 */

public class SortArrayByParityII {
	
	public static int[] SortArr(int[] arr) {
		int[] ans = new int[arr.length];

		if(arr.length==2) {
			if(arr[0]%2==0) {
				ans[0] = arr[0];
				ans[1] = arr[1];
			}else {
				ans[0] = arr[1];
				ans[1] = arr[0];
			}
			return ans;
		}		
		
		ans[0] = arr[0];
		int size = 1;
		
		Stack even = new Stack();
		Stack odd = new Stack();
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]%2!=arr[i-1]%2) {
				ans[size++] = arr[i];
			}else if(arr[i]%2==0) {
				even.push(arr[i]);
			}else {
				odd.push(arr[i]);
			}
		}
		
		if(ans[size-1]%2==0) {
			while(!even.empty() && !odd.empty()) {
				ans[size++] = (int) odd.pop();
				ans[size++] = (int) even.pop();
			}
			if(!odd.empty()) {
				ans[size] = (int) odd.pop();
			}
		}else {
			while(!even.empty() && !odd.empty()) {
				ans[size++] = (int) even.pop();
				ans[size++] = (int) odd.pop();
			}
			if(!even.empty()) {
				ans[size] = (int) even.pop();
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		 int[] input = {888,505,627,846};
		 int[] answer = SortArr(input);
		 for(int n:answer)	System.out.print(n+" ");
		 System.out.println();
	}
}
