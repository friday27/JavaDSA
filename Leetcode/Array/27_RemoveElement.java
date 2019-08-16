/*
    27. Remove Element
    Time: O(n)
*/

class Solution {
    public int removeElement(int[] nums, int val) {
        int pointer = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                if(pointer != i) {
                    nums[pointer] = nums[i];
                }   
                pointer++;
            }
        }
        return pointer;
    }
}