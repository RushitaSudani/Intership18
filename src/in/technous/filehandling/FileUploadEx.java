package in.technous.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileUploadEx {
    public void fileupload()
    {
        String source="C:/Users/Admin/Desktop/java/FileHandlingIO/Uplodfile/Hello.txt";
        String destination="C:/Users/Admin/Desktop/java/FileHandlingIO/Uploadedfile/Hello.txt";
        try {
            File f1 = new File(source);
            File f2 = new File(destination);
            //read a data from inputstream and write a data from outputstream
            FileInputStream fi = new FileInputStream(f1);
            FileOutputStream fo = new FileOutputStream(f2);
            byte[] buffer = new byte[1024]; //bytearray buffer ne create karsu data
            //data ne store karva mate size 1024 che and data ne read karse
            int c = 0; //file mathi je byte ne read karva ma avya hoy tena number ne hold kare
            while ((c = fi.read(buffer)) != -1)  //jya sudi end sudhi na poche tya sudhi read kava mate
            {
                fo.write(buffer, 0, c);

            }
            fi.close();
            fo.close();
            System.out.println("file upload successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
