class print
{
    public void Display()
    {
        int iCnt = 0;

        for(iCnt = 5; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}

class program003
{
    public static void main(String A[])
    {
        print pobj = new print();

        pobj.Display();

    }
}