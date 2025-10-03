function Maximum(Brr)
{
    let iMax = Brr[0]
    let i = 0

    for(i = 0; i < Brr.length; i++)
    {
        if(Brr[i] > iMax)
        {
            iMax = Brr[i]
        }
    }

    return iMax
}

Arr = [11,21,51,101,111,121,412,212,21,91]

let iRet = Maximum(Arr)

console.log("Maximum  is "+iRet)

