import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float num1, num2;
        String op;
        Scanner scanner = new Scanner(System.in);
        while (true) {

            try {
                System.out.println("Please enter first number: ");
                num1 = scanner.nextFloat();
                System.out.println("Please enter second number: ");
                num2 = scanner.nextFloat();
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter a right thing");
                scanner.next();
                continue;
            }
            System.out.println("Please enter operation: ");
            op = scanner.next();

            switch(op) {
                case "+":
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case "-":
                    System.out.println("Result: " + subtraction(num1, num2));
                    break;
                case "*":
                    System.out.println("Result: " + multiplication(num1, num2));
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero");
                    }
                    else {
                        System.out.println("Result: " + division(num1, num2));
                    }
                    break;
                default:
                    System.out.println("Unknown operation");
            };

            while (true) {
                System.out.println("Do you want continue?");
                String answer = scanner.next();
                if (answer.equalsIgnoreCase("yes")) {
                    break;
                }
                else if (answer.equalsIgnoreCase("no")) {
                    scanner.close();
                    return;
                }
                else {
                    System.out.println("Unknown input");
                }
            }
        }
    }

    public static double add(float num1, float num2) {
        return num1 + num2;
    }

    public static double subtraction(float num1, float num2) {
        return num1 - num2;
    }

    public static double multiplication(float num1, float num2) {
        return num1 * num2;
    }

    public static double division(float num1, float num2) {
        return num1 / num2;
    }
}