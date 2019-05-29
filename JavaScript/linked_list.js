class Node{
    constructor(value){
        this.value = value
        this.nextNode = null
    }

    linkNext(node){
        this.nextNode = node
    }

    getNext(){
        return this.nextNode
    }
}

class LinkedList{

    constructor(){
        this.head = null
        this.size = 0
    }

    addHead(value){
        if (this.head == null){
            this.head = new Node(value)
        }else{
            var temp = this.head
            var newHead = new Node(value)
            newHead.linkNext(temp)
            this.head = newHead
        }
        this.size++
    }

}

nodo = new LinkedList()
nodo.addHead("nodito2")
nodo.addHead("nodito3")
nodo.addHead("nodito4")


console.log(nodo.size)