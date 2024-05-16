import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        System.out.println("Simple Calculator");
        System.out.println("------------------");

        while (continueCalculation) {
            try {
                System.out.print("Enter first number: ");
                double num1 = getValidNumber(scanner);

                System.out.print("Enter second number: ");
                double num2 = getValidNumber(scanner);

                System.out.print("Choose operation (+, -, *, /): ");
                char operation = getValidOperation(scanner);

                double result = performOperation(num1, num2, operation);

                System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, operation, num2, result);

                System.out.print("Do you want to perform another calculation? (yes to continue): ");
                String userChoice = scanner.next();
                if (!userChoice.equalsIgnoreCase("yes")) {
                    continueCalculation = false;
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred. Please try again.");
                scanner.next(); // clear the invalid input
            }
        }

        scanner.close();
        System.out.println("Calculator program has ended.");
    }

    private static double getValidNumber(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next(); // clear the invalid input
            System.out.print("Enter number: ");
        }
        return scanner.nextDouble();
    }

    private static char getValidOperation(Scanner scanner) {
        char operation;
        while (true) {
            operation = scanner.next().charAt(0);
            if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
                break;
            } else {
                System.out.println("Invalid operation. Please enter one of the following operations: +, -, *, /");
                System.out.print("Choose operation: ");
            }
        }
        return operation;
    }

    private static double performOperation(double num1, double num2, char operation) throws ArithmeticException {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Error: Division by zero is not allowed.");
                }
                return num1 / num2;
            default:
                throw new UnsupportedOperationException("Unsupported operation: " + operation);
        }
    }
              
