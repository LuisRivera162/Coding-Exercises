//You are given a binary tree in which each node contains an integer value.

//Find the number of paths that sum to a given value.

//The path does not need to start or end at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).

// https://leetcode.com/problems/path-sum-iii/

//NOTE THIS IS NAIVE APPROACH (first try). Need to work on studying for a better approach. 

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
    
    int counter = 0; 
    
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        
        if(root.val == sum)
            counter++;
        
        helper(root.left, sum, root.val); 
        helper(root.right, sum, root.val);
        
        pathSum(root.left, sum);
        pathSum(root.right, sum); 
        
        return counter; 
    }
    
    public void helper(TreeNode root, int sum, int value){
        if(root == null)
            return; 
        
        if(value+root.val == sum)
            counter++; 
        
        helper(root.left, sum, value+root.val);
        helper(root.right, sum, value+root.val);
        
    }
    
}
