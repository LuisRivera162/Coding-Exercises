
// https://leetcode.com/problems/find-mode-in-binary-search-tree/

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
    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        fillMap(root, map);
        
        int max = 1;
        
        for(Integer i : map.values())
            if(max < i)
                max = i;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(Integer i : map.keySet())
            if(map.get(i) == max)
                list.add(i); 
        
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            result[i] = list.get(i);
        
        return result;
    }
    
    public void fillMap(TreeNode root, HashMap<Integer, Integer> map){
        if(root == null)
            return;
        
        map.put(root.val, map.getOrDefault(root.val, 0)+1);
        
        fillMap(root.left, map);
        fillMap(root.right, map);
    }
    
}
