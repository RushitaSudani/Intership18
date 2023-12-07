package in.technous.practies;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public void test() {
        HashMap<Integer, String> h1 = new HashMap();
        h1.put(101, "hello");
        h1.put(102, "rahul");
        h1.put(105, null);
        h1.put(103, "abcc");
        System.out.println(h1);

        Set set = h1.entrySet();
        System.out.println(set);

        Iterator i1 = set.iterator();
        for (Map.Entry me : h1.entrySet()) {
            System.out.println(me.getKey());
        }

        while (i1.hasNext()) {
            System.out.println(i1.next());
            // Map.Entry entry = (Map.Entry) i1.iterator();

        }
    }
}
