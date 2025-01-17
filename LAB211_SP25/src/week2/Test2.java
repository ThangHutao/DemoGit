/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author Family
 */
public class Test2 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculateMatrix matrix = new CalculateMatrix();
        CalculateShape shape = new CalculateShape();
        ComputerProgram program = new ComputerProgram();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Matrix Operations");
            System.out.println("2. Shape Calculations");
            System.out.println("3. Basic Operations and BMI");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Matrix Operations:");
                    System.out.print("Enter rows and columns of matrices: ");
                    int rows = scanner.nextInt();
                    int cols = scanner.nextInt();
                    int[][] a = new int[rows][cols];
                    int[][] b = new int[rows][cols];
                    System.out.println("Enter matrix A:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            a[i][j] = scanner.nextInt();
                        }
                    }
                    System.out.println("Enter matrix B:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            b[i][j] = scanner.nextInt();
                        }
                    }
                    matrix.addMatrices(a, b);
                    matrix.multiplyMatrices(a, b);
                    break;

                case 2:
                    System.out.println("Shape Calculations:");
                    System.out.println("1. Circle\n2. Rectangle\n3. Triangle");
                    int shapeChoice = scanner.nextInt();
                    switch (shapeChoice) {
                        case 1:
                            System.out.print("Enter radius: ");
                            double radius = scanner.nextDouble();
                            shape.calculateCircle(radius);
                            break;
                        case 2:
                            System.out.print("Enter length and width: ");
                            double length = scanner.nextDouble();
                            double width = scanner.nextDouble();
                            shape.calculateRectangle(length, width);
                            break;
                        case 3:
                            System.out.print("Enter sides a, b, c: ");
                            double aSide = scanner.nextDouble();
                            double bSide = scanner.nextDouble();
                            double cSide = scanner.nextDouble();
                            shape.calculateTriangle(aSide, bSide, cSide);
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    break;

                case 3:
                    System.out.println("Basic Operations and BMI:");
                    System.out.println("1. Basic Operations\n2. Calculate BMI");
                    int programChoice = scanner.nextInt();
                    switch (programChoice) {
                        case 1:
                            System.out.print("Enter two numbers and operator (+, -, *, /): ");
                            double num1 = scanner.nextDouble();
                            double num2 = scanner.nextDouble();
                            char operator = scanner.next().charAt(0);
                            program.basicOperations(num1, num2, operator);
                            break;
                        case 2:
                            System.out.print("Enter weight (kg) and height (m): ");
                            double weight = scanner.nextDouble();
                            double height = scanner.nextDouble();
                            program.calculateBMI(weight, height);
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    } 
}
