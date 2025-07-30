import java.util.*;

class StringX
{
    public String str;

    public StringX(String A)
    {
        this.str = A;
    }

    public String UpdateString()
    {
        char Arr[] = str.toCharArray();
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = '#';
            }
        }

        String NewStr = new String(Arr);

        return NewStr;
    }

}
class program064
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String data = sobj.nextLine();

        StringX stobj = new StringX(data);

        String sRet = stobj.UpdateString();

        System.out.println("Updated string is : "+sRet);
    }
}