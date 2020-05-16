package com.startjava.lesson_2_3.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger(" Mark-3", 2017, "Destroyed", "United States of America", 260, 1.98d, 7, 8);
        System.out.println(jaegerOne.mark + " " + jaegerOne.yearOfIssue + " " + jaegerOne.status + " " + jaegerOne.original + " " + jaegerOne.height + " " + jaegerOne.weight + " " + jaegerOne.speed + " " + jaegerOne.strength);
        System.out.println(jaegerOne.mark + " - you use chain swords " + jaegerOne.useChainSwords());
        System.out.println(jaegerOne.mark + " - you filled in the coolant " + jaegerOne.pourCoolant());

        Jaeger jaegerTwo = new Jaeger("Mark-5", 2019, "Destroyed", "Australia", 250, 1.85d, 10, 10);
        System.out.println(jaegerTwo.mark + " " + jaegerTwo.yearOfIssue + " " + jaegerTwo.status + " " + jaegerTwo.original + " " + jaegerTwo.height + " " + jaegerTwo.weight + " " + jaegerTwo.speed + " " + jaegerTwo.strength);
        System.out.println(jaegerTwo.mark + " - you use chain swords " + jaegerOne.useChainSwords());
        System.out.println(jaegerTwo.mark + " - you filled in the coolant " + jaegerOne.pourCoolant());
    }
}
