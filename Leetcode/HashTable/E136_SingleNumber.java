/*
    https://leetcode.com/problems/single-number/discuss/42997/My-O(n)-solution-using-XOR
    
    For anyone who didn't understood why this works here is an explanation. 
    This XOR operation works because it's like XORing all the numbers by itself. 
    So if the array is {2,1,4,5,2,4,1} then it will be like we are performing this operation

    ((2^2)^(1^1)^(4^4)^(5)) => (0^0^0^5) => 5.

    Hence picking the odd one out ( 5 in this case).
*/

class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int n: nums) {
            res ^= n;
        }
        return res;
    }
}