class Demo:
    #constructor
    def __init__(self):
        print("Inside Constructor")

    # Destructor
    def __del__(self):
        print("Inside Destructor")

def main():

    print("Inside Main")
    obj1 = Demo()
    obj2 = Demo()

    print("End of main")
    
if __name__ == "__main__":
    main()