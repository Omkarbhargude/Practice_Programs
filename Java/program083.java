import java.util.*;

class StringX
{
    public String str;

    public StringX(String A)
    {
        this.str = A;
    }

    public int CountSpaces()
    {
        int iCnt = 0, iCount = 0;
        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] ==' ')
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class program083
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sobj.nextLine();

        StringX stobj = new StringX(str);

        int iRet = stobj.CountSpaces();

        System.out.println("Number of whitespaces are : "+iRet);
    }
}