package in.technous.practies;

import java.util.Enumeration;
import java.util.Vector;

public class EnumrationDemo {
    public void test()
    {
        Vector v1=new Vector();
        v1.add("a");
        v1.add(56);
        v1.add("tisha");

        //System.out.println(v1);
        /**
         * only used in lagacy classes
         * only used for read
         * only retrive forward direction
         * **/
        Enumeration Enum = v1.elements();
        while(Enum.hasMoreElements())
        {
            System.out.println(Enum.nextElement());
        }


    }
}
