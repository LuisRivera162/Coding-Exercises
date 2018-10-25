package CTCI_CH3;

import java.util.Stack;

public class StackMin extends Stack<Integer> {

    /**
     * Stack Min:
     *
     * How would you design a stack which, in addition to push and pop, has a function
     * min which returns the minimum element? All should operate in O(1) time.
     *
     * For simplicity I will assume the type of data are integer numbers.
     * If you wish you could make it generic and use a comparator to keep it generic.
     */

    Stack<Integer> minStack;

    public StackMin(){
        this.minStack = new Stack<>();
    }

    @Override
    public Integer push(Integer e){

        if(minStack.isEmpty())
            minStack.push(e);

        else if (minStack.peek() > e)
            minStack.push(e);

       return super.push(e);
    }

    @Override
    public Integer pop(){

        if(this.peek() == minStack.peek())
            minStack.pop();

        return super.pop();
    }

    public Integer min(){
        return minStack.peek();
    }

}

