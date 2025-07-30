import java.util.*;

class Practice
{
    public int iNo;

    public Practice(int A)
    {
        this.iNo = A;
    }

    public void Display()
    {
        int iCnt = 0, iMult = 0;

        if(iNo < 0)             //Updater for negative input           
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= 5; iCnt++)
        {
            iMult = iNo * iCnt;

            System.out.print(iMult+"\t");
        }

        System.out.println();
    }
}

class program044
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter a number : ");
        iValue = sobj.nextInt();

        Practice pobj = new Practice(iValue);

        pobj.Display();
    }
}