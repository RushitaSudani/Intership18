package in.technous.filehandling;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamEx {
    public void bytearrayinput()
    {

        try
        {
            byte[] b={35,46,12,89};
            ByteArrayInputStream bi=new ByteArrayInputStream(b);
            int i=0;
            while((i=bi.read())!=-1)
            {
                //Conversion of a byte into character
                char c=(char)i;
                System.out.println("ASCII value of Character is:"+i+"special symbol is:"+c);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
