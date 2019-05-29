class Node:
    def __init__(self,value):
        self.value = value
        self.nextNode = None
    
    def linkNext(self,node):
        self.nextNode = node

    def getNext(self):
        return self.nextNode
    
class LinkedList:
    def __init__(self):
        self.head = None
        self.size = 0
    

    def addHead(self,value):
        if self.head == None:
            self.head = Node(value)
        else:
            temp = self.head
            newHead = Node(value)
            newHead.linkNext(temp)
            self.head = newHead
        
        self.size+=1
    



obj1 = LinkedList()
obj1.addHead("2")
obj1.addHead("eee")


print(str(obj1.head.value))




