import in.technous.filehandling.*;
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
            case 14:
                OutputStream o1=new OutputStream();
                o1.test();
                break;
            case 15:
                InputStream ii1=new InputStream();
                ii1.inputstream();
                break;
//            case 16:
//                BufferedInputStreamEx b1=new BufferedInputStreamEx();
//                b1.test1();
            case 17:
                BufferedOutputStreamEx bb1=new BufferedOutputStreamEx();
                bb1.bufferedoutput();
                break;
            case 18:
                ByteArrayInputStreamEx bb2=new ByteArrayInputStreamEx();
                bb2.bytearrayinput();
                break;
            case 19:
                ByteOutputStreamEx bb3=new ByteOutputStreamEx();
                bb3.bytearrayoutput();
                break;
            case 20:
                DataInputOutEx bb4=new DataInputOutEx();
                bb4.datainputoutput();
                break;
            case 21:
                FileReaderEx bb5=new FileReaderEx();
                bb5.filereader();
                break;
            case 22:
                FileWriterEx bb6=new FileWriterEx();
                bb6.filewriter();
                break;
            case 23:
                FileUploadEx bb7=new FileUploadEx();
                bb7.fileupload();
                break;
//            case 24:
//                InputStreamReader bb8=new InputStreamReader();
//                bb8.inputstreamreader();
//                break;
//            case 25:
//                OutputStreamWriterEx bb9=new OutputStreamWriterEx();
//                outputstreamwriter();
//                break;







        }

    }
}