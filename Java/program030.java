import java.util.*;
import java.io.*;

class program030
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of file that you want to write: ");
            String Fname = sobj.nextLine();

            File fobj = new File(Fname);

            if(fobj.exists())
            {
               FileInputStream fiobj = new FileInputStream(fobj);

               byte Arr[] = new byte[1024];

               int iRet = 0;

               while((iRet = fiobj.read(Arr)) != -1)
               {
                    String str = new String(Arr,0,iRet);

                    System.out.println(str);
               }
            }
            else
            {
                System.out.println("File is not present in current directory ");
                return;
            }
        }
        catch(IOException iobj)
        {}

    }
}