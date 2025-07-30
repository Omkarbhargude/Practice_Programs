import java.util.*;

class StringX
{
    public char ch;

    public StringX(char A)
    {
        this.ch = A;
    }

    public boolean CheckDigit()
    {
        boolean bFlag = false;

        if((ch >= '0') && (ch <= '9'))
        {
            bFlag = true;
        }

        return bFlag;
    }
}

class program067
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Character : ");
        char cValue = sobj.next().charAt(0);
        
        StringX stobj = new StringX(cValue);

        boolean bRet = stobj.CheckDigit();

        if(bRet == true)
        {
            System.out.println("It is Digit");
        }
        else
        {
            System.out.println("It is not Digit");
        }

    }
}