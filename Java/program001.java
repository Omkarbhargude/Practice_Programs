import java.util.Scanner;

class Division
{
    public int iNo1, iNo2;

    public Division(int a, int b)
    {
        this.iNo1 = a;
        this.iNo2 = b;
    }

    public int Divide()
    {
        int iAns = 0;

        if(iNo2 < 0)
        {
            return -1;
        }

        iAns = iNo1 / iNo2;


        return iAns;
    }
}
class program001
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Second number : ");
        iValue2 = sobj.nextInt();

        Division dobj = new Division(iValue1,iValue2);

        int iRet = dobj.Divide();

        System.out.println("Division is : "+iRet);

        sobj.close();

    }
}