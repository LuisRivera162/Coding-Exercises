package HackerRank.Trees;

import java.util.ArrayList;

public class Is_This_BST {

    //Problem info: https://gyazo.com/4c8647ded8d6de3018343c09f6954a37

    boolean checkBST(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        fillList(root, list);

        for(int i = 0; i < list.size()-1; i++)
            if(list.get(i) >= list.get(i+1))
                return false;

        return true;
    }

    void fillList(Node root, ArrayList<Integer> list){
        if(root == null)
            return;

        fillList(root.left, list);
        list.add(root.data);
        fillList(root.right, list);
    }

}
