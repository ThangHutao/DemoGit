/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author Family
 */
public class CalculateShape {
    public void calculateCircle(double radius) {
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Circle - Area: " + area + ", Perimeter: " + perimeter);
    }

    public void calculateRectangle(double length, double width) {
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Rectangle - Area: " + area + ", Perimeter: " + perimeter);
    }

    public void calculateTriangle(double a, double b, double c) {
        double perimeter = a + b + c;
        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Triangle - Area: " + area + ", Perimeter: " + perimeter);
    }
}
