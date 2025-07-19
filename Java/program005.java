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
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("*\t");
        }

        System.out.println();
    }
}

class program005
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