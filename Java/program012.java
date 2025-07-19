import java.util.Scanner;

class Display
{
    public int iNo;

    public Display(int a)
    {
        this.iNo = a;
    }

    public void PrintFactors()
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iCnt % 2) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}
class program012
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        Display dobj = new Display(iValue);

        dobj.PrintFactors();

        sobj.close();

        dobj = null;
    }
}