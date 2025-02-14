
package csd_sp25;

public class BinarySearchTree {
    class Node{
        int data;
        Node left, right;

        public Node(int x, Node left, Node right) {
            this.data = x;
            this.left = left;
            this.right = right;
        }
        
        public Node(int x){
            this(x,null,null);
        }     
        
    }   
    
    Node root;
    
    public BinarySearchTree(){        
       this.root = null;
    }
    
    boolean isEmpty(){
        return root == null;    }
    
  
    
   // Hàm insert dùng vòng lặp
    void insert(int x) {
        Node newNode = new Node(x);
        if (isEmpty()) {
            root = newNode; // Nếu cây rỗng, gán root bằng node mới
            return;
        }

        Node current = root;
        Node parent = null;

        while (current != null) {
            parent = current;
            if (x < current.data) {
                current = current.left; //  sang trái 
            } else if (x > current.data) {
                current = current.right; // sang phải
            } else {
                return; // Nếu x đã tồn tại, không cần thêm
            }
        }

        // Gán nút mới vào vị trí thích hợp
        if (x < parent.data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }
    
     // implement insert recursion
    Node insertRec(int x, Node node){
       if (node == null) return new Node(x); 
       if (node != null){
           if(node.data > x)  node.left = insertRec(x, node.left);
           if (node.data < x) node.right = insertRec(x, node.right);
       }
       return node;
    
    }
    
    // Hàm duyệt cây theo PreOrder (NLR)
    void preOrder(Node node) {
        if (node == null) return;//base case
                
        System.out.print(node.data + " "); // In giá trị nút hiện tại
        preOrder(node.left); // left child
        preOrder(node.right); // right child
    }

    void preOrder() {
        if (isEmpty()) {
            System.out.println("Tree is empty");
        } else {
            preOrder(root);
            System.out.println();
        }
    }
    
    
        
    
    void inOrder(Node node) {
    if (node == null) return;

    inOrder(node.left);  // Duyệt cây con trái trước
    System.out.print(node.data + " ");  // In giá trị của nút hiện tại
    inOrder(node.right); // Duyệt cây con phải sau
    }

// Hàm gọi inOrder từ gốc
    void inOrder() {
    if (isEmpty()) {
        System.out.println("Tree is empty");
     } else {
        inOrder(root);
        System.out.println();
      }
    }
    
    
    void postOrder(Node node){
    if (node == null) return; // Base case: ra ngoài phạm vi hoặc nút null

    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.data + " ");

    }    
    
    
    
    void postOrder(){
        if(isEmpty()) System.out.println("empty");
        else{
        postOrder(root);
        }
    }
    
    int height(Node node){
        // code
        if (node == null) return 0;
        return  1 + maxInt(height(node.left), height(node.right));
    }
    
    int height(){
        return height(root);
    }
    
   

    
    void breathirst(){
        
    }
    
    void deleteTree(){
        root = null;
    }
    
    int maxInt(int a, int b){
        return a > b ?  a : b;
         
    }
    
    
}
