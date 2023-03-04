import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Enter an operation followed by two numbers: ");
            input = scanner.nextLine();
            
            String[] tokens = input.split(" "); // split the input by spaces
            String operation = tokens[0];
            int num1 = 0;
            int num2 = 0;
            if (tokens.length > 2) {
                num1 = Integer.parseInt(tokens[1]);
                num2 = Integer.parseInt(tokens[2]);
            } else {
                num1 = Integer.parseInt(tokens[1]);
            }
            
            
            int result = 0;
            String results = "";
            if (operation.equals("add")) {
                result = myCalculator.add(num1, num2);
            } else if (operation.equals("subtract")) {
                result = myCalculator.subtract(num1, num2);
            } else if (operation.equals("multiply")) {
                result = myCalculator.multiply(num1, num2);
            } else if (operation.equals("divide")) {
                result = myCalculator.divide(num1, num2);
            } else if (operation.equals("fibonacci")) {
                result = myCalculator.fibonacciNumberFinder(num1);
            } else if (operation.equals("binary")) {
                results = myCalculator.intToBinaryNumber(num1);
            } else if (tokens[0].equals("quit")) {
                break;
            } else {
                System.out.println("Invalid operation!");
                return;
            }

            if (operation.equals("binary")) {
                System.out.println("Result: " + results);
            } else {
                System.out.println("Result: " + result);
            }
            
        }
    }
}
