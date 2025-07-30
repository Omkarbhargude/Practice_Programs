import java.util.*;
import java.io.*;

class program024
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

               byte Arr[] = new byte[10];

               fiobj.read(Arr);
               String str = new String(Arr);

               System.out.println("Data from file is : "+str);
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