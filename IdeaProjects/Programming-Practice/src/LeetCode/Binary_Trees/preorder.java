// Given an n-ary tree, return the preorder traversal of its nodes' values.

// https://leetcode.com/problems/n-ary-tree-preorder-traversal/


/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>(); 
        traverseIterative(root, list);
        return list; 
    }
    
    public void traverse(Node root, List<Integer> list){
        if(root == null)
            return; 
        
        list.add(root.val); 
        
        for(Node n : root.children)
            traverse(n, list);
    }
    
    public void traverseIterative(Node root, List<Integer> list){
        Stack<Node> stack = new Stack<>(); 
        stack.push(root); 
        
        while(!stack.isEmpty()){
            Node node = stack.pop(); 
            
            if(node != null){
                list.add(node.val); 

                for(int i = node.children.size()-1; i >= 0; i--)
                    stack.push(node.children.get(i));
                
            }
        }
    }
    
}
