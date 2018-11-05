package CTCI_CH4;

import java.util.ArrayList;

public class MinimalTree {

    /**
     * Given a Sorted array with unique integer elements, write an algorithm to create a binary
     * search tree with minimal height.
     */

    public static BTreeNode<Integer> minimalTree(int[] arr){
        BTreeNode<Integer> root = new BTreeNode<>();

        minimalTHelper(0, arr.length, arr, root);

        return root;
    }

    public static BTreeNode<Integer> minimalTHelper(int start, int end, int[] arr, BTreeNode<Integer> root){

        if (start >= end)
            return null;

        if(root == null)
            root = new BTreeNode<>();

        int mid = (start + end)/2;

        root.data = arr[mid];

        root.left = minimalTHelper(start, mid, arr, root.left);
        root.right = minimalTHelper(mid+1, end, arr, root.right);

        return root;
    }

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        BTreeNode<Integer> root = minimalTree(arr);

        inOrder(root);
    }

    public static void inOrder(BTreeNode<Integer> root){
        if (root == null)
            return;

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

}
