import java.util.*;

class StringX
{
    public String str;
    public char ch;

    public StringX(String A, char B)
    {
        this.str = A;
        this.ch = B;
    }

    public int CountChar()
    {
        int iCnt = 0, iCount = 0;

        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == ch)
            {
                iCount++;
            }
        }

        return iCount;
    }
}

class program085
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sobj.nextLine();

        System.out.println("Enter the character : ");
        char ch = sobj.next().charAt(0);

        StringX stobj = new StringX(str,ch);

        int iRet = stobj.CountChar();

        System.out.println(ch+" ouccered "+iRet+" number of time in string");
    }
}