
// https://leetcode.com/problems/sum-root-to-leaf-numbers/submissions/


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
    public int sumNumbers(TreeNode root) {
        ArrayList<String> list = new ArrayList<>(); 
        String str = "";
        
        helper(root, list, str);
        
        int result = 0;
        
        for(String s : list)
            result += Integer.parseInt(s);
            
        
        return result; 
    }
    
    public void helper(TreeNode root, ArrayList<String> list, String s){
        if(root == null)
            return; 
        
        s += root.val;
        
        if(root.right == null && root.left == null){
            list.add(s); 
            return;
        }
        
        helper(root.left, list, s);
        helper(root.right, list, s);
    }
    
}
