package CTCI_CH2;

public class Palindrome {

    /**
     * Palindrome
     *
     * Implement a function to check if a linked list is a
     * Palindrome.
     */

    /**
     * In order to solve this problem I added each of the data
     * from the given linked list onto a string builder ideally
     * it's supposed to be characters but since I implemented the
     * Node class to accept data as integers instead of a generic
     * argument it will contain integers, however, the principle is
     * the same. Once added to a string builder we check if the current
     * builder is the same as the reverse of the builder. (palindrome)
     * The time complexity of this algorithm is O(n) where n is the
     * number of characters or data in the linked list.
     *
     * @param start - Linked list with each individual character
     * @return true if it's a palindrome, false otherwise
     */
    public static boolean palindrome(Node start){
        StringBuilder builder = new StringBuilder();
        while(start != null){
            builder.append(start.getdata());
            start = start.getNext();
        }
        return builder.toString().equals(builder.reverse().toString());
    }


    public static void main(String args[]){
        Node start = new Node(2);
        Node n = start.setNext(new Node(1));
        n = n.setNext(new Node(3));
        n = n.setNext(new Node(1));
        n = n.setNext(new Node(2));

        //first linked list is: 2 -> 1 -> 3 -> 1 -> 2 (this is a palindrome)

        Node start2 = new Node(5);
        Node n2 = start2.setNext(new Node(9));
        n2 = n2.setNext(new Node(2));
        n2 = n2.setNext(new Node(22));

        // second linked list is  5 -> 9 -> 2 -> 22 (not a palindrome)

        System.out.println("First list should be a palindrome therefore output should be true: " + palindrome(start));
        //output should be true

        System.out.println("Second list should not be a palindrome therefore output should be false: " + palindrome(start2));
        //output should be: false

    }

}
