
package week3;

import java.util.Scanner;

public class Utilizer {
    static Scanner sc = new Scanner(System.in);
    
    
    public static int checkNumber(){
        while(true){
        System.out.println("enter a number :");
        try{
            
        int input = Integer.parseInt(sc.nextLine()) ;
        
        if (input < 2) //continue
            throw new IllegalArgumentException("error");
        return input;        
        
        }catch(Exception e){
            
            System.out.println("error");
            
        }
        
    }
        
    }
}
