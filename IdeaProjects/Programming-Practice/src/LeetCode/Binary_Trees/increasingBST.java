// Given a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree 
// is now the root of the tree, and every node has no left child and only 1 right child.

// https://leetcode.com/problems/increasing-order-search-tree/

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
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<>(); 
        helper(root, list);
        
        TreeNode result = new TreeNode(-1);
        TreeNode temp = result; 
        for(TreeNode node : list){
            temp.right = new TreeNode(node.val); 
            temp = temp.right; 
        }
        
        return result.right;
    }
    
    public void helper(TreeNode root, ArrayList<TreeNode> list){
        if(root == null)
            return; 
        
        helper(root.left, list);
        list.add(root); 
        helper(root.right, list);
    }
    
}
