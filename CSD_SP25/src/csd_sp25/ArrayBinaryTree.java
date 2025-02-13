/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csd_sp25;

/**
 *
 * @author Family
 */
public class ArrayBinaryTree {
    class Node{
        int data;
        public Node(int x){
            this.data = x;
        }
    }
     // parametes used to manage
    int length, capacity;
    Node[] arrayNodes;
    
    
    public ArrayBinaryTree(int capacity){
        this.length = 0;
        this.capacity = capacity;
        this.arrayNodes = new Node[capacity];
    }
    
    public ArrayBinaryTree(){
        this(7);
    }
    
    boolean isEmpty(){
        return length == 0;
    }
    
    boolean isFull(){
        return length == capacity ;
    }
    
    void insert(int x){
        if(isFull()) increaseCap();
        arrayNodes[length++] = new Node(x);
    }
    
    void increaseCap() {
        int newCap = (int)(1.5 * capacity); // Increase capacity by 50%
        Node[] newArray = new Node[newCap];
        
        // Copy existing elements to the new array
        for(int i = 0; i < length ;i++ ){
            newArray[i] = arrayNodes[i];
        }
        //  System.arraycopy(arrayNodes, 0, newArray, 0, length);

        arrayNodes = newArray;
        capacity = newCap;
    }

    void add(int x) {
        if (length == capacity) {
            increaseCap();
        }
        arrayNodes[length++] = new Node(x);
    }
    
    void preOrder(int index){        
            if (index >= length) return ; //base case
            //visit node
            System.out.print(arrayNodes[index].data + " ");
            // visit left child
            preOrder(index * 2 + 1 );
            // visit right child
            preOrder(index * 2 + 2 );
        
    }
    
    void preOrder(){
        if(isEmpty()) System.out.println("empty");
        else{
        preOrder(0);
        }
    }
    
    void postOrder(int index){
            if (index >= length) return ; //base case 
            // visit left child
            preOrder(index * 2 + 1 );
             // visit right child
            preOrder(index * 2 + 2 );
            //visit node
            System.out.print(arrayNodes[index].data + " ");
           
    }
    
    void postOrder(){
        if(isEmpty()) System.out.println("empty");
        else{
        postOrder(0);
        }
    }
    
}
