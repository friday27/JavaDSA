/*
    Cracking 4.1
    Implement a function to check if a tree is balanced 
    For the purposes of this question, a balanced tree is defined to be 
    a tree such that no two leaf nodes differ in distance from the root by more than one
*/

import java.util.*;

public class IsBalanceTree {
    private int minDepth(Node current) {
        if(current == null)
            return 0;
        return 1 + Math.min(minDepth(current.left), minDepth(current.right));
    }

    private int maxDepth(Node current) {
        if(current == null)
            return 0;
        return 1 + Math.min(minDepth(maxDepth.left), minDepth(maxDepth.right));
    }

    public boolean isBalance(Node root) {
        return maxDepth - minDepth <= 1;
    }
}