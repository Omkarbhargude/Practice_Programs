import java.util.*;

class StringX
{
    public char ch;

    public StringX(char A)
    {
        this.ch = A;
    }

    public boolean CheckCapital()
    {
        boolean bFlag = false;

        if((ch >= 'A') && (ch <= 'Z'))
        {
            bFlag = true;
        }

        return bFlag;
    }
}

class program066
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Character : ");
        char cValue = sobj.next().charAt(0);
        
        StringX stobj = new StringX(cValue);

        boolean bRet = stobj.CheckCapital();

        if(bRet == true)
        {
            System.out.println("Character is capital");
        }
        else
        {
            System.out.println("Character is not capital");
        }

    }
}