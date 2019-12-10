/*
    Cracking 8.1 Triple Step
    A child is running up a staircase with n steps and can hop either 
    1 step, 2 steps, or 3 steps at a time. 
    Implement a method to count how many possible ways the child can run up the stairs.
*/
import java.math.BigInteger;
import java.util.*;

public class TripleStep {
    //sol 1, time: O(3^N)
    int countWays(int n) {
        if(n < 0)
            return 0;
        if(n == 0)
            return 1;
        return countWays(n-1) + countWays(n-2) + countWays(n-3);
    }

    //sol 2, time: O(N)
    int countWays2(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        return countWays2Helper(n, memo);
    }

    int countWays2Helper(int n, int[] memo) {
        if(n < 0)
            return 0;
        if(n == 0)
            return 1;
        if(memo[n] > -1)
            return memo[n];
        for(int i=1; i<=n; i++) {
            memo[i] = countWays2Helper(i-1, memo) + countWays2Helper(i-2, memo) + countWays2Helper(i-3, memo);
        }
        return memo[n];
    }

    public static void main(String[] args) {
        TripleStep test = new TripleStep();
        for(int i=1; i<=40; i++) {
            System.out.println(test.countWays2(i) + " " + test.countWays(i));
        }

        /*
            [To Discuss]
            The result will overflow when N = 37.
            
            -> Use BigInteger class (java.math.BigInteger)
            BigInteger x = new BigInteger("1");
            BigInteger.valueOf(n)
        */
    }
}