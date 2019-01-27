/*
    [Medium] 71. Simplify Path
    Given an absolute path for a file (Unix-style), simplify it. 
    Or in other words, convert it to the canonical path.

    In a UNIX-style file system, a period . refers to the current directory. 
    Furthermore, a double period .. moves the directory up a level. 
    For more information, see: Absolute path vs relative path in Linux/Unix

    Note that the returned canonical path must always begin with a slash /
    , and there must be only a single slash / between two directory names. 
    The last directory name (if it exists) must not end with a trailing /. 
    Also, the canonical path must be the shortest string representing the absolute path.
*/

import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        Stack<String> stack2 = new Stack<String>();
        String[] parts = path.split("/");
        
        //== tests for reference equality (whether they are the same object).
        for(String n: parts){
            if(n.equals(".") || n.length() == 0){
                continue;
            }else if(n.equals("..")){
                if(!stack.empty())
                    stack.pop();
            }else{
                stack.push(n);
            }
        }
        
        if(stack.empty())
            return "/";
        
        while(!stack.empty())
            stack2.push(stack.pop());
        
        String res = "";
        while(!stack2.empty())
            res += "/" + stack2.pop();
        
        return res;
    }
}