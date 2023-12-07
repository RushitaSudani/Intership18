package in.technous.practies;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
    public void Test()
    {
        //vector is thread safe or we can say that its syncronize
        //vector is slower than arraylist because of synchonozation

        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        vector.add("Grapes");

        // Displaying the Vector elements
        System.out.println("Vector elements: " + vector);

        // Adding an element at a specific position
        vector.add(2, "Pineapple");

        // Displaying the modified Vector
        System.out.println("Modified Vector: " + vector);

        // Getting an element at a specific position
        String fruit = vector.get(3);
        System.out.println("Fruit at index 3: " + fruit);

        // Removing an element
        vector.remove("Banana");

        // Displaying the updated Vector
        System.out.println("Updated Vector: " + vector);

        // Size of the Vector
        int size = vector.size();
        System.out.println("Size of the Vector: " + size);

        // Checking if the Vector is empty
        boolean isEmpty = vector.isEmpty();
        System.out.println("Is Vector empty? " + isEmpty);

        // Iterating through the Vector using Enumeration
        System.out.println("Iterating through the Vector:");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

    }
}
