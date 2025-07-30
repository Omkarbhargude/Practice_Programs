import java.util.*;
import java.io.*;

class program034
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of directory : ");
            String DirName = sobj.nextLine();

            File fobj = new File(DirName);
            if(fobj.exists())
            {
                System.out.println(DirName+" is opened succesfully");

                FileInputStream fiobj = new FileInputStream(fobj);

                byte HeaderBuffer[] = new byte[100];

                String Header = null;

                int iRet = 0;

                while((iRet = fiobj.read(HeaderBuffer,0,100)) != -1)
                {
                    Header = new String(HeaderBuffer);

                    Header = Header.trim();

                    String Tokens[] = Header.split(" ");

                    File fobjnew = new File(Tokens[0]);

                    fobjnew.createNewFile();

                    FileOutputStream foobj = new FileOutputStream(Tokens[0]);

                    foobj.write(Header.getBytes());

                    int FileSize = Integer.parseInt(Tokens[1]);

                    byte Buffer[] = new byte[FileSize];

                    fiobj.read(Buffer,0,FileSize);

                    foobj.write(Buffer,0,FileSize);
                }
            }
            else
            {
                System.out.println("Directory is not present ");
            }
        }
        catch(Exception iobj)
        {}
    }
}