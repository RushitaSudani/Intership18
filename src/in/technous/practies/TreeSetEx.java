package in.technous.practies;

import java.util.TreeSet;

public class TreeSetEx {
    public void test()
    {
        TreeSet t1=new TreeSet();
        t1.add(1);
        t1.add(56);
        t1.add(3);
        t1.add(2);

        t1.clear();
        //not allow null value
        //t1.add((null);

        //t1.add("dfgh");
        System.out.println(t1);
    }
}
