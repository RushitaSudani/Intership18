package in.technous.practies;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public void test()
    {
        Map m1=new HashMap();
        m1.put(101, "tishaa");
        m1.put(102, "abc");
        m1.put(102, "sudani");
        m1.put(null, null);
        System.out.println(m1);
        //m1.clear();
        //m1.remove(102);
        m1.replace(102, "rameshh");
        System.out.println(m1.containsKey(103));
        System.out.println(m1.get(102));
        System.out.println(m1.size());



    }
}
