# input 4 
# 
def Display(data):

    for ch in data:
        print(ch,end="\t")

    print()


def main():

    print("Enter the String : ")
    str = input()

    Display(str)
    
if __name__ == "__main__":
    main()