 /**************************************************************
 Purpose/Description: <creates stacks with methods to push, pop, and display>
 Author’s Panther ID: <5901749>
 Certification:
 I hereby certify that this work is my own and none of it is the work of
 any other person.
**************************************************************/

/*

The time compexity for this function is O(Kn): 
The method recursively calls itself until all the elements are sorted. 
K is the number of elements stored in the stack
Simply O(N)
*/

package cop3530_assignment2;

/**
 *
 * @author Joey
 */

import java.util.ListIterator;
import java.util.Stack;

public class StackSort {

    public void sortStack(Stack<Integer> stack){
        Stack<Integer> temp=new Stack<>();      //creates a stack

        if (!stack.empty()){                    //checks if the stack is not oempty
            int top=stack.pop();                //removes from the top of the stack

            sortStack(stack);                   //sorts the stack

            insert(stack, top);                 //add to the top of the stack
        }
    }

    private void insert(Stack<Integer> stack, int top) {
        if (stack.empty() || top<stack.peek()){ //adds ints to the top of the stack
            stack.push(top);
            return;
        }

        int temporary= stack.pop();             // makes sure to remove after use
        insert(stack, top);


        stack.push(temporary);
    }

    public void displayStack(Stack<Integer> stack){
        System.out.print("Stack (from top):\t");
        ListIterator<Integer>  iterator=stack.listIterator();

        while (iterator.hasNext())      
                iterator.next();

        StringBuilder output= new StringBuilder();
        while (iterator.hasPrevious())
            output.append(iterator.previous()).append(", ");

        output.replace(output.lastIndexOf(","),output.lastIndexOf(",")+1," ");


        System.out.println(output);
    }


    public static void main(String[] args) {
        
        Stack<Integer> myStack=new Stack<>();   //creates a new stack
        StackSort stackSort= new StackSort();   //sorts stack

        myStack.push(1);                        //adding elements to the stack
        myStack.push(2);
        myStack.push(20);
        myStack.push(11);
        myStack.push(8);
        myStack.push(100);

        stackSort.displayStack(myStack);        //displays stack

        stackSort.sortStack(myStack);           //creates sorted stack

        stackSort.displayStack(myStack);        //displays sorted stack


    }
}
/*

The time compexity for this function is O(Kn): 
The method recursively calls itself until all the elements are sorted. 
K is the number of elements stored in the stack
Simply O(N)
*/