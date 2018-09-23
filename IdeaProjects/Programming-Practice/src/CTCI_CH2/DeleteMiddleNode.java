package CTCI_CH2;

public class DeleteMiddleNode {

    /**
     * Delete Middle Node:
     *
     * Implement an algorithm to delete a node in the middle of
     * a singly linked list, given only access to that node.
     */

    /**
     * In order to attack this problem the first thing that came to mind
     * was to go through the whole linked list to count it's size, however,
     * the catch is that the only given node is already the one you have to
     * delete, therefore, things change. Normally my first approach would have
     * worked given the head of the linked list but not in this case. In order
     * to solve this problem I would just have to copy the data from the given
     * node's next node onto the current node untill I reach the end and at the
     * end delete the node.
     */

    public static void deleteMiddleNode(Node m){
        if(m == null || m.getNext() == null)
            return;

        Node next = m.getNext();
        while(next != null){
            m.setData(next.getdata());

            if(next.getNext()!= null)
                m = m.getNext();

            next = next.getNext();
        }

        m.setNext(null);

    }

    public static void main(String args[]){
        Node start = new Node(1);
        Node n = start.setNext(new Node(4));
        n = n.setNext(new Node(5));
        Node m = n;
        n = n.setNext(new Node(6));
        n = n.setNext(new Node(7));

        //linked list = 1 -> 4 -> 5 -> 6 -> 7

        System.out.println("List before calling deleteMiddleNode method looks like: ");

        n = start;

        while(n != null){
            System.out.print(n.getdata() + " ");
            n = n.getNext();
        }

        System.out.println();
        System.out.println("List after calling deleteMiddleNode method looks like: ");

        deleteMiddleNode(m);

        n = start;

        while(n != null){
            System.out.print(n.getdata() + " ");
            n = n.getNext();
        }

        //output should be: 1 4 6 7

    }


}
