import java.util.*;
import java.io.*;

class program032
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

                FileInputStream fiobj = new FileInputStream(fSource);
                FileOutputStream foobj = new FileOutputStream(fDestinaion);

                byte Buffer[] = new byte[1024];
                int iRet = 0;

                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    foobj.write(Buffer,0,iRet);
                }

                System.out.println("File copied succesfully");

                System.out.println("File name is : "+fDestinaion.getName());
                System.out.println("File size is : "+fDestinaion.length());

                FileInputStream fin = new FileInputStream(fDestinaion);
                byte Arr[] = new byte[1024];


                while((iRet = fin.read(Arr)) != -1)
                {
                    String str = new String(Arr) ;

                    System.out.println("Data from file is : "+str);
                }
            }


        }
        catch(IOException iobj)
        {}
    }
}