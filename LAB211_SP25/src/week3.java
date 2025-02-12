package week3;  

public class week3 {  

    public static void main(String[] args) {  

        IntegerArray mangSoNguyen = new IntegerArray(Utilizer.checkNumber());  
        mangSoNguyen.addValue(); // Changed to use the no-argument version  
        System.out.println("Unsorted array:");  
        mangSoNguyen.showValue();  
        mangSoNguyen.quickSort(mangSoNguyen.getArr(), 0, mangSoNguyen.getArr().length - 1);  
        System.out.println("\nSorted array (QuickSort):");  
        mangSoNguyen.showValue();  
//      mangSoNguyen.findBinary(mangSoNguyen.getArr(), 5);
        System.out.println("Index = " + mangSoNguyen.BinarySearch(mangSoNguyen.getArr(), Utilizer.checkNumber()));
    }  
}