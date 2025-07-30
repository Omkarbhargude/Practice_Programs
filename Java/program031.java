import java.util.*;
import java.io.*;

class program031
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of source file : ");
            String Source = sobj.nextLine();

            System.out.println("Enter the name of Destination file : ");
            String Destination = sobj.nextLine();

            File fSource = new File(Source);
            if(fSource.exists() == false)
            {
                System.out.println("The source file is not present");
                return;
            }

            File fDestinaion = new File(Destination);
            if(fDestinaion.exists() == true)
            {
                System.out.println("File already present in current directory");
                return;
            }

            fDestinaion.createNewFile();

            if(fDestinaion.exists())
            {
                System.out.println("File Succesfully created");
            }


        }
        catch(IOException iobj)
        {}
    }
}