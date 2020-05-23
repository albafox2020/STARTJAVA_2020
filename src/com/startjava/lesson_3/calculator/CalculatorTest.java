package com.startjava.lesson_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calcOne = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer;

        do {
            calcOne.calcutTest();
            calcOne.calcut();
            do {
                System.out.print("Want to continue? [Yes / No]: ");
                answer = scan.next();
            } while (!(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No")));
        } while (answer.equalsIgnoreCase("Yes"));
    }
}
