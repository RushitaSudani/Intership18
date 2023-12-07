package in.technous.practies;

import java.util.Stack;

public class StackEx {
    public void test()
    {

        /**
         * vactor is subclass of stack class that's why they inherit all the propertiies of vector class
         * and adding methods like push pop peek ect..
         * **/
        Stack<String> stack = new Stack<>();

        // Pushing elements push the stack
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");

        // Displaying the stack elements
        System.out.println("Stack elements: " + stack);

        // Pop an element from the stack
        String topElement = stack.pop();
        System.out.println("Popped element: " + topElement);

        // Displaying the updated stack after popping
        System.out.println("Updated Stack: " + stack);

        // Peeking at the top element of the stack
        String peekElement = stack.peek();
        System.out.println("Top element (without removal): " + peekElement);

        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is Stack empty? " + isEmpty);

        // Size of the stack
        int size = stack.size();
        System.out.println("Size of the Stack: " + size);

        // Searching for an element in the stack
        int found = stack.search("Java");
        System.out.println("Element 'Java' found in Stack: " + found);
    }
}
