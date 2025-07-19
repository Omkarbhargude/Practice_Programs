import java.util.Scanner;

class Pattern
{
    public int iNo;

    public Pattern(int A)
    {
        this.iNo = A;
    }

    public void Display()
    {
        if(iNo < 10)
        {
            System.out.println("HELLO");
        }
        else
        {
            System.out.println("DEMO");
        }
    }
}

class program008
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern(iValue);

        pobj.Display();

        sobj.close();

    }
}