package array;

/*
 * [Easy] 509. Fibonacci Number 
 * 
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, 
 * called the Fibonacci sequence, such that each number is the sum of 
 * the two preceding ones, starting from 0 and 1. That is,
 * 
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), for N > 1.
 * Given N, calculate F(N)
 */

public class FibonacciNumber {
	
	public static int FibonacciSum(int n) {
		if(n==0) {
			return n;
		}else if(n==1) {
			return n;
		}else {
			int[] fiboArray = new int[n];
			fiboArray[0] = 0;
			fiboArray[1] = 1;
			
			for(int i=2; i<n; i++) {
				fiboArray[i] = fiboArray[i-1] + fiboArray[i-2];
			}
			
			return fiboArray[n-1] + fiboArray[n-2];
		}
	}

	public static void main(String[] args) {
		System.out.println("Input: 1  Output:"+FibonacciSum(1));
		System.out.println("Input: 3  Output:"+FibonacciSum(3));
		System.out.println("Input: 4  Output:"+FibonacciSum(4));

	}

}
