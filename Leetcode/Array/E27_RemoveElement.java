/*
    27. Remove Element
    Time: O(n)

    {1,2,3,4,5} -> remove 3
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int pointer = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                if(pointer != i) {
                    nums[pointer] = nums[i];
                }   
                pointer++; // If found the value to be removed, keep the pointer there
            }
        }
        return pointer;
    }
}