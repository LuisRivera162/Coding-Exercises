package CTCI_CH2;

public class Node {

    /**
     * Standard node
     */
    private Node next;
    private int data;

    public Node(int d){
            this.data = d;
            this.next = null;
        }

        public Node(int d, Node n){
            this.data = d;
            this.next = n;
        }

        public Node setNext(Node n){
            this.next = n;
            return n;
        }

        public void setData(int d){
            this.data = d;
        }

    public Node getNext(){
        return this.next;
    }
    public int getdata(){
        return this.data;
    }


    

}
