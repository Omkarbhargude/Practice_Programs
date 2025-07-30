import java.util.*;
import java.io.*;

class program018
{
    public static void main(String A[])
    {
        try
        {
            File fobj = new File("Demo.txt");

            if(fobj.exists())
            {
                System.out.println("File already present");
                return;
            }
            else
            {
                fobj.createNewFile();

                System.out.println("File created succesfully");
            }
        }
        catch(IOException iobj)
        {}

    }
}