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
public class LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedListClass liga = new LinkedListClass();
        liga.addHead("Holi");
        liga.addHead(2);
        liga.addHead(3);
        liga.addTail(10);
        liga.addTail(11);
        liga.addHead(0);
        liga.deleteNode("Holi");
        liga.toStringList();
        System.out.println(" ");
        
    }


    
}
