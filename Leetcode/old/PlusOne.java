/*
    66. Plus One
    Given a non-empty array of digits representing a non-negative 
    integer, plus one to the integer.
    The digits are stored such that the most significant digit 
    is at the head of the list, and each element in the array 
    contain a single digit.

    You may assume the integer does not contain any leading zero, 
    except the number 0 itself.

    Example 1:
    Input: [1,2,3]
    Output: [1,2,4]

    Example 2:
    Input: [4,3,2,1]
    Output: [4,3,2,2]
*/

class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        digits[len-1] += 1;
        for(int i=len-1; i>0; i--) {
            if(digits[i] != 10)
                break;
            else {
                digits[i] = 0;
                digits[i-1] += 1;
            }
        }
        if(digits[0] == 10) {
            int[] newDigits = new int[digits.length+1];
            newDigits[0] = 1;
            newDigits[1] = 0;
            for(int i=2; i<newDigits.length-1; i++)
                newDigits[i] = digits[i-1];
            return newDigits;
        }
            
        return digits;
    }
}