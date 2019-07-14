/*
    35. Search Insert Position
    Given a sorted array and a target value, 
    return the index if the target is found. 
    If not, return the index where it would be 
    if it were inserted in order.
    You may assume no duplicates in the array.

    Example 1:
    Input: [1,3,5,6], 5
    Output: 2

    Example 2:
    Input: [1,3,5,6], 2
    Output: 1

    Example 3:
    Input: [1,3,5,6], 7
    Output: 4

    Example 4:
    Input: [1,3,5,6], 0
    Output: 0
*/

//neat
    // int low = 0, high = nums.length;
    // while(low < high) {
    //     int mid = low + (high-low) / 2; //to prevent overflow
    //     if(nums[mid] < target)
    //         low = mid + 1;
    //     else
    //         high = mid - 1;
    // }
    // return low;

//Runtime: 0ms(100.00%); Memory Usage: 37.9MB(99.32%)
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target > nums[nums.length-1])
            return nums.length;
        int start = 0, end = nums.length-1;
        int n = start + (end-start+1)/2;
        while(end > start) {
            if(nums[n] == target) {
                // //assume duplicate happens
                // int i;
                // for(i=n; i>0; i--) {
                //     if(nums[i-1] != target)
                //         break;
                // }
                return i;
            } else if(nums[n] > target) {
                if(nums[n-1] < target)
                    return n;
                end = n - 1;
            } else {
                if(nums[n+1] > target)
                    return n+1;
                start = n + 1;
            }
            n = start + (end-start+1)/2;
        }
        return n;
    }
}
