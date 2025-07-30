import java.util.*;

class StringX
{
    public char ch;

    public StringX(char A)
    {
        this.ch = A;
    }

    public void DisplaySchedule()
    {
        if((ch == 'A') || (ch == 'a'))
        {
            System.out.println("Your Exam is at 7:00 AM");
        }
        else if((ch == 'B') || (ch == 'B'))
        {
            System.out.println("Your Exam is at 8:00 AM");
        }
        else if((ch == 'C') || (ch == 'c'))
        {
            System.out.println("Your Exam is at 9:00 AM");
        }
        else if((ch == 'D') || (ch == 'd'))
        {
            System.out.println("Your Exam is at 10:00 AM");
        }
        else
        {
            System.out.println("---- Worng Input ----");
        }

    }
}

class program069
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Character : ");
        char cValue = sobj.next().charAt(0);
        
        StringX stobj = new StringX(cValue);

        stobj.DisplaySchedule();

    }
}