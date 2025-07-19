import java.util.Scanner;

class Display
{
    public char ch;

    public Display(char a)
    {
        this.ch = a;
    }

    public boolean ChkVowel()
    {
        boolean bFlag = false;

        if((ch == 'a' || ch == 'A') || (ch == 'e' || ch == 'E') || (ch == 'i' || ch == 'I') || (ch == 'o' || ch == 'O') || (ch == 'u' || ch == 'U'))
        {
            bFlag = true;
        }
        else
        {
            bFlag = false;
        }

        return bFlag;
    }
}
class program015
{
    public static void main(String A[])
    {
        char cValue = '\0';
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a character : ");
        cValue = sobj.next().charAt(0);

        Display dobj = new Display(cValue);

        boolean bRet = false;

        bRet = dobj.ChkVowel();

        if(bRet == true)
        {
            System.out.println("It is Vowel");
        }
        else
        {
            System.out.println("It is not Vowel");
        }

        sobj.close();

        dobj = null;
    }
}