import java.util.*;

class StringX
{
    public String str;

    public StringX(String A)
    {
        this.str = A;
    }

    public void DisplayReverse()
    {
        int iCnt = 0, i = 0;

        char start[] = str.toCharArray();
        char end[] = str.toCharArray();
        char temp = '\0';

        i = end.length-1;

        for(iCnt = 0; iCnt < start.length; iCnt++,i--)
        {
            temp = start[iCnt];
            start[iCnt] = end[i];
            end[i] = temp;
        }

        System.out.println(start);
    }
}

class program088
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sobj.nextLine();

        StringX stobj = new StringX(str);

        stobj.DisplayReverse();

    }
}