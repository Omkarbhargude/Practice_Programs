import java.util.Scanner;

class Display
{
    public int iNo;

    public Display(int a)
    {
        this.iNo = a;
    }

    public void PrintEven()
    {
        int iCnt = 0, iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iSum = iSum + 2;

            System.out.println(iSum);
        }
    }
}
class program011
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        Display dobj = new Display(iValue);

        dobj.PrintEven();

        sobj.close();

        dobj = null;

    }
}