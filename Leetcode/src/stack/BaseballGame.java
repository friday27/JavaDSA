package stack;

import java.util.Stack;

/*
 * [Medium] 682. Baseball Game
 * 
 * You're now a baseball game point recorder.
 * Given a list of strings, each string can be one of the 4 following types:
 * 
 * Integer (one round's score): Directly represents the number of points you get in this round.
 * "+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
 * "D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
 * "C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.
 * Each round's operation is permanent and could have an impact on the round before and the round after.
 * 
 * You need to return the sum of the points you could get in all the rounds.
 */

public class BaseballGame {

	public static int countScore(String[] scores) {
		Stack<Integer> scoreArray = new Stack<Integer>();
		int sum = 0;
		int temp = 0;
		
		for(String s:scores) {
			if(s.equals("C")) {
				sum -= scoreArray.pop();
			}else if(s.equals("D")) {
				temp = scoreArray.peek()*2;
				scoreArray.push(temp);
				sum += temp;
			}else if(s.equals("+")) {		
				temp = scoreArray.pop();
				int tempSum = temp;
				tempSum += scoreArray.peek();
				scoreArray.push(temp);
				scoreArray.push(tempSum);
				sum += tempSum;
			}else {
				temp = Integer.parseInt(s);
				scoreArray.push(temp);
				sum += temp;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String[] in = {"5","-2","4","C","D","9","+","+"};
//		String[] in = {"5","2","C","D","+"};
		System.out.println(countScore(in));
	}

}
