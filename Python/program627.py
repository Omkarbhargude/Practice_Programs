def Reverse(iNo):
    iDigit = 0
    iRev = 0

    while(iNo != 0):
        iDigit = iNo % 10
        iRev = iRev * 10 + iDigit
        iNo = iNo // 10


    return iRev

def main():
    print("Enter number : ")
    Value = int(input())

    iRet = 0
    iRet = Reverse(Value)

    print(f"Reverse number of {Value} is {iRet}")

if __name__ == "__main__":
    main()