package in.technous.filehandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutEx {
    public void datainputoutput()
    {
        try
        {
            DataOutputStream dos=new DataOutputStream(new FileOutputStream("data.dat"));
            dos.writeInt(123);
            dos.writeFloat(12.3f);
            dos.writeLong(789);
            System.out.println("written successfully");

            dos.close();

            DataInputStream dis=new DataInputStream(new FileInputStream("data.dat"));
            int i=dis.readInt();
            float f=dis.readFloat();
            double d=dis.readDouble();

            dis.close();

            System.out.println("int is:"+i);
            System.out.println("float is:"+f);
            System.out.println("double is:"+d);

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
