/*
  [Easy] 136. Single Number

  Given a non-empty array of integers, every element appears twice except for one. 
  Find that single one.

  Note:
  Your algorithm should have a linear runtime complexity. 
  Could you implement it without using extra memory?

  Example 1:
  Input: [2,2,1]
  Output: 1

  Example 2:
  Input: [4,1,2,1,2]
  Output: 4
*/

import java.util.Hashtable;

class Solution {
    public int singleNumber(int[] nums) {
        Hashtable ht = new Hashtable<>();
        for(int i=0;i<nums.length;i++){
            if(ht.containsKey(nums[i]))
                ht.remove(nums[i]);
            else
                ht.put(nums[i], 0);
        }
        return (int) ht.keys().nextElement();
    }
}

//Better! Concept: XOR
class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length;i++)
            ans ^= nums[i];
        return ans;
    }
}