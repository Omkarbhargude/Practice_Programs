import java.util.*;

class StringX
{
    public char ch;

    public StringX(char A)
    {
        this.ch = A;
    }

    public void DisplayCorresponding()
    {
        if((ch >= 'A') && (ch <= 'Z'))
        {
            ch = (char)(ch + 32);
        }
        else if((ch >= 'a') && (ch <= 'z'))
        {
            ch = (char)(ch - 32);
        }

        System.out.println(ch);
    }
}

class program070
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Character : ");
        char cValue = sobj.next().charAt(0);
        
        StringX stobj = new StringX(cValue);

        stobj.DisplayCorresponding();

    }
}