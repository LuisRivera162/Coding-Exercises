package CTCI_CH2;

import java.util.HashSet;

public class RemoveDups {

    /**
     * Remove dups:
     *
     * Write code to remove duplicates from an unsorted linked list.
     */

    /**
     * First thing that comes to mind is to create a has hset in order to store all
     * the different elements and be able to find data in O(1) time and when iterating
     * through the linked list if the program finds out that the data of the current
     * node being iterated is repeated it will remove it from the list in O(1) time
     * based on the specified method.
     *
     * @param start - head of the linked list
     */

    public static void removeDups(Node start){
        HashSet<Integer> set = new HashSet<>();
        Node prev = start;

        while(start != null){

            if(!set.contains(start.getdata()))
                set.add(start.getdata());

            else {
                remove(start, prev);
                start = prev;
            }

            prev = start;
            start = start.getNext();
        }
    }

    /**
     * Quick remove method executed in O(1) time for the sake of efficiency.
     *
     * @param ntd - Node to delete
     * @param prev - Node before the one you wish to delete
     */
    public static void remove(Node ntd, Node prev){
        prev.setNext(ntd.getNext());
        ntd = null;
    }

    public static void main(String args[]){
        Node start = new Node(1);
        Node n = start.setNext(new Node(4));
        n = n.setNext(new Node(5));
        n = n.setNext(new Node(6));
        n = n.setNext(new Node(7));
        n = n.setNext(new Node(5));

        //linked list = 1 -> 4 -> 5 -> 6 -> 7 -> 5 (dupes are 5s)

        Node test = start;

        System.out.println("List before removing dupes: ");
        while(test!= null){
            System.out.print(test.getdata() + " ");
            test = test.getNext();
        }

        System.out.println();
        System.out.println("List after removing dupes: ");

        removeDups(start);

        while(start!= null){
            System.out.print(start.getdata() + " ");
            start = start.getNext();
        }

    }
}

