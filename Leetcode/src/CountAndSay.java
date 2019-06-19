/*
38. Count and Say
The count-and-say sequence is the sequence of integers with the first five terms as following:
1.     1
2.     11
3.     21
4.     1211
5.     111221
6.     312211
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
Note: Each term of the sequence of integers will be represented as a string.

Example:
Input: 4
Output: "1211"
*/


class Solution {
    public String countAndSay(int n) {
        if(n == 1)
            return "1";
        String before = "1", after = "";
        int count = 1;
        for(int i=1; i<n; i++) {
            after = "";
            count = 1;
            for(int j=0; j<before.length()-1; j++) {
                if(before.charAt(j) != before.charAt(j+1)) {
                    after += Integer.toString(count) + before.charAt(j);
                    count = 1;
                }else {
                    count++;
                }
            }
            if(count != 1) {
                after += Integer.toString(count) + before.charAt(before.length()-1);
            }else {
                after += "1" + before.charAt(before.length()-1);
            }
            before = after;
        }
        return after;
    }
}


class CountAndSay {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println("1: "+sol.countAndSay(1));
        System.out.println("2: "+sol.countAndSay(2));
        System.out.println("3: "+sol.countAndSay(3));
        System.out.println("4: "+sol.countAndSay(4));
        System.out.println("5: "+sol.countAndSay(5));
        System.out.println("6: "+sol.countAndSay(6));
        System.out.println("7: "+sol.countAndSay(7));
        System.out.println("8: "+sol.countAndSay(8));
        System.out.println("9: "+sol.countAndSay(9));
        System.out.println("10: "+sol.countAndSay(10));
    }
}
