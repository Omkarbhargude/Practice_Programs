class print
{
    public void Display()
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 5; iCnt++)
        {
            System.out.println("Jay Ganesh...");
        }
    }
}

class program002
{
    public static void main(String A[])
    {
        print pobj = new print();

        pobj.Display();

    }
}