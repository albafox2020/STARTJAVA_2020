import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Enter the first number: ");
            calculatorOne.setNumber1(scan.nextInt());
            System.out.print("Enter the sign of the math operation: ");
            calculatorOne.setOperation(scan.next().charAt(0));
            System.out.print("Enter the second number: ");
            calculatorOne.setNumber2(scan.nextInt());

            System.out.println("result = " + calculatorOne.calcut());

            do {
                System.out.print("Want to continue? [Yes / No]: ");
                answer = scan.next();
            } while (! (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No")));

        }
        while (answer.equalsIgnoreCase("Yes"));
    }
}
