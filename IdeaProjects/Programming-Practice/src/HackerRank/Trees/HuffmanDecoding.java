package HackerRank.Trees;

public class HuffmanDecoding {

    //Problem info:

    void decode(String s, Node root) {
        Node temp = root;
        for(int i = 0; i < s.length()+1;){
            if(temp.left == null && temp.right == null){
                System.out.print(temp.data);
                temp = root;
            }

            else{
                char whereToGo = s.charAt(i);

                if(whereToGo == '1'){
                    temp = temp.right;
                    i++;
                }

                if(whereToGo == '0'){
                    temp = temp.left;
                    i++;
                }
            }
        }
    }
}
