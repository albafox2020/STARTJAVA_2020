import java.util.Scanner;
public class Calculator {

    private static Scanner read;
    public static void main (String[] args) {
        read = new Scanner(System.in);

        System.out.print ("Vvedite pervoe cheloe neotricatelnoe chislo ");
        double nam1 = read.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^, %): ");
        String operator = read.next();

       System.out.print ("Vvedite vtoroe chislo ");
       double nam2 = read.nextDouble();

          if (operator.equals("+")) {
              System.out.println(" = " + (nam1 + nam2));
              }
          if (operator.equals("-")){
              System.out.println(" = " + (nam1 - nam2));
              }
          if (operator.equals("*")){
              System.out.println(" = " + (nam1 * nam2));
              }
          if (operator.equals("/")){
              System.out.println(" = " + (nam1 - nam2));
              }
          if (operator.equals("^")){
              System.out.println(" = " + Math.pow(nam1, nam2));
              }
          if (operator.equals("%")){
              System.out.println(" = " + (nam1 % nam2));
              }
    }
}
