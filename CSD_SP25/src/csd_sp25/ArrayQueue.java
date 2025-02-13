/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csd_sp25;

/**
 *
 * @author Family
 */
public class ArrayQueue {
    class Node{
     int data;
     
     public Node(int x){
         this.data = x ; 
     }
    }
    
    // parametes used to manage array-based queue
    int capacity, firstIdx, lastIdx;
    Node[] arrayNode;
    
    public ArrayQueue(int cap){
        this.capacity = cap;
        this.firstIdx = this.lastIdx = -1;
        this.arrayNode = new Node[cap];
    }
    
    public ArrayQueue(){
        this(5);
    }
    
    boolean isEmpty(){
        return lastIdx == -1;
    }
    
    boolean isFull(){
        // case 1: lastIdx - firstIdx = capacity -1; 
        // => firstidex = lastIdx  +1 ;
        // case 2: firstIdx = lastidx + 1;
       return (firstIdx == lastIdx + 1 || firstIdx == lastIdx + 1 - capacity );
    }
    
    
    // enqueue = addLast
    void enqueue(int x){
        if(isFull() ) increaseCap();
            if (isEmpty()) {
            arrayNode[++lastIdx] = new Node(x);
            firstIdx++;
           }else{
                int idx = ++lastIdx % capacity;
                arrayNode [idx] = new Node(x);
                lastIdx = idx ;
            }         
        
    }
    
    // dequeue =remove first
    Node dequeue(){
        if(isEmpty()){
            System.out.println("queue id empty");
            return null;
        }else{
            if (firstIdx == lastIdx) {
                Node temp = arrayNode[firstIdx];
                return temp;            
        }else {
                int idx = ++firstIdx % capacity  ;     
                Node temp = arrayNode[firstIdx++];
                firstIdx = idx;
                return temp;
                }
        }
    }
    
    void increaseCap(){       
        int newCap = (int)(1.5 * capacity);
        Node[] newArray = new Node[newCap];
        int length = (lastIdx - firstIdx + capacity) % capacity + 1;
        for (int i=0; i < capacity ; i++){
            int idx = (firstIdx + i) % capacity;
            newArray[i] = arrayNode[idx];
        }
        arrayNode = newArray;
        firstIdx = 0;
        lastIdx = capacity - 1 ;
        capacity = newCap;
    }
    
    
    
    
    
    void traverse(){
        if(isEmpty()) { 
            System.out.println("Queue is empty");
        }else{  
            int length = (lastIdx - firstIdx + capacity) % capacity + 1;
            for(int i=0; i< length; i++){
                int idx = (firstIdx + i) % capacity;
                System.out.println(arrayNode[idx].data + " ");
            }
            System.out.println("");
            System.out.println("firstidx: "+ firstIdx + "--" + "lastidx: "+ lastIdx);
        }
    }   
    // Write a function to read the top element of the queue
    Node front(){
        if (isEmpty()){
            System.out.println("empty ");
            return null;
        } else{
           return arrayNode[firstIdx];
        }
    }
    
    
    
    
    
     // 1. size() - Returns the number of elements
    int size() {
        if (isEmpty()) return 0;
        return (lastIdx - firstIdx + capacity) % capacity + 1;
    }

    // 2. clear() - Empties the queue
    void clear() {
        firstIdx = lastIdx = -1;
    }

    // 3. contains(int x) - Checks if value exists
    boolean contains(int x) {
        if (isEmpty()) return false;
        for (int i = 0; i < size(); i++) {
            int idx = (firstIdx + i) % capacity;
            if (arrayNode[idx].data == x) return true;
        }
        return false;
    }

    // 4. get(int index) - Gets the element at an index
    int get(int index) {
        if (index < 0 || index >= size()) throw new IndexOutOfBoundsException("Index out of range");
        int idx = (firstIdx + index) % capacity;
        return arrayNode[idx].data;
    }

    // 5. rear() - Returns last element
    Node rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return arrayNode[lastIdx];
    }

    // 6. shrinkCapacity() - Reduce capacity if needed
    void shrinkCapacity() {
        if (size() <= capacity / 2 && capacity > 5) {
            int newCap = Math.max(5, capacity / 2);
            Node[] newArray = new Node[newCap];
            int length = size();
            for (int i = 0; i < length; i++) {
                int idx = (firstIdx + i) % capacity;
                newArray[i] = arrayNode[idx];
            }
            arrayNode = newArray;
            firstIdx = 0;
            lastIdx = length - 1;
            capacity = newCap;
        }
    }

    
    
    
    
    
}
