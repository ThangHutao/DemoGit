
package week3;


public class MyStacks {
     class Node{
        int data;

        public Node(int data) {
            this.data = data;
        }       
        
             
        
        
    }
    
    int capacity;
    int lastIndex;
    Node [] arrayNode;
    
    public MyStacks(int capacity){
        this.capacity = capacity;
        this.arrayNode = new Node[capacity];
        this.lastIndex = -1;
    }
    
    public MyStacks(){
        this(5);
    }
    
    boolean isEmpty(){
        return lastIndex == -1;
    }
    
    boolean isFull(){
        return lastIndex == capacity -1;
    }
    void push(int x){
        if(isFull()) increaseCap();
        arrayNode [++lastIndex] = new Node(x);       
        
    }
    
    //  write a function to pop the last element of the stack . Does it have a return value?
    Node pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }else{
            Node temp = arrayNode[--lastIndex];
            return temp;
        }
    }
    // write a function to read the top element of the stack
    Node top(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }else{
            Node temp = arrayNode[lastIndex];
            return temp;
        }
    }
    void increaseCap(){
       int newCap = (int)(1.5 * capacity); 
       Node[] newArray = new Node[newCap];
        System.arraycopy(arrayNode, 0, newArray, 0,capacity);
        arrayNode = newArray;
        capacity = newCap;
        
    }
    
    void traverse(){
        if(isEmpty()) System.out.println("The stack is empty");
        else{
            for(int i=0; i<= lastIndex; i++){
                System.out.println(arrayNode[i].data + " ");
            }
        }
    }
    
    // 4. clear() - Removes all elements from the stack
    void clear() {
        lastIndex = -1;
    }

    // 5. contains(int x) - Checks if an element exists
    boolean contains(int x) {
        for (int i = 0; i <= lastIndex; i++) {
            if (arrayNode[i].data == x) return true;
        }
        return false;
    }

    // 6. get(int index) - Gets the element at a specific index
    int get(int index) {
        if (index < 0 || index > lastIndex) throw new IndexOutOfBoundsException("Index out of range");
        return arrayNode[index].data;
    }
    
    // 3. size() - Returns the number of elements in the stack
    int size() {
        return lastIndex + 1;
    }

    // 8. shrinkCapacity() - Reduces capacity when the stack size decreases
    void shrinkCapacity() {
        if (size() <= capacity / 2 && capacity > 5) {
            int newCap = Math.max(5, capacity / 2);
            Node[] newArray = new Node[newCap];
            System.arraycopy(arrayNode, 0, newArray, 0, size());
            arrayNode = newArray;
            capacity = newCap;
        }
    }

    
}
