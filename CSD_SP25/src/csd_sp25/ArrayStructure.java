/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csd_sp25;

/**
 *
 * @author Family
 */
public class ArrayStructure {
    int length;
    int capacity;
    int data[];

    /*
    create a constructor with a specific capacity
    */
    public ArrayStructure(int size) {
        int arr[] = new int[size];
        data = arr;
        this.capacity = size;
        this.length = 0;
       
    }
    /*
    create a default construcot with the size of 5
    */
  
    public ArrayStructure () {
        this(5);       
    } 
    /* write a function to check whether the array is empty
    
    */
    boolean isEmpty(){
       return length==0;
    }
   /*
    write a function  to check whether the array is full
    */
    boolean isFull(){
    return length==capacity;
    
    } 
      /* write a function to add a new data to the end of the array
    
    */
    void addLast(int x){
        /*
        check it is full? 
        if full, do not add, increase length of the array
        */
        if(isFull())increaseSize();
      data[length] = x ;
      if (length < capacity) length++;
    }
    
    void increaseSize(){
    int newCapacity = (int)(1.5 * capacity); 
    int newArray[] = new int[newCapacity];
    // copy old array to new array
    for(int i=0;i<length; i++){
        newArray[i] = data[i];
    }
    data = newArray;
    capacity = newCapacity;
}
    /* Write a funtion to add a new data to head of array
    
    */
    void addAtIndex(int  index, int x){
        if (index <0 && index >length){
            System.out.println("out of index");
            return;}
         if(isFull()) increaseSize();
        for (int i= length ; i>0; i--){
        data [i] = data[i-1];
        }
         data[length] = x;
    }
    
    
    
    void addHead(int x){
        if(isFull()) increaseSize();
        for (int i= length ; i>0; i--){
        data [i] = data[i-1];
        }
         data[length] = x;
    
    
    }
   // display data
    void dispData(){
    for (int i=0; i < length ; i++){
        System.out.print(data[i] + "   ");
    }
        System.out.println();
        }
    
    
}


