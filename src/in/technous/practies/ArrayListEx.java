package in.technous.practies;

import java.util.ArrayList;
import java.util.List;
public class ArrayListEx {
    public void Test() {
        /**
         * Indexbased datastructure predifine class arraylist is an list interface we
         * can this resizeable array(growable) indexbased datastructure heterogenious
         * datatype store arraylist store dublicate value are store store null value
         * follow insertion order not follow sorting order this is non sychonize
         * shiffting elements of slower
         *
         * Constructor (3) empty constructor (Inital capacity:10) arraylist(capacity)
         * arraylist(collection obj)
         *
         *
         * Constructor empty constructor Linklistex(collection col)
         *
         * METHODS
         *
         * addFirst() addLast() getFirst() getLast() removeFirst() removeLast()
         *
         **/

        List l1 = new ArrayList();
        l1.add(12);
        l1.add("change for repo");
        l1.add("tisha");
        l1.add("aaa");
        l1.add("branch-11");
        l1.add("this this pull change111");
        l1.add("this this pull change111");//new


        // System.out.println(l1.get(2));
        // System.out.println(l1.set(2, "ggg"));
        System.out.println(l1.indexOf("tisha"));
        // l1.remove(2);
        System.out.println(l1);
        // removeAll addAll indexOf isEmpty size

        System.out.println(l1);

    }
}
