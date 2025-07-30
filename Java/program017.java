import java.util.*;
import java.io.*;

class program017
{
    public static void main(String A[])
    {
        try
        {
            File fobj = new File("Demo.txt");

            fobj.createNewFile();
        }
        catch(IOException iobj)
        {}

    }
}