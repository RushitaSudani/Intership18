package in.technous.practies;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public void test()
    {
        Set<String> set = new HashSet<>();

        // Adding elements to the Set
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");

        // Displaying the Set elements
        System.out.println("Set elements: " + set);

        // Adding a duplicate element (which won't be added)
        boolean isAdded = set.add("Apple");
        System.out.println("Is 'Apple' added again? " + isAdded); // Will print false

        // Removing an element
        boolean isRemoved = set.remove("Orange");
        System.out.println("Is 'Orange' removed? " + isRemoved);
        System.out.println("Updated Set: " + set);

        // Checking if the Set contains a specific element
        boolean containsElement = set.contains("Banana");
        System.out.println("Set contains 'Banana': " + containsElement);

        // Size of the Set
        int size = set.size();
        System.out.println("Size of the Set: " + size);

        // Iterating through the Set
        System.out.println("Iterating through the Set:");
        for (String element : set) {
            System.out.println(element);
        }
    }
}
