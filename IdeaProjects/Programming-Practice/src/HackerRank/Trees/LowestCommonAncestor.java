package HackerRank.Trees;

public class LowestCommonAncestor {

    //Problem info: https://gyazo.com/08e6f6bbffaa7cc015d4c7dcb7a4db43

    public static Node lca(Node root, int v1, int v2) {
        // Write your code here.
        if(root == null)
            return null;

        if(root.data == v1 || root.data == v2)
            return root;

        Node leftNode = lca(root.left, v1, v2);
        Node rightNode = lca(root.right, v1, v2);

        if(leftNode != null && rightNode != null)
            return root;

        if(leftNode == null && rightNode != null)
            return rightNode;

        if(leftNode != null && rightNode == null)
            return leftNode;

        return null;

    }

}
