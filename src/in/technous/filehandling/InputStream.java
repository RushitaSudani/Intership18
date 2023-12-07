package in.technous.filehandling;

import java.io.FileInputStream;

public class InputStream {
    public void inputstream()
    {
        try
        {
            FileInputStream fis=new FileInputStream("j1.txt");
            int i=fis.read();
            System.out.print((char)i);
            fis.close();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
