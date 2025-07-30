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

    public boolean CheckChar()
    {
        int iCnt = 0;
        boolean bFlag = false;

        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == ch)
            {
                bFlag = true;
                break;
            }
        }

        return bFlag;
    }
}

class program084
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sobj.nextLine();

        System.out.println("Enter the character : ");
        char ch = sobj.next().charAt(0);

        StringX stobj = new StringX(str,ch);

        boolean bRet = stobj.CheckChar();

        if(bRet == true)
        {
            System.out.println("Character is present in string");
        }
        else
        {
            System.out.println("Character is not present in string");
        }
    }
}