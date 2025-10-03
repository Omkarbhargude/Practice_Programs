function SumDigits(No)
{
    let Sum = 0
    let iDigit = 0

    while(No != 0)
    {
        iDigit = No % 10
        Sum = Sum + iDigit
        No = Math.floor(No / 10)
    }

    return Sum
}

let value = 123
let iRet = 0
iRet = SumDigits(value)

console.log("Sum of Digits are : "+iRet)