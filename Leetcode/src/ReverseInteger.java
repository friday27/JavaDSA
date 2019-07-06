/*
    7. Reverse Integer
    Given a 32-bit signed integer, reverse digits of an integer.

    Example 1:
    Input: 123
    Output: 321

    Example 2:
    Input: -123
    Output: -321

    Example 3:
    Input: 120
    Output: 21

    Note:
    Assume we are dealing with an environment which 
    could only store integers within the 32-bit signed integer 
    ange: [−231,  231 − 1]. For the purpose of this problem, 
    assume that your function returns 0 when the reversed integer overflows.

    -> Should not use long for this test!
*/


class Solution {
    public int reverse(int x) {
        int res = 0, pop;
        while(x != 0) {
            pop = Math.abs(x%10);
            //If res*10+x%10 > Integer.MAX_VALUE or < Integer.MIN_VALUE, we will get overflow.
            if(res > 0.1*(Integer.MAX_VALUE-pop) || res < 0.1*Integer.MIN_VALUE-0.1*pop) {
                return 0;
            }
            res = res*10 + x%10;
            x /= 10;
        }
        return res;
    }
}


public class ReverseInteger {
    public static void main(String[] args) {
        Solution test = new Solution();
        
        int answer = test.reverse(2147483641);
        System.out.println(answer);

        int answer2 = test.reverse(1000000003);
        System.out.println(answer2);

        int answer3 = test.reverse(-1000000003);
        System.out.println(answer3);
    }
}