import java.util.*;

class StringX
{
    public char ch;

    public StringX(char A)
    {
        this.ch = A;
    }

    public boolean CheckSmall()
    {
        boolean bFlag = false;

        if((ch >= 'a') && (ch <= 'z'))
        {
            bFlag = true;
        }

        return bFlag;
    }
}

class program068
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Character : ");
        char cValue = sobj.next().charAt(0);
        
        StringX stobj = new StringX(cValue);

        boolean bRet = stobj.CheckSmall();

        if(bRet == true)
        {
            System.out.println("Character is small");
        }
        else
        {
            System.out.println("Character is not small");
        }

    }
}