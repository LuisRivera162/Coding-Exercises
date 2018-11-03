package CTCI_CH3;

import java.util.Queue;
import java.util.Stack;

public class MyQueue<E> {

    /**
     * Implement MyQueue class which implements a queue using two stacks.
     */

    private Stack<E> stack;
    private Stack<E> holder;


    public MyQueue(){
        stack = new Stack<>();
        holder = new Stack<>();
    }

    public E dequeue(){
        return stack.pop();
    }

    public E Enqueue(E e){

        E ete;

        if(!stack.isEmpty()){
            while(!stack.isEmpty())
                holder.push(stack.pop());

            ete = holder.push(e);

            while(!holder.isEmpty())
                stack.push(holder.pop());
        }

        else
            ete = stack.push(e);

        return ete;
    }

    public int size(){
        return stack.size();
    }

}
