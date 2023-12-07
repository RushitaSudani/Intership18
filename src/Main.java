import in.technous.practies.*;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1. ArrayList");
        System.out.println("Press 2. Vector");
        System.out.println("Press 3. Stack");
        System.out.println("Press 4. TreeSet");
        System.out.println("Press 5. Queue");
        System.out.println("Press 6. Set");
        System.out.println("Press 7. HashSet");
        System.out.println("Press 8. Linkedlist");
        System.out.println("Press 9. LinkedHashSet");
        System.out.println("Press 10. TreeSet ");
        System.out.println("Press 11. Map");
        System.out.println("Press 12. Iterator");
        System.out.println("Press 13. Enumration");
        System.out.println("Press 14. HashTable");

        System.out.println("Enter your Choice::");
        int ch=sc.nextInt();
        switch(ch) {
            case 1:
                ArrayListEx a1 = new ArrayListEx();
                a1.Test();
                break;
            case 2:
                VectorEx v1=new VectorEx();
                v1.Test();
                break;
            case 3:
                StackEx s1=new StackEx();
                s1.test();
                break;
            case 4:
                TreeSetEx t1=new TreeSetEx();
                t1.test();
                break;
            case 5:
                QueueEx q1=new QueueEx();
                q1.test();
                break;
            case 6:
                //SetEx ss111=new SetEx();
                //ss111.Test();
                break;
            case 7:
                HashSetEx h1=new HashSetEx();
                h1.test();
                break;
            case 8:
                LinkedlistEx l1=new LinkedlistEx();
                l1.test();
                break;
            case 9:
                LinkedHashSetEx list=new LinkedHashSetEx();
                list.test();
                break;
            case 11:
                MapEx m1=new MapEx();
                m1.test();
                break;
            case 12:
                ItearatorEnum i1=new ItearatorEnum();
                i1.test();
                break;
            case 13:
                EnumrationDemo e1=new EnumrationDemo();
                e1.test();
                break;


        }

    }
}