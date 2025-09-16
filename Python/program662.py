# ERROR

def Replace(data):

    output = ""

    for ch in data:
        if(ch == 'a' ):
            output.append('_')
        else:
            output.append(ch)

    return output

def main():

    print("Enter String : ")
    str = input()

    strX = Replace(str)

    printf(f"Updated string is : {strX}")
    
if __name__ == "__main__":
    main()