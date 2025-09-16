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
    def InsertLast(self,No):
        newn = Node(No)
        temp = self.First

        if(self.First == None):      
            self.First = newn
        else:   

            while(temp.Next != None):
                temp = temp.Next

            temp.Next = newn                     

        self.iCount = self.iCount + 1
##############################################################################################
    def DeleteFirst(self):

        if(self.First == None):
            return
        else:
            temp = self.First

            self.First = self.First.Next

            del temp

        self.iCount = self.iCount - 1
 ##############################################################################################
    def DeleteLast(self):

        if(self.First == None):     # LL is empty
            return

        elif(self.First.Next == None):
            del self.First
            self.First = None
        
        else:

            temp = self.First

            while(temp.Next.Next != None):
                temp = temp.Next

            del temp.Next

            temp.Next = None

        self.iCount = self.iCount - 1

################################################################################################
    def Display(self):
        temp = self.First

        while(temp != None):
            print(f"| {temp.Data} | ->",end="")
            temp = temp.Next

        print("None")

################################################################################################     
    def Count(self):
        return self.iCount
###############################################################################################
def main():
    print("Demonstration of singly linear linkedlist")

    sobj = singlyLL()
    sobj.InsertFirst(51)
    sobj.InsertFirst(21)
    sobj.InsertFirst(11)
    sobj.Display()

    iRet = sobj.Count()

    print(iRet)


    sobj.InsertLast(101)
    sobj.InsertLast(111)
    sobj.InsertLast(121)

    sobj.Display()

    iRet = sobj.Count()

    print(iRet)

    sobj.DeleteFirst()

    sobj.Display()

    sobj.DeleteLast()
    sobj.Display()



if __name__ == "__main__":
    main()