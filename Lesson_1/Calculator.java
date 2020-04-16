import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer greater than zero ");
        double number1 = scan.nextDouble();
        System.out.print("Enter an operator (+, -, *, /, ^, %): ");
        String operator = scan.next();
        System.out.print("Enter the second number ");
        double number2 = scan.nextDouble();

        if (operator.equals("+")) {
            System.out.println(" = " + (number1 + number2));
        } else if (operator.equals("-")) {
            System.out.println(" = " + (number1 - number2));
        } else if (operator.equals("*")) {
            System.out.println(" = " + (number1 * number2));
        } else if (operator.equals("/")) {
            System.out.println(" = " + (number1 - number2));
        } else if (operator.equals("^")) {
            int sum = 1;
            for (int i = 1; i <= (number2); i++) {
                sum *= number1;
            }
            System.out.println(" = " + sum);
        } else if (operator.equals("%")) {
            System.out.println(" = " + (number1 % number2));
        }
    }
}
