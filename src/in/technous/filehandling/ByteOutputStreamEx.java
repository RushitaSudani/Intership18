package in.technous.filehandling;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteOutputStreamEx {
    public void bytearrayoutput()
    {
        try
        {
            FileOutputStream fou1=new FileOutputStream("j1.txt");
            FileOutputStream fou2=new FileOutputStream("j2.txt");

            ByteArrayOutputStream byu=new ByteArrayOutputStream();
            byu.write(65);
            String str="hi!....";
            byte[]b=str.getBytes();
            byu.write(b);
            byu.writeTo(fou1);
            byu.writeTo(fou2);
            byu.close();
            System.out.println("success..");

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
