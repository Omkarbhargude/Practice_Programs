import java.util.*;

class program054
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        String str = "JAY GANESH...";

        // Using charAt() method to count the no of ouccrence of character A
        int i = 0, iCount = 0;

        for(i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'A')
            {
                iCount++;
            }
        }        


        System.out.println("A ouccered "+iCount+" number of time");
    }
}