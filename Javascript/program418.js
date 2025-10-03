function Summation(Brr)
{
    let Sum = 0
    let i = 0

    for(i = 0; i < Brr.length; i++)
    {
        Sum = Sum + Brr[i]
    }

    return Sum
}

Arr = [11,21,51,101,111,121]

let iRet = Summation(Arr)

console.log("Summation  is "+iRet)

