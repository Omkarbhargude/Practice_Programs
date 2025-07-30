import java.util.*;
import java.io.*;

class program021
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of file that you want to create : ");
            String Fname = sobj.nextLine();

            File fobj = new File(Fname);

            if(fobj.exists())
            {
                System.out.println("File already present");
                return;
            }
            else
            {
                fobj.createNewFile();

                System.out.println("File created successfully");

                System.out.println("File name is : "+fobj.getName());
                System.out.println("File size is : "+fobj.length());
            }
        }
        catch(IOException iobj)
        {}

    }
}