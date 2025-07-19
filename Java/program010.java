import java.util.Scanner;

class Check
{
    public int iNo;

    public Check(int A)
    {
        this.iNo = A;
    }

    public boolean CheckEven()
    {
        boolean bFlag = false;

        if((iNo % 2) == 0)
        {
            bFlag = true;
        }

        return bFlag;
    }
}

class program010
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        Check cobj = new Check(iValue);

        boolean bRet = cobj.CheckEven();

        if(bRet == true)
        {
            System.out.println(iValue+" is Even number");
        }
        else
        {
            System.out.println(iValue+" is Odd number");
        }


    }
}