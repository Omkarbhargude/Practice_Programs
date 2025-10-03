function CheckPerfect(No)
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

    if(iSum == No)
    {
        return true
    }

}

let value = 28
let iRet = false
iRet = CheckPerfect(value)

if(iRet == true)
{
    console.log(value+" is a perfect number")
}
else
{
    console.log(value+" is a not perfect number")
}
