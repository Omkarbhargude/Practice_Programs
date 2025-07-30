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
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if((iNo % iCnt) != 0)
            {
                System.out.print(iCnt+"\t");
            }
        }

        System.out.println();
    }
}

class program037
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