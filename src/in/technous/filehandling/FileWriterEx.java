package in.technous.filehandling;

import java.io.FileWriter;

public class FileWriterEx {
    public void filewriter()
    {
        try
        {
            FileWriter fw=new FileWriter("w.txt");
            fw.write("Welcome to javaTpoint.");
            fw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Success...");

    }
}
