// Find the sum of all left leaves in a given binary tree.

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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0; 
        return helper(root, root);
    }
    
    public int helper(TreeNode root, TreeNode parent){
        if(root == null)
            return 0; 
        
        int left = helper(root.left, root);
        int right = helper(root.right, root);
        
        if(root == parent.left && (root.left == null && root.right == null))
            return root.val + left + right;
        
        else 
            return left + right; 
        
    }
}
