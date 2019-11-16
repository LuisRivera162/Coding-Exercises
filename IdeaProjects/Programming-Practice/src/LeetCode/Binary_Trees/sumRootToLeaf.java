
// https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/submissions/

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
    
    
    int result = 0;
    
    public int sumRootToLeaf(TreeNode root) {
        StringBuilder builder = new StringBuilder(); 
        fillStringArray(root, builder);
        
        return result;
        
        
    }
    
    public void fillStringArray(TreeNode root, StringBuilder builder){
        if(root == null)
            return; 
        
        if(root.left == null && root.right == null ){
            result += Integer.parseInt((builder.toString() + root.val),2);
            return; 
        }
        
        builder.append(root.val + "");
        
        fillStringArray(root.left, builder);
        fillStringArray(root.right, builder);
        
        builder.deleteCharAt(builder.length()-1);
        
    }
    
}
