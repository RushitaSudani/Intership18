package in.technous.filehandling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx {
    public void bufferedoutput()
    {
        try
        {
            FileOutputStream fis=new FileOutputStream("j3.txt");
            BufferedOutputStream bi=new BufferedOutputStream(fis);
            String s="java is a object oriented language";
            byte[]b=s.getBytes();
            bi.write(b);
            bi.close();
            System.out.println("success..");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
