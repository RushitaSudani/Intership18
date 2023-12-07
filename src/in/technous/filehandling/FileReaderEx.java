package in.technous.filehandling;

import java.io.FileReader;

public class FileReaderEx {
    public void filereader()
    {
        try
        {

            FileReader rd=new FileReader("j1.txt");
            int i=rd.read();

            while(i!=-1)
            {
                System.out.print((char)i);
                i=rd.read();
            }
            rd.close();

        }
        catch(Exception e)
        {
            System.out.print(e.getMessage());
        }
    }
}
