function SumFactors(No)
{
    let i = 0
    let iSum = 0

    for(i = 1; i <= (No / 2); i++)
    {
        if(No % i == 0)
        {
            iSum = iSum + i
        }
    }

    return iSum
}

let value = 12
let iRet = SumFactors(value)

console.log("Summation of factors is "+iRet)

