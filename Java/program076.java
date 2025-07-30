import java.util.*;

class StringX
{
    public String str;

    public StringX(String A)
    {
        this.str = A;
    }

    public boolean CheckVowel()
    {
        boolean bFlag = false;

        int iCnt = 0;

        char Arr[] = str.toCharArray();
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] == 'a') || (Arr[iCnt] == 'A') || (Arr[iCnt] == 'e') || (Arr[iCnt] == 'E') || (Arr[iCnt] == 'i') || (Arr[iCnt] == 'I') || (Arr[iCnt] == 'o') || (Arr[iCnt] == 'O'))            
            {
                bFlag = true;
            }
        }

        return bFlag;
    }
}

class program076
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a String : ");
        String str = sobj.nextLine();

        StringX stobj = new StringX(str);

        boolean bRet = stobj.CheckVowel();

        if(bRet == true)
        {
            System.out.println("String contains vowel characters");
        }
        else
        {
            System.out.println("String does not contains vowel characters");
        }

    }
}