// Given two non-empty binary trees s and t, check whether tree t has exactly 
// the same structure and node values with a subtree of s. A subtree of s is a 
// tree consists of a node in s and all of this node's descendants. The tree s 
// could also be considered as a subtree of itself.

// https://leetcode.com/problems/subtree-of-another-tree/



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
    public boolean isSubtree(TreeNode s, TreeNode t) {

        if(s == null)
            return false; 
        
        boolean ret = equals(s, t); 
        
        if(ret)
            return ret;
        else{
            boolean right = isSubtree(s.right, t); 
            boolean left = isSubtree(s.left, t);
            return right || left; 
        }
       
    }
    
    public boolean equals(TreeNode s, TreeNode t){
        if(s == null && t == null)
            return true;
        if(s == null || t == null)
            return false; 
        return s.val == t.val && equals(s.left, t.left) && equals(s.right, t.right); 
    }
    
}
