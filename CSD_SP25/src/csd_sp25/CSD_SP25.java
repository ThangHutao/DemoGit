package csd_sp25;

/**
 *
 * @author Family
 */
public class CSD_SP25 {

    public static void main(String[] args) {
        /*
        create a 6-element
write an array then check whether is empty or full ?
*/
       /* write the line of code to insert the flowwing sequence: 2,7,8,4,5 to the array using addLast function */
//     ArrayStructure array = new  ArrayStructure();
//     array.addLast(2);
//     array.addLast(7);
//     array.addLast(8);
//     array.addLast(4);
//      array.addLast(5);           
//
//     if (array.isEmpty()){
//         System.out.println("It is empty");
//     }
//     if (array.isFull()){
//         System.out.println("It is full");
//     }

      
      // Write codes to add data to singly linked list: 4 ,5 , 9, 3, 6,1 
//    SinglyLinkedList sList = new SinglyLinkedList();
//    sList.insertLast(4);
//    sList.insertLast(5);
//    sList.insertLast(9); 
//    sList.insertLast(3);
//    sList.insertLast(6);
//    sList.insertLast(1);
//    sList.insertFirst(0);
//    sList.deleteFirst();
//    
//   
//    sList.deleteLast();
//    sList.traverse();
    // test
//    DoublyLinkedList dbList = new DoublyLinkedList();
//    dbList.addLast(3);
//    dbList.addLast(6);
//    dbList.addLast(9);
//    dbList.addLast(4);
//    dbList.addLast(8);
//    System.out.println("the list is");
//    dbList.traverse();
//  System.out.println("the list reverse");
//  dbList.backTrack();
//  dbList.addFirst(0);
//    System.out.println("the list is");
////  dbList.traverse();
////    dbList.removeLast();
////    dbList.traverse();
////    dbList.removeFirst();
////    dbList.traverse();
//   
//    dbList.removeMultiple(new int[]{3, 4});
//    dbList.traverse();
//    
//    
//     CirculalyLinkedList cList = new CirculalyLinkedList();
//          cList.addLast(0);
//          cList.addLast(5);
//          cList.addLast(4);
//          cList.addLast(0);
//          System.out.println("The list is:");
//          cList.traverse();
//          cList.addFirst(5);
//          cList.traverse();
//          System.out.println("The list is:");
//          cList.removeLast();
//          cList.traverse();
//          System.out.println("The list is");
//            ArrayStack aStack = new ArrayStack();
//            aStack.push(5);
//            aStack.push(6);
//            aStack.push(7);
//            aStack.push(8);
//            aStack.push(9);
//            System.out.println(" The Stack is");
//            aStack.traverse();
//        ArrayQueue aQueue = new ArrayQueue();
//        aQueue.enqueue(5);
//        aQueue.enqueue(4);
//        aQueue.enqueue(6);
//        aQueue.enqueue(7);
//        aQueue.enqueue(8);
//        aQueue.traverse();
//        aQueue.enqueue(8);
//        aQueue.traverse();
//        aQueue.dequeue();
//        aQueue.traverse();
     ArrayBinaryTree abtree = new ArrayBinaryTree(7);
     abtree.insert(3);
     abtree.insert(6);
     abtree.insert(7);
     abtree.insert(9);
     abtree.insert(5);
     abtree.insert(4);
     abtree.insert(8);
     System.out.println("pre_order traverse"); 
     abtree.preOrder();
     System.out.println("");
     System.out.println("post_order traverse");
     abtree.postOrder();
       
              
        
            
        
         

 


    
    
    
    

      
    
    }
   
}
