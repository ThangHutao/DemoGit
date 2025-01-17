/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author Family
 */
public class solveEquatation {
    private double a;
    private double b;
    private double c;

     
    
    public double getDelta(){
     return b*b-4*a*c;       
    }
 public double[] getRoots() {
        double delta = getDelta();
        if (delta < 0) {
            return new double[0];// tra ve mang rong
        } else if (delta == 0) {
            return new double[]{-b / (2 * a)}; // nghiem kep
        } else {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2}; // tra ve mang co hai nghiem
        }
    }
    //mang kieu double => xet Delta de giai phuong trinh 

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a==0) {throw new IllegalArgumentException("he so 'a' khac 0 ");} 
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
 
}
