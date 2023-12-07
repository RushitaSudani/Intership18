package in.technous.practies;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public void test() {
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the Queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");
        queue.add("Grapes");

        // Displaying the Queue elements
        System.out.println("Queue elements: " + queue);

        // Removing and displaying the first element from the Queue
        String removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Updated Queue: " + queue);

        // Peeking at the first element of the Queue (without removal)
        String peekElement = queue.peek();
        System.out.println("First element (without removal): " + peekElement);

        // Checking if the Queue contains a specific element
        boolean containsElement = queue.contains("Orange");
        System.out.println("Queue contains 'Orange': " + containsElement);

        // Size of the Queue
        int size = queue.size();
        System.out.println("Size of the Queue: " + size);

        // Iterating through the Queue
        System.out.println("Iterating through the Queue:");
        for (String element : queue) {
            System.out.println(element);
        }
    }
}
