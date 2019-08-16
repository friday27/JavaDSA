package stack;

import java.util.Arrays;
import java.util.Stack;

/*
 * [Medium] 503. Next Greater Element II
 * 
 * Given a circular array (the next element of the last element is the first element of the array), 
 * print the Next Greater Number for every element. 
 * The Next Greater Number of a number x is the first greater number to its traversing-order next in the array, 
 * which means you could search circularly to find its next greater number. 
 * If it doesn't exist, output -1 for this number.
 */

public class NextGreaterElemII {
	
	public static int[] nextGreaterElem(int[] arr) {
		int[] ans = new int[arr.length];
		Arrays.fill(ans, -1);
		
		for(int i=0; i<arr.length; i++) {
			Stack<Integer> temp = new Stack<Integer>();
			for(int b=i-1; b>-1; b--)	temp.push(arr[b]);
			for(int a=arr.length-1; a>i; a--)	temp.push(arr[a]);
			
			while(!temp.isEmpty()) {
				int tmp = temp.pop();
				if(tmp>arr[i]) {
					ans[i] = tmp;
					break;
				}
			}			
		}
		return ans;
	}
	
	public static int[] nextGreaterElem2(int[] arr) {
		int n = arr.length;
		int[] ans = new int[n];
		
		int[] temp = new int[n*2];
		for(int i=0; i<n*2; i++)
			temp[i] = arr[i%n];
		
		for(int i=0; i<n; i++) {
			ans[i] = -1;
			for(int j=i; j<i+n; j++) {
				if(temp[j]>arr[i]) {
					ans[i] = temp[j];
					break;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
//		int[] in = {1,2,1}; //2, -1, 2
		int[] in = {1,2,3,4,3};
		int[] ans = nextGreaterElem2(in);
		for(int a:ans)	System.out.print(a+" ");
	}

}
