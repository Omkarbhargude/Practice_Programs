import java.util.*;

class Practice
{
    public int iNo;

    public Practice(int A)
    {
        this.iNo = A;
    }

    public int DiffSumFactNonFact()
    {
        int iCnt = 0, iSum1 = 0, iSum2 = 0;

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                iSum1 = iSum1 + iCnt;
            }
            else
            {
                iSum2 = iSum2 + iCnt;
            }
        }

        return iSum2 - iSum1;
    }
}

class program039
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        Practice pobj = new Practice(iValue);

        int iRet = pobj.DiffSumFactNonFact();

        System.out.println(iRet);
    }
}