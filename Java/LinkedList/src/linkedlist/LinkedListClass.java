/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author kevin.armando.diaz
 */
public class LinkedListClass {

    private Node head;
    private Node tail;
    private int size = 0;

    public void addTail(Object valor) {
        if (head == null) {
            head = new Node(valor);
            tail = head;
        } else {
            Node NodoPenultimo = tail;
            tail = new Node(valor);
            NodoPenultimo.setNext(tail);
        }
        size++;

    }

    public void addHead(Object valor) {
        if (head == null) {
            head = new Node(valor);
        } else {
            Node temp = head;
            tail = head.getNext();
            head = new Node(valor);
            head.setNext(temp);
        }
        size++;
    }

    public void printList() {

    }

    public int getSize() {
        return size;
    }

    public void deleteNode(Object value) {
        Node iterator = head;
        Node previousNode = null;
        boolean found = false;

        while (iterator != null && !found) {
            found = (iterator.getValor().equals(value));
            if (!found) {
                previousNode = iterator;
                iterator = iterator.getNext();
            }

        }
        if(iterator!=null){
            if(iterator == head){
                head = iterator.getNext();
            }else{
               previousNode.setNext(iterator.getNext());
            }
        }
    }

    public void toStringList() {
        if (head != null) {
            Node temp = head;
            while (temp != null) {
                if (temp.getNext() != null) {
                    System.out.print(temp.getValor() + " -> ");
                } else {
                    System.out.print(temp.getValor());
                }
                temp = temp.getNext();
            }
        } else {
            System.out.println("Empty Object. ");
        }
    }

}
