// Given a binary tree, return the bottom-up level order traversal of its nodes' values. 
// (ie, from left to right, level by level from leaf to root).

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> queue = new LinkedList<>(); 
        queue.add(root);
        while(!queue.isEmpty()){ 
            int size = queue.size();
            List<Integer> levelList = new ArrayList<>();
            for(int  i = 0; i < size; i++){
                TreeNode current = queue.poll();
                levelList.add(current.val);
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
            list.add(0, levelList); 
        }
        return list; 
    }
}
