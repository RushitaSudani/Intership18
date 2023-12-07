package in.technous.practies;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public void test()
    {
        /**
         * its doubly linklist
         * its maintain order while adding or removing
         * iterator is used to travese the elemets
         *
         *
         *
         * **/
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Grapes");

        // Displaying the LinkedHashSet elements
        System.out.println("elements: " + linkedHashSet);

        // Adding a duplicate element (will not be added to the set)
        boolean isAdded = linkedHashSet.add("Apple");
        System.out.println(" added again? " + isAdded); // Output: false

        // Removing an element from the LinkedHashSet
        boolean removed = linkedHashSet.remove("Orange");
        System.out.println("Is 'Orange' removed? " + removed);
        System.out.println("Updated LinkedHashSet: " + linkedHashSet);

        // Checking if an element exists in the LinkedHashSet
        boolean contains = linkedHashSet.contains("Banana");
        System.out.println(" contain 'Banana'? " + contains);

        // Size of the LinkedHashSet
        int size = linkedHashSet.size();
        System.out.println("Size :: " + size);

        // Iterating through the LinkedHashSet using Iterator
        System.out.println("Iterator ::");
        Iterator<String> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
