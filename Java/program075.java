import java.util.*;

class StringX
{
    public String str;

    public StringX(String A)
    {
        this.str = A;
    }

    public int DiffFrequency()
    {
        int iCnt = 0, iCountCap = 0, iCountSmall = 0;

        char Arr[] = str.toCharArray();
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCountSmall++;
            }
            else if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                iCountCap++;
            }
        }

        return (iCountSmall - iCountCap);
    }
}

class program075
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sobj.nextLine();

        StringX stobj = new StringX(str);

        int iRet = 0;

        iRet = stobj.DiffFrequency();

        System.out.println("Difference between capital and small characters are : "+iRet);
    }
}