
package week3;

import com.sun.source.tree.WhileLoopTree;
import java.util.Random;


public class IntegerArray {
    private int[] arr;

    public int[] getArr() {
        return arr;
    }

    public IntegerArray(int a) {
        this.arr = new int[a];
    }
    
    public void addValue(){
        Random random = new Random();
        for(int i=0; i< this.arr.length ; i++){
            this.arr[i] = random.nextInt(this.arr.length);
            
        }
    }
    
     public void showValue(){
         Random random = new Random();
         for(int i=0; i<this.arr.length ; i++){
             System.out.print(this.arr[i] + " ");           
        }          
    }
     
    public void bubbleSort() {
        int count = 0;
        boolean check = false; 
        for (int i = 0; i <this.arr.length - 1 && !check; i++) {
            check = true;
            for (int j = 0; j <this.arr.length - 1 - i; j++) {
                count ++;
                if (this.arr[j] > this.arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = this.arr[j];
                    this.arr[j] = this.arr[j + 1];
                    this.arr[j + 1] = temp;
                  
                }
            }
        }
        System.out.println();
        System.out.println("count : " + count);
    
     }
    


    
    public int partition(int[] array, int left, int right) {
        int pivot = array[(left+right)/2];
        int i = left ; int j = right;
        while (i <= j){
            while (array[i] < pivot ) i++;
            while (array[j] > pivot ) j--;
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
         if (left < i-1 ) quickSort(array, left , i-1);
         if (i < right) quickSort(array, i , right);
    }
    
     
     public int BinarySearch (int[] a, int value){
         int left = 0;
         int right = a.length -1;
         while (left <= right ){
         int mid = ( left + right ) /2;
         if (a[mid] == value) return mid;
         else if (a[mid] < value) left = mid +1 ;
         else right = mid + 1;
         }
         return -1;
     }
    
     
    
     
     
}
