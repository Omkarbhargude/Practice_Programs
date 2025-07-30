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

    public int FirstOucc()
    {
        int iCnt = 0, iOucc = 0;

        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == ch)
            {
                iOucc = iCnt;
                break;
            }
        }

        return iOucc+1;

    }
}

class program086
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sobj.nextLine();

        System.out.println("Enter the character : ");
        char ch = sobj.next().charAt(0);

        StringX stobj = new StringX(str,ch);

        int iRet = stobj.FirstOucc();

        if(iRet > 0)
        {
            System.out.println("First ouccrence of character is at : "+iRet);
        }
        else
        {
            System.out.println("Character not found");
        }
    }
}