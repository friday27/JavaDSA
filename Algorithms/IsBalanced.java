/*
    Cracking 4.1
    Implement a function to check if a tree is balanced.
    For the purposes of this question, a balanced tree is defined to be a tree 
    such that no two leaf nodes differ in distance from the root by more than one.
*/

public class IsBalanced {
    private int minDepth(Node current) {
        if(current == null)
            return 0;
        return 1 + Math.min(minDepth(current.left), minDepth(current.right));
    }

    private int maxDepth(Node current) {
        if(current == null)
            return 0;
        return 1 + Math.max(maxDepth(current.left), maxDepth(current.right));
    }

    public boolean isBalanced(Node root) {
        return maxDepth(root) - minDepth(root) <= 1;
    }
}