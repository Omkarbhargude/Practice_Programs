import java.util.Scanner;

class Display
{
    public int iNo1, iNo2;

    public Display(int a, int b)
    {
        this.iNo1 = a;
        this.iNo2 = b;
    }

    public void Display()
    {
        int iCnt = 0;

        if(iNo2 < 0)
        {
            iNo2 = -iNo2;
        }

        for(iCnt = 1; iCnt <= iNo2; iCnt++)
        {
            System.out.println(iNo1);
        }
    }
}

class program009
{
    public static void main(String A[])
    {
        int iValue = 0, iValue2 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        iValue = sobj.nextInt();

        System.out.println("Enter Second number : ");
        iValue2 = sobj.nextInt();


        Display dobj = new Display(iValue,iValue2);

        dobj.Display();

        sobj.close();

    }
}