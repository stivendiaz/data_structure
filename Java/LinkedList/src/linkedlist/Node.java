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
public class Node {
    private Node NodoSiguiente = null;
    Object valor;

    public Node(Object valor) {
        this.NodoSiguiente = null;
        this.valor = valor;
    }

    public Node getNext() {
        return NodoSiguiente;
    }

    public void setNext(Node NodoSiguiente) {
        this.NodoSiguiente = NodoSiguiente;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }
    
    
}
