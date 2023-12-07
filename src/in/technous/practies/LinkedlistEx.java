package in.technous.practies;

import java.util.LinkedList;

public class LinkedlistEx {
    public void test() {
        /**
         * indexbased datastructure heterogenous collection allow dublicate elements
         * store multiple null value follow insertion order but not follow sorting order
         * non-sychonize collection (not thread-safe) not given data consistancy
         *
         *
         * inherit list and dequeue interface thats why they access all properties of
         * list interface underline datastructure is doubly linkedlist insertion and
         * deletion is faster comapare to arraylist (we need to only change pointing not
         * need to shiffting elements) travesing forward and backward direction
         *
         * - need extra space - and manage address while removing and deletion
         *
         *
         **/

        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");

        // Displaying the LinkedList
        System.out.println("LinkedList elements: " + linkedList);

        // Adding an element at a specific position
        linkedList.add(2, "Pineapple");

        // Displaying the modified LinkedList
        System.out.println("Modified LinkedList: " + linkedList);

        // Getting an element at a specific position
        String fruit = linkedList.get(3);
        System.out.println("Fruit at index 3: " + fruit);

        // Removing an element
        linkedList.remove("Banana");

        // Displaying the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);

        // Size of the LinkedList
        int size = linkedList.size();
        System.out.println("Size of the LinkedList: " + size);

        // Checking if the LinkedList is empty
        boolean isEmpty = linkedList.isEmpty();
        System.out.println("Is LinkedList empty? " + isEmpty);

        // Iterating through the LinkedList using for-each loop
        System.out.println("Iterating through the LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);

        }
    }

}
