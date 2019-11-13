/*
    Cracking 4.5
    Validate BST: 
    Implement a function to check if a binary tree is a binary search tree.
*/

class Node {
    int data;
    Node left, right;
    Node(int d) {
        this.data = d;
    }
}

public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }
    
    public boolean isValidBST(TreeNode root, Integer min, Integer max) {
        if(root == null)
            return true;
        if((min != null && root.val <= min) || (max != null && root.val >= max))
            return false;
        return isValidBST(root.left, min, root.val) && isValidBST(root.right, root.val, max);
    }
}