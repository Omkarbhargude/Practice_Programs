# input 4 
# 
def Display(data):

    for i in range(len(data)):
        for ch in data:
            print(ch,end="\t")
        print()

    print()

def main():

    print("Enter the String : ")
    str = input()

    Display(str)
    
if __name__ == "__main__":
    main()