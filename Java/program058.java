import java.util.*;

class program058
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sobj.nextLine();

        char Arr[] = name.toCharArray();

        int i = 0, iCount = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                iCount++;
            }
        }

        System.out.println("Number small characters are : "+iCount);
    }
}