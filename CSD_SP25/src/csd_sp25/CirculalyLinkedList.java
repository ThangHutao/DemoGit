 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csd_sp25;

/**
 *
 * @author Family
 */
public class CirculalyLinkedList {

    
    class Node{
        int data;
        Node next;
        
        
        public Node(int x, Node next){
            this.data = x;
            this.next = next;
        }
        
        public Node(int x){
            this(x,null);
        }               
    }
    
    
    Node tail;
    
    void addLast(int x){
        if (isEmpty()){ 
         tail = new Node(x);
         tail.next = tail;}
          else {
            tail.next = new Node(x, tail.next);
            tail = tail.next;
            
             }         
        
        
    }
     boolean isEmpty() {
        return tail == null;
    }
     
    void traverse(){
        if (isEmpty()) System.out.println("The list is empty");
        else{
            Node current = tail.next;
            do {
                System.out.print(current.data + "  ");
                current = current.next;
            } while(current != tail.next);
                System.out.println();
                          
            }
        
    } 
    
    void addFirst(int x){
        if (isEmpty()){ 
         tail = new Node(x);
         tail.next = tail;}
          else {
            tail.next = new Node(x, tail.next);                   
          }         
    }
    
    void removeFirst(){
        if (isEmpty()) System.out.println("The list is empty");
        else{
            if(tail == tail.next) tail = null;
            else{
                tail.next = tail.next.next;
            }
        }
        
    }
    
    void removeLast(){
        if (isEmpty()) System.out.println("The list is empty");
        else{
            if (tail == tail.next) tail = null;
            else{
                Node current = tail.next;
                while(current.next != tail){
                    current = current.next;
                }
                current.next = tail.next;
                tail = current;
            }
        }
    }

}
