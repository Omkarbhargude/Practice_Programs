class Node:
    def __init__(self,No):
        self.Data = No
        self.Next = None

def main():
    print("Demonstration of singly linear linkedlist")

    obj1 = Node(11)
    obj2 = Node(21)
    obj3 = Node(51)

    obj1.Next = obj2
    obj2.Next = obj3
    obj3.Next = None

    head = obj1

    while(head != None):
        print(head.Data,end=" ")
        head = head.Next

    print()
        

if __name__ == "__main__":
    main()