package week2;

/**
 *
 * @author Family
 */
public class ComputerProgram {
        public void basicOperations(double a, double b, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) result = a / b;
                else System.out.println("Error: Division by zero");
                return;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("Result: " + result);
    }

    public void calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        System.out.println("BMI: " + bmi);
    }
}
