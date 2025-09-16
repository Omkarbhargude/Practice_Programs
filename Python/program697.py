class Node:
    def __init__(self,No):
        self.Data = No
        self.Next = None

class singlyLL:
    def __init__(self):
        self.First = None
        self.iCount = 0

###############################################################################################
    def InsertFirst(self,No):
        newn = Node(No)

        if(self.First == None):       # LL is empty
            self.First = newn
        else:                         #LL contains atleast one node
            newn.Next = self.First
            self.First = newn

        self.iCount = self.iCount + 1
##############################################################################################

    def Display(self):
        pass

    def Count(self):
        return self.iCount

def main():
    print("Demonstration of singly linear linkedlist")

    sobj = singlyLL()
    sobj.InsertFirst(51)
    sobj.InsertFirst(21)
    sobj.InsertFirst(11)

    iRet = sobj.Count()

    print(iRet)

if __name__ == "__main__":
    main()