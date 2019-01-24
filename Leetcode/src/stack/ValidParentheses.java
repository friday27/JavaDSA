// package stack;

import java.util.Stack;

/*
  [Easy] 20. Valid Parentheses
  Given a string containing just the characters "(", ")", "{", "}", "[" and "]", 
  determine if the input string is valid.

  An input string is valid if:
  Open brackets must be closed by the same type of brackets.
  Open brackets must be closed in the correct order.
  Note that an empty string is also considered valid.

  [Smarter]
  Source: https://leetcode.com/problems/valid-parentheses/discuss/9178/Short-java-solution
  
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<Character>();
    for (char c : s.toCharArray()) {
      if (c == '(')
        stack.push(')');
      else if (c == '{')
        stack.push('}');
      else if (c == '[')
        stack.push(']');
      else if (stack.isEmpty() || stack.pop() != c)
        return false;
    }
    return stack.isEmpty();
  }
  
*/


public class ValidParentheses{
  public static Boolean isValid(String s){
    Stack<Character> stack = new Stack<Character>();
    if(s.length()==0)
      return true;

    for(int i=0;i<s.length();i++){
      char c = s.charAt(i);
      if(c=='(' || c=='[' || c=='{')
        stack.push(c);
      else if(!stack.empty()){
        if(c==')'){
          if(stack.peek()=='(')
            stack.pop();
          else
            return false;
        }else if(c==']'){
          if(stack.peek()=='[')
            stack.pop();
          else
            return false;
        }else if(c=='}'){
          if(stack.peek()=='{')
            stack.pop();
          else
            return false;
        }
      }else
        stack.push(c);
    }

    if(stack.empty())
      return true;
    else
      return false;
  }

  public static void main(String[] args){
    String a = "([)]";
    String b = "{[]}";
    String c = "";
    Boolean ansA = isValid(a);
    Boolean ansB = isValid(b);
    Boolean ansC = isValid(c);
    System.out.println(ansA);
    System.out.println(ansB);
    System.out.println(ansC);
  }
}