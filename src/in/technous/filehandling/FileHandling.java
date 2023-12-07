package in.technous.filehandling;

import java.io.*;
public class FileHandling {
    public static void main(String args[])
    {
        try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("1)OutputStream");
            System.out.println("1)OutputStream");
            //https://github.com/RushitaSudani/javacollectionRepo1.git
            System.out.println("2)InputStream");
            System.out.println("3)BufferedInputStream");
            System.out.println("4)BufferedOutputStream");
            System.out.println("5)ByteArrayInputStream");
            System.out.println("6)ByteArrayOutputStream");
            System.out.println("7)DataInputOutputStream");
            System.out.println("8)FileReader");
            System.out.println("9)FileWriter");
            System.out.println("10)fileUpload");
            System.out.println("11)InputStreamReader");
            System.out.println("12)OutputStreamWrite");
            System.out.print("enter your choice:");
            int choice=Integer.parseInt(br.readLine());
            switch(choice)
            {
                case 1:
                    outputstream();
                    break;
                case 2:
                    inputstream();
                    break;
                case 3:
                    bufferedinput();
                    break;
                case 4:
                    bufferedoutput();
                    break;
                case 5:
                    bytearrayinput();
                    break;
                case 6:
                    bytearrayoutput();
                    break;
                case 7:
                    datainputoutput();
                    break;
                case 8:
                    filereader();
                    break;
                case 9:
                    filewriter();
                    break;
                case 10:
                    fileupload();
                    break;
                case 11:
                    inputstreamreader();
                    break;
                case 12:
                    outputstreamwriter();
                    break;

                default:
                    System.out.println("invalid choice");

            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }


    }
    private static void outputstream()
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
    private static void inputstream()
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
    private static void bufferedinput()
    {
        try
        {
            FileInputStream fis=new FileInputStream("j2.txt");
            BufferedInputStream bi=new BufferedInputStream(fis);
            int i=0;
            while((i=bi.read())!=-1)
            {
                System.out.println((char)i);
                System.out.println("first branch");
            }
            bi.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    private static void bufferedoutput()
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
    private static void bytearrayinput()
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
    private static void bytearrayoutput()
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
    private static void datainputoutput()
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
    private static void filereader()
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
    private static void filewriter()
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
    private static void fileupload()
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
    private static void inputstreamreader()
    {
        try
        {
            InputStream ir=new FileInputStream("j1.txt");
            Reader r=new InputStreamReader(ir);
            int i=r.read();
            while(i!=-1)
            {
                System.out.print((char)i);
                i=r.read();
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
    private static void outputstreamwriter()
    {
        try
        {
            OutputStream outputStream = new FileOutputStream("output.txt");
            Writer outputStreamWriter = new OutputStreamWriter(outputStream);

            outputStreamWriter.write("Hello World");

            outputStreamWriter.close();
        }
        catch (Exception e)
        {
            e.getMessage();
        }
    }

}


