import java.util.*;
import java.io.*;

class program019
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of file that you want to create : ");
            String Fname = sobj.nextLine();

            File fobj = new File(Fname);

            fobj.createNewFile();
        }
        catch(IOException iobj)
        {}

    }
}