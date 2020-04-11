import java.util.Scanner;

public class Calculator {


    private static Scanner read;

    public static void main (String[] args){

        read = new Scanner(System.in);

        double nam1;
        double nam2;
        String operator;

System.out.print ("Vvedite pervoe cheloe neotricatelnoe chislo ");
nam1 = read.nextDouble();

System.out.print("Enter an operator (+, -, *, /, ^, %): ");
operator = read.next();

System.out.print ("Vvedite vtoroe chislo ");
nam2 = read.nextDouble();

if (operator.equals("+")){
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
