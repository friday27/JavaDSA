/*
    66. Plus One
    Time: O(n)
*/

class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int temp = 1;
        for(int i=len-1; i>-1; i--) {
            if(temp == 1) {
                if(digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i] += temp;
                    temp = 0;
                }
            }
        }
        if(temp == 1) {
            int[] newArr = new int[len+1];
            newArr[0] = 1;
            for(int i=0; i<len; i++)
                newArr[i+1] = digits[i];
            return newArr;
        }
        return digits;
    }
}