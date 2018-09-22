package CTCI_CH2;

public class ReturnKthToLast {

    /**
     * Return Kth to last:
     *
     * Implement an algorithm to find the Kth to last element of a singly Linked List
     */

    /**
     * In order to do this exercise, first I look for the size of the singly linked list,
     * once the size is found just iterate to the node that has the size - k and that should be
     * the kth to last element.
     *
     * @param start head node of the linked list
     * @param k kth to last
     * @return kth to last element
     */
    public static int kthToLast(Node start, int k){
        Node pointer = start;
        int size = 1;

        if(start == null)
            return Integer.MIN_VALUE;

        while (pointer != null) {
            pointer = pointer.getNext();
            size++;
        }

        for(int i = 1; i < size-k; i++){
            start = start.getNext();
        }

        return start.getdata();

    }

    public static void main(String args[]){
        Node start = new Node(1);
        Node n = start.setNext(new Node(4));
        n = n.setNext(new Node(5));
        n = n.setNext(new Node(6));
        n = n.setNext(new Node(7));

        //linked list = 1 -> 4 -> 5 -> 6 -> 7

        System.out.println("The 2nd to last element is: " + kthToLast(start, 2));
        //output is 2 since the 2nd to last of the linked list is the element 6

    }

}
