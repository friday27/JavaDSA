/*
    26. Remove Duplicates from Sorted Array
    Time: O(n)
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1)
            return 1;
        int pointer = 0;
        for(int idx=1; idx<nums.length; idx++) {
            if(nums[idx] != nums[idx-1]) {
                if(pointer+1 != idx) {
                    nums[pointer+1] = nums[idx];
                }
                pointer++;
            } //If nums[idx]==nums[pointer], do not move pointer
        }
        return pointer+1;
    }
}