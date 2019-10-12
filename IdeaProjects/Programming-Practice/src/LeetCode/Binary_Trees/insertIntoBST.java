// Given the root node of a binary search tree (BST) and a value to be inserted into the tree,
// insert the value into the BST. Return the root node of the BST after the insertion. It is guaranteed 
// that the new value does not exist in the original BST.

// Note that there may exist multiple valid ways for the insertion,
// as long as the tree remains a BST after insertion. You can return any of them.

// https://leetcode.com/problems/insert-into-a-binary-search-tree/


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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null)
            return new TreeNode(val); 
        fillTree(root, val); 
        return root;
    }
    
    public void fillTree(TreeNode root, int val){
        if(root.val < val){
            if(root.right == null){
                TreeNode newNode = new TreeNode(val);
                root.right = newNode; 
                return; 
            }
            insertIntoBST(root.right, val); 
        }
            
        
        else{
            if(root.left == null){
                TreeNode newNode = new TreeNode(val);
                root.left = newNode; 
                return; 
            }
            insertIntoBST(root.left, val); 
        }
    }
    
}
