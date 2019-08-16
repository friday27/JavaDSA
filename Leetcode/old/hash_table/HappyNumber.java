/*
  [Easy] 202. Happy Number

  Write an algorithm to determine if a number is "happy".
  A happy number is a number defined by the following process: 
  Starting with any positive integer, 
  replace the number by the sum of the squares of its digits, 
  and repeat the process until the number equals 1 (where it will stay), 
  or it loops endlessly in a cycle which does not include 1. 
  Those numbers for which this process ends in 1 are happy numbers.

  Example: 
  Input: 19
  Output: true
  Explanation:
  1^2 + 9^2 = 82
  8^2 + 2^2 = 68
  6^2 + 8^2 = 100
  1^2 + 0^2 + 0^2 = 1
*/

import java.util.LinkedList;
import java.util.Hashtable;

class Solution {
    public int[] getDigits(int n){
        LinkedList<Integer> temp = new LinkedList<Integer>();  
        int len = 0;
        while(n > 0){
            temp.push(n%10);
            n /= 10;
            len += 1;
        }
        int[] ans = new int[len];
        for(int i=0;i<len;i++){
            ans[i] = temp.pop();
        }
        return ans;
    }
    
    public boolean isHappy(int n) {
        if(n < 0)
            return false;
        int sum = n;
        int[] temp;
        Hashtable ht = new Hashtable();
        while(sum != 1){
            temp = getDigits(sum);
            sum = 0;
            for(int i=0;i<temp.length;i++){
                sum += temp[i]*temp[i];
                //System.out.println(sum);
            }
            if(ht.containsKey(sum))
                return false;
            ht.put(sum, 0);
        }
        return true;
    }
}


//Better!
import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> existingNums = new HashSet<Integer>();
        int sqrSum, remain;
        while(existingNums.add(n)){
            sqrSum = 0;
            while(n > 0){
                remain = n % 10;
                sqrSum += remain*remain;
                n /= 10;
            }
            if(sqrSum == 1)
                return true;
            else
                n = sqrSum;
        }
        return false;
    }
}
