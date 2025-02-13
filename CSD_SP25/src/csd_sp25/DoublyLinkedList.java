/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csd_sp25;

/**
 *
 * @author Family
 */
public class DoublyLinkedList {
 class Node{
     int data;
     Node next, prev;
 
  public Node(int x, Node prev, Node next){
   this.data = x;
   this.next = next;
   this.prev = prev;
    } 
  
  public Node(int x){
   this(x,null,null); }
    }
 
 
   Node head, tail;
   public DoublyLinkedList(){
       head = tail = null;
   }
   // write a function to checl whether the list is empty
   boolean isEmpty(){
     return head == null;
   }
   // write a function to add new node to the last of the list
      void addLast(int x){ 
          Node newNode = new Node(x) ;
          if (isEmpty()) head = tail = newNode;
          else {
//              tail.next = newNode;
//              newNode.prev = tail;
//              tail = newNode;
               tail.next = new Node(x,tail,null);
               tail = tail.next;
               }
      }
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
        
        
   void backTrack(){
       if (isEmpty()) System.out.println("the list is empty");
       else {
         Node current = tail;
         while(current!=null){
        //visit current node
         System.out.print("  " + current.data + "   ");
       // move to the next
         current = current.prev;
         }
        System.out.println();
        }

    }
   
   void addFirst(int x){
       Node newNode = new Node(x) ;
          if (isEmpty()) head = tail = newNode;
          else {
//              head.prev = null;
//              newNode.next = head;
//              head = newNode;
               head.prev = new Node(x,null,head);
               head = head.prev;
               }
   }
   void removeLast(){
       if (isEmpty()) System.out.println("The list is empty");
        else if (head == tail) head = tail = null;
        else {
//            Node current = head ;
//            while(current.next != tail) current = current.next;
//            tail = current;
//            tail.next = null ;
            tail = tail.prev;
            tail.next = null;
            }

   }
   void removeFirst(){
        if (isEmpty()) System.out.println("List is empty");
        else {
//            System.out.println("List is not empty");
//            head = head.next;}     
               head = head.next;
               head.prev = null;}
   }
   void removeData(int x){
        if (isEmpty()) System.out.println("The list is empty");
        else{
            if(head == tail){
                if(head.data == x){
                    head = tail = null;
                    
                }
                return ;
            }
            Node current = head;
            while (current.next != tail ) {
               if (current.next.data == x){
                   // delete current.next
                   current.next = current.next.next;
                   current.next.prev = current;
                         
               } else{
                   // move to the next node
                   current = current.next;                           
               }         
                
            }
            if (tail.data == x) removeLast();
            if (head.data == x) removeFirst();
            }
       
   }
// remove multiple data ??
   void removeMultiple(int[] values) {
    if (isEmpty()) {
        System.out.println("The list is empty");
        return;
    }
    
    // Sử dụng Set để kiểm tra giá trị cần xóa nhanh hơn
    java.util.Set<Integer> valueSet = new java.util.HashSet<>();
    for (int value : values) {
        valueSet.add(value);
    }

    Node current = head;
    while (current != null) {
        if (valueSet.contains(current.data)) {
            // Nếu là nút đầu tiên
            if (current == head) {
                removeFirst();
                current = head; // Reset lại head
            } 
            // Nếu là nút cuối cùng
            else if (current == tail) {
                removeLast();
                break; // tail đã thay đổi, thoát khỏi vòng lặp
            } 
            // Nút ở giữa
            else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
                current = current.next; // Tiếp tục
            }
        } else {
            current = current.next; // Di chuyển tiếp nếu không cần xóa
        }
    }
}
   
   
   
   // 1. size() – Returns the number of elements in the list.
   int size() {
       int count = 0;
       Node current = head;
       while (current != null) {
           count++;
           current = current.next;
       }
       return count;
   }

   // 2. clear() – Removes all nodes from the list.
   void clear() {
       head = tail = null;
   }

   // 3. contains(int x) – Checks if a given value exists in the list.
   boolean contains(int x) {
       Node current = head;
       while (current != null) {
           if (current.data == x) {
               return true;
           }
           current = current.next;
       }
       return false;
   }

   // 4. get(int index) – Returns the element at the given index (0-based).
   int get(int index) {
       if (index < 0) throw new IndexOutOfBoundsException("Index out of bounds");
       Node current = head;
       int count = 0;
       while (current != null) {
           if (count == index) return current.data;
           count++;
           current = current.next;
       }
       throw new IndexOutOfBoundsException("Index out of bounds");
   }

   // 5. insertAt(int index, int x) – Inserts a node at a specific index.
   void insertAt(int index, int x) {
       if (index < 0) throw new IndexOutOfBoundsException("Index out of bounds");
       
       if (index == 0) { // Insert at the head
           addFirst(x);
           return;
       }

       Node current = head;
       int count = 0;

       while (current != null && count < index - 1) {
           count++;
           current = current.next;
       }

       if (current == null) throw new IndexOutOfBoundsException("Index out of bounds");

       Node newNode = new Node(x, current, current.next);
       if (current.next != null) current.next.prev = newNode;
       current.next = newNode;

       if (newNode.next == null) tail = newNode;
   }

   // 6. reverse() – Reverses the list.
   void reverse() {
       if (isEmpty() || head == tail) return;
       
       Node current = head;
       Node temp = null;
       
       while (current != null) {
           temp = current.prev;
           current.prev = current.next;
           current.next = temp;
           current = current.prev; // Move to next node (previously next)
       }

       // Swap head and tail
       temp = head;
       head = tail;
       tail = temp;
   }

   
   
}