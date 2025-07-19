import java.util.Scanner;

class Check
{
    public int iNo;

    public Check(int a)
    {
        this.iNo = a;
    }

    public boolean Check()
    {
        boolean bFlag = false;

        if(iNo % 5 == 0)
        {
            bFlag = true;
        }

        return bFlag;
    }
}
class program004
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number : ");
        iValue = sobj.nextInt();

        Check cobj = new Check(iValue);

        boolean bRet = false;

        bRet = cobj.Check();

        if(bRet == true)
        {
            System.out.println(iValue+" is divisible by 5");
        }
        else
        {
            System.out.println(iValue+" is not divisible by 5");
        }

        sobj.close();
    }
}