import java.util.*;
import java.io.*;

class program016
{
    public static void main(String A[])
    {
        
        File fobj = new File("Demo.txt");

        fobj.createNewFile();                  // throws IOException use try catch block
    }
}