def CountDigitX(iNo):
    iDigit = 0
    iCount = 0

    while(iNo != 0):
        iDigit = iNo % 10
        if(iDigit == 5):
            iCount = iCount + 1
        iNo = iNo // 10

    return iCount

def main():
    print("Enter number : ")
    Value = int(input())

    iRet = 0
    iRet = CountDigitX(Value)

    print(f"Frequency of 5 in {Value} is {iRet}")

if __name__ == "__main__":
    main()