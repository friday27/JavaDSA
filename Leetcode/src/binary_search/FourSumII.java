package binary_search;

/*
 * 454. 4Sum II
 * 
 * Given four lists A, B, C, D of integer values, compute how many tuples (i, j, k, l) 
 * there are such that A[i] + B[j] + C[k] + D[l] is zero.
 * To make problem a bit easier, all A, B, C, D have same length of N where 0 ≤ N ≤ 500. \
 * All integers are in the range of -228 to 228 - 1 and the result is guaranteed to be at most 231 - 1.
 */

public class FourSumII {
	
	public static int BinarySearch(int[] nums, int target) {
		int low = 0;
		int high = nums.length; 
		int mid;
		
		while(low<high) {
			mid = low + (high-low)/2;
			if(nums[mid]==target) {
				return mid;
			}else if(nums[mid]>target) {
				high = mid;
			}else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		int ansCount = 0;
		int size = 0;
		int[] tempSums = new int[A.length*B.length*C.length];
		for(int a:A) {
			for(int b:B) {
				for(int c:C) {
					tempSums[size] = a+b+c;
					size += 1;
				}
			}
		}
		
		for(int i=0;i<size;i++) {
			if(BinarySearch(D, tempSums[i]*-1) != -1) ansCount++;			
		}
		
		return ansCount;
    }
	
	public static void main(String[] args) {
		int[] A = {1, 2};
		int[] B = {-2, -1};
		int[] C = {-1, 2};
		int[] D = {0, 2};
		int ans = fourSumCount(A, B, C, D);
		System.out.println(ans); //2
		
		int[] A2 = {-1, -1};
		int[] B2 = {-1, 1};
		int[] C2 = {-1, 1};
		int[] D2 = {1, -1};
		ans = fourSumCount(A2, B2, C2, D2);
		System.out.println(ans); //6
		
	}

}
