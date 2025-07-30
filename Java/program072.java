import java.util.*;

class StringX
{
    public char ch;

    public StringX(char A)
    {
        this.ch = A;
    }

    public boolean CheckSpecial()
    {
        boolean bFlag = true;

        if((ch >= 'A') && (ch <= 'Z') || (ch >= 'a') && (ch <= 'z') || (ch >= '0') && (ch <='9'))
        {
            bFlag = false;
        }

        return bFlag;
    }
}

class program072
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Character : ");
        char cValue = sobj.next().charAt(0);
        
        StringX stobj = new StringX(cValue);

        boolean bRet = stobj.CheckSpecial();

        if(bRet == true)
        {
            System.out.println("It is a special character");
        }
        else 
        {
            System.out.println("It is not a special character");
        }

    }
}