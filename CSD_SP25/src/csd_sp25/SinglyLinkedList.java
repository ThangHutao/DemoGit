/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csd_sp25;

/**
 *
 * @author Family
 */
public class SinglyLinkedList {
    public class Node{
    int data;
    Node next;
    public Node(int x){
    this.data = x;
    this.next = null;
      }
    }
    Node head, tail;
    // constructor singly linkedlist

    public SinglyLinkedList(){
        this.head = null;
        this.tail = null;
    }
//function to check the list is empty or not?
    boolean isEmpty(){
    return head == null;
    }

    

// function to add a new node to the last of the list
    
    void insertLast(int x){ 
     Node newNode = new Node(x);
     if(isEmpty())
     head = tail = newNode;
     else{
       tail.next= newNode; tail = newNode;
       }
    }
// write function to revesre te list  
    void traverse(){
    Node current = head;
    while(current!=null){
        //visit current node
       System.out.print("  " + current.data);
       current = current.next;
     }
    System.out.println();
   }
    
    // chuyen thanh vong for :D
    
   // function to add node to the head of list
    void insertFirst(int x){
        Node newNode = new Node(x);
        if(isEmpty()) head = tail = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
    
    } 
// write function to delete the first element of the list
    void deleteFirst(){
        if (isEmpty()) System.out.println("List is empty");
        else {
            System.out.println("List is not empty");
            head = head.next;}      
    }
    
    // delete last element of list
    void deleteLast(){
        if (isEmpty()) System.out.println("The list is empty");
        else if (head == tail) head = tail = null;
        else {
            Node current = head ;
            while(current.next != tail) current = current.next;
            tail = current;
            tail.next = null ;
            }
         
     }
    // Write fuction to delete the nde with the specific data

    
    
     void deleteOneData(int x){
        if (isEmpty()) System.out.println("The list is empty");
        else{
            if (head == tail){
            //there is one node
            if(head.data == x) head = tail = null;
        } else  {
                //there are many nodes
                if(head.data == x ){
                    deleteFirst();
                    return;}                
                Node current = head;
                while(current.next != null){
                    if(current.next.data == x){
                       current.next = current.next.next;}
                    else{
                        current = current.next;}                         
                    }
                }
            }
    }
     
     void deleteMultipleData(int[] values) {
    if (isEmpty()) {
        System.out.println("The list is empty");
        return;
    }

    // Sử dụng Set để kiểm tra giá trị cần xóa nhanh hơn
    java.util.Set<Integer> valueSet = new java.util.HashSet<>();
    for (int value : values) {
        valueSet.add(value);
    }

    // Xóa các nút ở đầu danh sách (head) nếu cần
    while (head != null && valueSet.contains(head.data)) {
        head = head.next; // Di chuyển head đến nút tiếp theo
    }

    // Nếu danh sách rỗng sau khi xử lý head
    if (head == null) {
        tail = null; // Cập nhật tail nếu toàn bộ danh sách bị xóa
        return;
    }

    // Duyệt qua danh sách và xóa các nút ở giữa
    Node current = head;
    while (current.next != null) {
        if (valueSet.contains(current.next.data)) {
            current.next = current.next.next; // Loại bỏ nút tiếp theo
            if (current.next == null) {
                tail = current; // Cập nhật tail nếu nút cuối bị xóa
            }
        } else {
            current = current.next; // Di chuyển đến nút tiếp theo
        }
    }
}

     
}
    
    
  

