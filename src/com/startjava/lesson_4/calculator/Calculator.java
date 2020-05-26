package com.startjava.lesson_4.calculator;

import java.util.Scanner;

import static java.lang.Math.*;

public class Calculator {
    private int number1;
    private char operation;
    private int number2;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void calculate() {
        switch (operation) {
            case '+' :
                System.out.println("Totalsum = " + addExact(number1, number2));
                break;
            case '-' :
                System.out.println("Totalsum = " + subtractExact(number1, number2));
                break;
            case '*' :
                System.out.println("Totalsum = " + pow(number1, number2));
                break;
            case '/' :
                System.out.println("Totalsum = " + floorDiv(number1, number2));
                break;
            case '^' :
                System.out.println("Totalsum = " + Math.pow(number1, number2));
                break;
            case '%' :
                System.out.println("Totalsum = " + floorMod(number1, number2));
                break;
            case '>' :
                if (number1 > number2) {
                    System.out.println(number1 + " " + operation + " " + number2 + " true ");
                } else {
                    System.out.println(number1 + " " + operation + " " + number2 + "false ");
                }
                break;
            case '<' :
                if (number1 > number2) {
                    System.out.println(number1 + operation + number2 + "true");
                } else {
                    System.out.println(number1 + operation + number2 + "true");
                }
                break;
        }
    }
}