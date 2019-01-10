package binary_search;

/*
 	[Easy] 704. Binary Search
 	
 	Given a sorted (in ascending order) integer array nums of n elements and a target value, 
 	write a function to search target in nums. If target exists, then return its index, 
 	otherwise return -1.
 */

public class Binarysearch {
	
	public static int BinarySearch(int[] nums, int target) {
		int low = 0;
		//cannot be nums.length-1, 
		//since when nums.length=1, you will fail to check the value at nums[1]
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

	public static void main(String[] args) {
		int[] nums = {-1,0,3,5,9,12};
		int target = 9;
		int ans = BinarySearch(nums, target);
		System.out.println(ans);
		
		int[] nums2 = {-1,0,3,5,9,12};
		target = 2;
		ans = BinarySearch(nums2, target);
		System.out.println(ans);
		
		int[] nums3 = {5};
		target = 5;
		ans = BinarySearch(nums3, target);
		System.out.println(ans);
	}

}
