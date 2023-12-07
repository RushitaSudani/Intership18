package in.technous.practies;

import java.util.HashSet;
import java.util.Iterator;
public class HashSetEx {
    public void test()
    {
        /** implement set interface
         *  allow null value
         *  does not have any gaurantee to accessing
         *  opration (add,remove,contain,size,)
         *  dublicate not allowed
         *  implemets serializable and clonable interface
         *
         *  Constructor
         *
         *
         *  methods
         *
         * **/

        //ArrayList<Integer> a1=new ArrayList<Integer>();
        //ArrayList<Integer> a2=new ArrayList<Integer>();
        HashSet s1=new HashSet();

        s1.add(1);
        s1.add(2);
        s1.add(553);
        s1.add("tisha");
        s1.add(1);
        s1.add(3);
        s1.add(null);
        s1.add(null);
        System.out.println(s1);

        Iterator i=s1.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        //remove elements



    }
}
