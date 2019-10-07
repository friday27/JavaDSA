//shorter solution!
class Solution1 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            //either it's a left bracket
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            // or it's a right bracket
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}

class Solution2 {
    public boolean isLeftBracket(char c) {
        if(c == '(' || c == '[' || c== '{')
            return true;
        else
            return false;
    }
    
    public char getReversedRightBracket(char c) {
        if(c == '(')
            return ')';
        else if(c == '[')
            return ']';
        else if(c == '{')
            return '}';
        else
            throw new java.util.NoSuchElementException();
    }
    
    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<Character>();
        
        for(int i=0; i<s.length(); i++) {
            char bracket = s.charAt(i);
            //left bracket
            if(isLeftBracket(bracket))
                stack.addLast(getReversedRightBracket(bracket));
            //or right bracket
            else if(stack.isEmpty() || stack.removeLast() != bracket) {
                return false;    
            }
        }
        return stack.isEmpty();
    }            
}