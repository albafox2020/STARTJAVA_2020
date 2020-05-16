package com.startjava.lesson_2_3.calculator;

public class Calculator {
    private double totalsum ;
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
    public double getTotalsum() {
        return totalsum;
    }
    public double calcut() {
        switch (operation) {
            case '+' : totalsum = number1 + number2;
            break;
            case '-' : totalsum = number1 - number2;
            break;
            case '*' : totalsum = number1 * number2;
            break;
            case '/' : totalsum = number1 / number2;
            break;
            case '^' : totalsum = 1;
            for (int i = 1; i <= (number2); i++) {
                 totalsum *= number1;
            }
            break;
            case '%' : totalsum = number1 % number2;
        }
        return totalsum;
    }
}
