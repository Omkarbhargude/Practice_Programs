import java.util.*;

class StringX
{
    public String str;

    public StringX(String A)
    {
        this.str = A;
    }

    public int CountCapital()
    {
        int iCnt = 0, iCountCap = 0;

        char Arr[] = str.toCharArray();
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                iCountCap++;
            }
        }

        return iCountCap;
    }
}

class program073
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sobj.nextLine();

        StringX stobj = new StringX(str);

        int iRet = 0;

        iRet = stobj.CountCapital();

        System.out.println("Number of Capital characters in string are : "+iRet);
    }
}