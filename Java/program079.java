import java.util.*;

class StringX
{
    public String str;

    public StringX(String A)
    {
        this.str = A;
    }

    public String Strlwr()
    {
        int iCnt = 0;
        char Arr[] = str.toCharArray();

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);
            }
        }

        String newstr = new String(Arr);

        return newstr;
    }
}

class program079
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sobj.nextLine();

        StringX stobj = new StringX(str);

        String sRet = stobj.Strlwr();

        System.out.println("Modified string is : "+sRet);
    }
}