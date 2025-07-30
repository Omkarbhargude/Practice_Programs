import java.util.*;

class StringX
{
    public char ch;

    public StringX(char A)
    {
        this.ch = A;
    }

    public void DisplayChar()
    {
        if((ch >= 'A') && (ch <= 'Z'))
        {
            while(ch <= 'Z')
            {
                System.out.print(ch+"\t");
                ch++;
            }
        }
        else if((ch >= 'a') && (ch <= 'z'))
        {
            while(ch >= 'a')
            {
                System.out.print(ch+"\t");
                ch--;
            }
        }

        System.out.println();
    }
}

class program071
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Character : ");
        char cValue = sobj.next().charAt(0);
        
        StringX stobj = new StringX(cValue);

        stobj.DisplayChar();

    }
}