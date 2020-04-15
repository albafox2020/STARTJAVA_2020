import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        private static Scanner read;
        read = new Scanner(System.in);
        System.out.print("Enter an integer greater than zero ");
        double nam1 = read.nextDouble();
        System.out.print("Enter an operator (+, -, *, /, ^, %): ");
        String operator = read.next();
        System.out.print("Enter the second number ");
        double nam2 = read.nextDouble();

        if (operator.equals("+")) {
            System.out.println(" = " + (nam1 + nam2));
        } else if (operator.equals("-")) {
            System.out.println(" = " + (nam1 - nam2));
        } else if (operator.equals("*")) {
            System.out.println(" = " + (nam1 * nam2));
        } else if (operator.equals("/")) {
            System.out.println(" = " + (nam1 - nam2));
        } else if (operator.equals("^")) {
            System.out.println(" = " + Math.pow(nam1, nam2));
        } else if (operator.equals("%")) {
            System.out.println(" = " + (nam1 % nam2));
        }
    }
}
