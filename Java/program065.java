import java.util.*;

class StringX
{
    public char ch;

    public StringX(char A)
    {
        this.ch = A;
    }

    public boolean CheckAlpha()
    {
        boolean bFlag = false;

        if((ch >= 'A') && (ch <= 'Z') || (ch >= 'a') && (ch <= 'z'))
        {
            bFlag = true;
        }

        return bFlag;
    }
}

class program065
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Character : ");
        char ch = sobj.next().charAt(0);
        
        StringX stobj = new StringX(ch);

        boolean bRet = stobj.CheckAlpha();

        if(bRet == true)
        {
            System.out.println("It is a character");
        }
        else
        {
            System.out.println("It is not a character");
        }

    }
}