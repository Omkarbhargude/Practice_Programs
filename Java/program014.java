import java.util.Scanner;

class Display
{
    public char ch;

    public Display(char a)
    {
        this.ch = a;
    }

    public void DisplayConvert()
    {
        if((ch >= 'A') && (ch <= 'Z'))
        {
            ch = (char) ((char)ch + 32);

            System.out.println(ch);
        }
        else if((ch >= 'a') && (ch <= 'z'))
        {
            ch = (char) ((char)ch - 32); 
                                      
            System.out.println(ch);
        }
    }
}
class program014
{
    public static void main(String A[])
    {
        char cValue = '\0';
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a character : ");
        cValue = sobj.next().charAt(0);

        Display dobj = new Display(cValue);

        dobj.DisplayConvert();

        sobj.close();

        dobj = null;
    }
}