package HackerRank.Trees;

public class HeightOfBinaryTree {

    //Exercise info: https://gyazo.com/0789e8f28021efd44cacfe8fa665c6a8

    public static int height(Node root) {
        // Write your code here.
        if(root == null)
            return -1;

        return Math.max(height(root.left), height(root.right)) + 1;
    }

}
