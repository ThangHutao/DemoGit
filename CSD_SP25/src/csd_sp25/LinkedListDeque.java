/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csd_sp25;

/**
 *
 * @author Family
 */
public class LinkedListDeque {
    class Node{
        int data;
        Node prev, next;

        public Node(int x, Node prev, Node next) {
            this.data = x;
            this.prev = prev;
            this.next = next;
        }
        
        public Node(int x){
            this(x,null,null);
        }
        
        Node head,tail ;
        // Double enqueue is a queue where add, remove, read can operate at its two end
        
        // AddFirst/Last RemoveFirst/Last front/last
        
       boolean isEmpty(){
           return head == null;
       }
       
       void addFirst(int x){
           Node newNode = new Node(x);
           if (isEmpty()) head = tail = newNode;
           else{
               newNode.next = head;
               head.prev = newNode;
               head = newNode;
               }
           
        }
       
       
        void addLast(int x){ 
         Node newNode = new Node(x);
          if (isEmpty()) head = tail = newNode;
          else {
              tail.next = newNode;
              newNode.prev = tail;
              tail = newNode;
             }
        }
        
        
         void removeLast(){
       if (isEmpty()) System.out.println("The queue is empty");
        else if (head == tail) head = tail = null;
        else {
            tail = tail.prev;
            tail.next = null;
            }
         }
         
         
        void removeFirst(){
        if (isEmpty()) System.out.println("List is empty");
        else {
            if (head == tail) tail = head = null;   
              head = head.next;
              head.prev = null;}
        }
        // return first node
        Node Front(){
            if(isEmpty()) {
                System.out.println("empty");
                return null;
            } else
                return head;
            
        }
        // return last node
        Node Last(){
            if(isEmpty()) {
                System.out.println("empty");
                return null;
            } else
                return tail;
        }
        
         // Traverse the deque from head to tail and then tail to head
       void traverse(){
       if (isEmpty()) System.out.println("empty");
       else {
         Node current = head;
         while(current!=null){
        //visit current node
         System.out.print("  " + current.data + "   ");
       // move to the next
         current = current.next;
         }
        System.out.println();
        current = tail;
         while(current !=null){
        //visit current node
         System.out.print("  " + current.data + "   ");
       // move to the next
         current = current.prev;
         }
        System.out.println();
        }
     }
       
       // 1. size() – Returns the number of elements in the deque.
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    
      // 2. clear() – Empties the deque by removing all nodes.
    public void clear() {
        // Optionally, you can also traverse and null each node’s pointers
        head = tail = null;
    }

    
    // 3a. contains(int x) – Checks if a given value exists in the deque.
    public boolean contains(int x) {
        Node current = head;
        while (current != null) {
            if (current.data == x) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
      // 3b. get(int index) – Returns the element at the given index (0-based indexing).
    public int get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Negative index");
        }
        Node current = head;
        int count = 0;
        while (current != null && count < index) {
            current = current.next;
            count++;
        }
        if (current == null) {
            throw new IndexOutOfBoundsException("Index exceeds deque size");
        }
        return current.data;
    }
        
        
        
        
        
    }
}