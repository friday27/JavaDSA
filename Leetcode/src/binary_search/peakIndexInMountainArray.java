package binary_search;

/*
 	[Easy] 852. Peak Index in a Mountain Array
 	
 	Concept: Binary Search
 	
 	Let's call an array A a mountain if the following properties hold:
	A.length >= 3
	There exists some 0 < i < A.length - 1 such that 
	A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
	
	Given an array that is definitely a mountain, 
	return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
	
	Example1)	Input: [0,1,0]		Output: 1
	Example2)	Input: [0,2,1,0]	Output: 1

 */

public class peakIndexInMountainArray {
	
	//O(log N)
	//faster than 38.90% of Java online submissions for Peak Index in a Mountain Array.
	public static int peakIndexInMountainArray(int[] A) {
		int low = 0;
		int high = A.length - 1;
		int mid;
		
		while(true) {
			mid = low + (high-low)/2;
			if(A[mid]>=A[mid-1] && A[mid]>=A[mid+1]) {
				return mid;
			}else if(A[mid]<=A[mid-1] && A[mid]>=A[mid+1]) {
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
	}

	public static void main(String[] args) {
		int[] a = {0, 1, 0};
		int res1 = peakIndexInMountainArray(a);
		System.out.println(res1);
		
		int[] b = {3, 4, 5, 1};
		int res2 = peakIndexInMountainArray(b);
		System.out.println(res2);

	}

}
