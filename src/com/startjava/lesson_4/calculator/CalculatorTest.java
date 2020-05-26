package com.startjava.lesson_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calcOne = new Calculator();
        String answer;

        do {
            System.out.print("Enter a math expression ");
            String mathExpression = scan.next();
            String[] elements = mathExpression.split("");
            calcOne.setNumber1(Integer.parseInt(elements[0]));
            calcOne.setOperation(elements[1].charAt(0));
            calcOne.setNumber2(Integer.parseInt(elements[2]));

            calcOne.calculate();

            do {
                System.out.print("Want to continue? [Yes / No]: ");
                answer = scan.next();
            } while (!(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No")));
        } while (answer.equalsIgnoreCase("Yes"));
    }
}
