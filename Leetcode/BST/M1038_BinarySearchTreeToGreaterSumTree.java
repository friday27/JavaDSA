/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
class Solution {
    int accumulatedSum = 0;
    
    public void traverse(TreeNode node) {
        if(node == null)
            return;
        traverse(node.right);
        accumulatedSum += node.val;
        node.val = accumulatedSum;
        traverse(node.left);
    }
    
    public TreeNode bstToGst(TreeNode root) {
        traverse(root);
        return root;
    }
}