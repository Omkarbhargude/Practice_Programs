import java.util.*;

class program056
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sobj.nextLine();

        // used to convert string array of character
        char Arr[] = name.toCharArray();

        System.out.println(Arr);

        System.out.println(Arr.length);

    }
}