import java.util.*;
import java.io.*;

class program033
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
                System.out.println("Directory is present ");

                File Arr[] = fobj.listFiles();

                System.out.println("Number of file present in Directory are : "+Arr.length);
            }
        }
        catch(Exception iobj)
        {}
    }
}