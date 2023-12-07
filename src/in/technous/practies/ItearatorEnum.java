package in.technous.practies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ItearatorEnum {
    public void test() {
        List l1 = new ArrayList();
        l1.add("tishaa");
        l1.add("123");
        l1.add("tinnuu");

        // System.out.println(l1);

        Iterator i1 = l1.iterator();

        /**
         * hasnext method return boolean value and this method check the next element is
         * there or not
         **/

        System.out.println(i1.hasNext());
        System.out.println();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }

        List l2 = new ArrayList();
        l2.add("aa");
        l2.add(2);
        l2.add("a");

        ListIterator li = l2.listIterator();

        while(li.hasNext())
        {
            System.out.println(li.next());
        }

        //previously forward the elements..

        while(li.hasPrevious())
        {
            System.out.println(li.previous());
        }
        li.set(55);
        li.remove();
        System.out.println(l2);

    }
}
