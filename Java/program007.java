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

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        iCnt = 1;
        while(iCnt <= iNo)
        {
            System.out.print("*\t");
            iCnt++;
        }

        System.out.println();
    }
}

class program007
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