// Given a Binary Search Tree and a target number, return true if there exist two elements in 
// the BST such that their sum is equal to the given target.

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
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> set = new HashSet<>(); 
        return fillSet(root, set, k);
        
    }
    
    public boolean fillSet(TreeNode root, HashSet<Integer> set, int k){
        if(root == null)
            return false; 
        
        
        if(set.contains(k - root.val))
            return true; 
        
        if(!set.contains(root.val))
            set.add(root.val); 
        
        return fillSet(root.left, set, k) || fillSet(root.right, set, k);
        
    }
    
}
