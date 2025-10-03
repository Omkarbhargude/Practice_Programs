function CountSmall(Arr)
{
    let i = 0
    let iCount = 0

    for(i = 0; i < Arr.length; i++)
    {
        if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
        {
            iCount++
        }
    }

    return iCount
}

let ret = CountSmall("InDia")

console.log("Number of small characters are : "+ret)

