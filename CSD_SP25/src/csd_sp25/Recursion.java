
package csd_sp25;

public class Recursion {
    // recursion considered as a function used to solve a problem by solving a    smallerr-size problem
    // it has two cases
    // base case: stop recursion
    // inductive case: solve a smaller problem
    
    public Recursion(){ 
    
    }
        
    // write a recursion-based function to calculate the factorial of n
    int factorial(int a){
       if (a<0) System.out.println("wrong input");
       if(a == 0 || a == 1) return 1;  // base case  
       else{
         return  a*factorial(a-1); // inductive case
       }     
     }
    
    // write a recursion-based function to calculate the n-th element of a fibonacci sequence
    // 1,1,2,3,5,8,13 ....
    // base case  n==1 || n ==0 return 1;
    // inductive case : return fibo(n-1) + fibo(n-2)
    int fibo(int n){
        if (n<0){ 
            System.out.println("wrong input");
            return -1;
        }
        else {
            if(n==1 || n==2) return 1; //base case
            else return fibo(n-1) + fibo(n-2);// inductive
        }
        
    }
    
    
     // 3. Sum of natural numbers up to n
    public int sumOfNaturalNumbers(int n) {
        if (n == 0) return 0; // Base case
        return n + sumOfNaturalNumbers(n - 1); // Recursive step
    }
  
            
      
    // 4. Reverse a string
    public String reverseString(String str) {
        if (str.isEmpty()) return str; // Base case
        return reverseString(str.substring(1)) + str.charAt(0); // Recursive step
    }    
     
    
    
    
    // 5. Check if a number is palindrome
    public boolean isPalindrome(String str) {
        if (str.length() <= 1) return true; // Base case
        if (str.charAt(0) != str.charAt(str.length() - 1)) return false;
        return isPalindrome(str.substring(1, str.length() - 1)); // Recursive step
    }
    
    
    
    
    // 6. Power function (x^n)
    public int power(int x, int n) {
        if (n == 0) return 1; // Base case
        return x * power(x, n - 1); // Recursive step
    }

    
     
    // 7. Greatest Common Divisor (GCD) using Euclidean Algorithm
    public int gcd(int a, int b) {
        if (b == 0) return a; // Base case
        return gcd(b, a % b); // Recursive step
    }
 
    // 8. Print an array recursively
    public void printArray(int[] arr, int index) {
        if (index == arr.length) return; // Base case
        System.out.print(arr[index] + " ");
        printArray(arr, index + 1); // Recursive step
    }
    
    
    // quick sort
    public int partition(int[] array, int left, int right) {
        int pivot = array[(left+right)/2];
        int i = left ; int j = right;
        while (i <= j){
            while (array[i] < pivot ) i++;
            while (array[j] < pivot ) j--;
            if (i <= j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;            
            }
        }

        return i ;
    }
    
    
     public void quickSort(int[] array, int left, int right) {
         int i = partition(array, left, right);
         if (i<right) partition(array, left, right);
         if (left < i-1 ) quickSort(array, left, i-1);
    }
    
        
        
}
