import java.util.*;
import java.io.*;

class program022
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
               FileOutputStream foobj = new FileOutputStream(fobj);
               String str = "Jay Ganesh";

               foobj.write(str);
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