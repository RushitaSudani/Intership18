package in.technous.filehandling;

import java.io.FileOutputStream;

public class OutputStream {
    public void test()
    {
        try
        {
            FileOutputStream fout=new FileOutputStream("j1.txt");
            fout.write("hello".getBytes());
            fout.close();
            System.out.println("success...");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
