class Solution {
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