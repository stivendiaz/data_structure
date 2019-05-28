class Node
    attr_accessor :value,:nextNode

    def initialize(value)
        @value = value
        @nextNode = nil
    end

    def linkNext(node)
        @nextNode = node
    end

    def getNext
        @nextNode
    end
end

class LinkedList
    attr_accessor :head,:size

    def initialize()
        @head = nil
        @size = 0
    end

    def addHead(value)
        if @head == nil
            @head = Node.new(value)
        else
            temp = @head
            newHead = Node.new(value)
            newHead.linkNext(temp)
            @head = newHead
        end
        @size+=1
    end

end




obj1 = LinkedList.new()
obj1.addHead('Forrest')

obj1.addHead('Dragon ball')
obj1.addHead('perriyo')



puts obj1.head.nextNode.nextNode.value


