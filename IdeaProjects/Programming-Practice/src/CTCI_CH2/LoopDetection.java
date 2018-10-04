package CTCI_CH2;

import java.util.HashSet;

public class LoopDetection {

    /**
     * Loop Detection:
     *
     * Given a circular linked list, implement an algorithm that
     * returns the node at the beginning of the loop.
     */

    /**
     * This algorithm seems fairly easy since we just add all of the nodes
     * onto a hast set and when it detects that the node has been repeated
     * it will return the previous one. I shall assume, since not specified
     * in the book, that the return in the case where there is no loop detected
     * the algorithm will just return the head node since in a circular linked
     * list that is the loop.
     *
     * @param head - head node
     * @return - The node before the loop starts
     */

    public static Node loopDetection(Node head){

        HashSet<Node> set = new HashSet<>();
        Node prev = head, temp = head;

        while(temp != null){

            if(set.contains(temp))
                return prev;

            else{
                set.add(temp);
                prev = temp;
                temp = temp.getNext();
            }
        }
        return head;
    }

    public static void main(String args[]){
        Node start = new Node(2);
        Node n = start.setNext(new Node(1));
        n = n.setNext(new Node(3));
        Node l = n;
        n = n.setNext(new Node(5));
        n = n.setNext(new Node(7));
        n = n.setNext(new Node(8));
        n = n.setNext(new Node(6));
        n = n.setNext(l);

        //first linked list is: 2 -> 1 -> 3 -> 5 -> 7 -> 8 -> 6 -> 3 (loop here)

        System.out.println(loopDetection(start).getdata());
        
        //output node should be the one in this example holding the 6 since
        // this is the node before the loop restarts
    }

}
