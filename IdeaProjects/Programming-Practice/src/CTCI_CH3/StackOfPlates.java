package CTCI_CH3;

import java.util.ArrayList;
import java.util.Stack;

public class StackOfPlates<E> {

    /**
     * Stack of Plates: 
     *
     * Implement a data structure SetofStacks that mimics a stack of plates on a table, where it has a capacity
     * and if reached a new stack is created. This data structure should be composed of several stacks and should
     * create a new stack once the previous one exceeds capacity.
     *
     * Follow Up:
     *
     * Implement a function popAt(int index) which performs a pop operation on a specific sub-track.
     */

    private ArrayList<Stack<E>> stacks;
    private Stack<E> current;
    private int capacity;

    public StackOfPlates(int cap){
        this.capacity = cap;
        this.stacks = new ArrayList<Stack<E>>();
        stacks.add(new Stack<>());
        current = stacks.get(0);
    }

    public E push(E e){

            if(current.size() == capacity){
                stacks.add(new Stack<>());
                current = stacks.get(stacks.size()-1);
            }

            return current.push(e);
    }

    public E pop(){

        if (current.isEmpty() && stacks.size() != 1){
            stacks.remove(stacks.size()-1);
            current = stacks.get(stacks.size()-1);
        }

        return current.pop();
    }

    public E popAt(int index) throws IndexOutOfBoundsException{

        if(index < 0 || index >= stacks.size()){
            throw new IndexOutOfBoundsException("Invalid index.");
        }

        E result = stacks.get(index).pop();
        stacks.get(index).push(current.pop());

        return result;

    }

}
