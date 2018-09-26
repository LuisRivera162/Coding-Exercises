package CTCI_CH2;

import java.util.HashSet;

public class Intersection {

    /**
     * Given two singly linked lists determine if the lists intersect. Return
     * the intersecting node.
     */

    /**
     * In order to solve this problem I decided to create a hash set and store
     * all of the nodes in one list into it. once that's done I iterate through
     * the second list and check whether the node being iterated is in the set,
     * if it is not then we keep looking, otherwise, that is the intersecting
     * node and it's returned. The time complexity of this algorithm in the 
     * worst case is O(n+m) where n is the size of the first list and m the 
     * size of the second list. 
     *
     * @param s1 - head node of the first linked list
     * @param s2 - head node of the second linked list
     * @return the intersecting node or null in the case there is no intersecting node
     */
    public static Node intersect(Node s1, Node s2){
        HashSet<Node> set = new HashSet<>();

        while(s1!= null){
            set.add(s1);
            s1 = s1.getNext();
        }

        while(s2 != null){
            if(set.contains(s2))
                return s2;
            s2 = s2.getNext();
        }

        return null;
    }

    public static void main(String args[]){
        Node start = new Node(2);
        Node n = start.setNext(new Node(1));
        Node i = n;                                 //intersecting node
        n = n.setNext(new Node(7));
        n = n.setNext(new Node(9));
        n = n.setNext(new Node(0));



        Node start2 = new Node(5);
        Node n2 = start2.setNext(new Node(9));
        n2 = n2.setNext(new Node(2));
        n2 = n2.setNext(new Node(22));
        n2 = n2.setNext(i);

        //linked lists are: 2 -> 1 -> 7 -> 9 -> 0 and 5 -> 9 -> 2 -> 22 -> 1 (node from other list)

        System.out.println("If result is true there is an intersection: " + (intersect(start, start2) == i));
        //output should be true

        System.out.println("The data of the intersected note is: " + intersect(start,start2).getdata());
        //output should be: 1

    }

}
