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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null)
            return null;
        return helper(nums, 0, nums.length-1);
    }
    
    private TreeNode helper(int[] arr, int low, int hi) {
        if(low > hi)
            return null;
        int mid = low + (hi-low)/2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = helper(arr, low, mid-1);
        node.right = helper(arr, mid+1, hi);
        return node;
    }
}