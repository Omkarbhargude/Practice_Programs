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
        char Arr[] = str.toCharArray();
        int iCnt = 0, iCount = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCount++;
            }
        }

        return iCount;
    }
}
class program062
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String data = sobj.nextLine();

        StringX stobj = new StringX(data);

        int iRet = stobj.CountSmall();

        System.out.println("Number small characters are : "+iRet);
    }
}