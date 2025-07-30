import java.util.*;

class Practice
{
    public int iNo;

    public Practice(int A)
    {
        this.iNo = A;
    }

    public int MultFact()
    {
        int iCnt = 0, iMult = 1;

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iMult = iMult * iCnt;
            }
        }

        return iMult;
    }
}

class program035
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iRet = 0;

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        Practice pobj = new Practice(iValue);

        iRet = pobj.MultFact();

        System.out.println("Multiplication of factors is : "+iRet);

    }
}