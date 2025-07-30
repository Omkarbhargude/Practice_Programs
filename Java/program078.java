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
        int i = 0;

        char Arr[] = str.toCharArray();

        for(i = Arr.length-1; i >= 0; i--)
        {
            System.out.print(Arr[i]);
        }
        
        System.out.println();
    }
}

class program078
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