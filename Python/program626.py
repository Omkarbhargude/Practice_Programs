def CountEvenDigit(No):
    iCount = 0
    iDigit = 0

    while(No != 0):
        iDigit = No % 10
        if(iDigit % 2 == 0):
            iCount = iCount + 1
        No = No // 10

    return iCount

def main():
    print("Enter number : ")
    Value = int(input())

    iRet = 0
    iRet = CountEvenDigit(Value)

    print(f"Number of even digits in {Value} are : {iRet}")


if __name__ == "__main__":
    main()