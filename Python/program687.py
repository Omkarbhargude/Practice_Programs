# input 5
'''

'''

def Display(iRow):
    
    for i in range(1,iRow+1,1):
        print(" "*(iRow-i),end="")
        print("* "*i)

    for i in range(iRow-1,0,-1):
        print(" "*(iRow-i),end="")
        print("* "*i)

def main():

    print("Enter number of Rows : ")
    iValue1 = int(input())

    Display(iValue1)
    
if __name__ == "__main__":
    main()