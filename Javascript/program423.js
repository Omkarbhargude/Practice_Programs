function CountDigits(No)
{
    let Count = 0

    while(No != 0)
    {
        No = Math.floor(No / 10)
        console.log(No)
        Count++
    }

   
    return Count
}

let value = 123
let iRet = 0
iRet = CountDigits(value)

console.log("Digits are : "+iRet)