import java.util.*;

class StringX
{
    public String str;

    public StringX(String A)
    {
        this.str = A;
    }

    public int CountSmall()
    {
        int iCnt = 0, iCountSmall = 0;

        char Arr[] = str.toCharArray();
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCountSmall++;
            }
        }

        return iCountSmall;
    }
}

class program074
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sobj.nextLine();

        StringX stobj = new StringX(str);

        int iRet = 0;

        iRet = stobj.CountSmall();

        System.out.println("Number of Small characters in string are : "+iRet);
    }
}