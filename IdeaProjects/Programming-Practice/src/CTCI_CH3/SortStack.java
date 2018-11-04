package CTCI_CH3;

import java.util.Comparator;
import java.util.Stack;

public class SortStack<Integer> {

    /**
     * Sort Stack:
     *
     * Write a program to sort a stack such that the smallest items are on the top.
     */

    public static void sortStack(Stack stack){

        Stack temp = new Stack<>();
        Stack temp2 = new Stack<>();

        while(!stack.isEmpty()){

            if(temp.isEmpty())
                temp.push(stack.pop());

            if((int) stack.peek() > (int) temp.peek()){
                while(!temp.isEmpty() && (int) temp.peek() < (int) stack.peek())
                    temp2.push(temp.pop());

                temp.push(stack.pop());

                while(!temp2.isEmpty())
                    temp.push(temp2.pop());
            }

            else
                temp.push(stack.pop());
        }

        while(!temp.isEmpty())
            temp2.push(temp.pop());

        while(!temp2.isEmpty())
            stack.push(temp2.pop());

    }

    public static void main(String[] args){

        Stack s1 = new Stack<>();

        s1.push(5);
        s1.push(3);
        s1.push(20);
        s1.push(8);

        sortStack(s1);

        while (!s1.isEmpty())
            System.out.println(s1.pop());
    }

}
