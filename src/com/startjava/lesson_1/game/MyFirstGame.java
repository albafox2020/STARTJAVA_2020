package com.startjava.lesson_1.game;

import java.util.Random;
import java.util.Scanner;

class MyFirstGame {
    public static void main(String [] args) {
        Random random = new Random();
        int guessedNumber = random.nextInt(101);
        System.out.print("Write a number from 0 to 100 ");
        Scanner scan = new Scanner(System.in);
        int playerAttempt = scan.nextInt();

        while (playerAttempt != guessedNumber) {
            System.out.print("enter again ");
            playerAttempt = scan.nextInt();
            if (playerAttempt > guessedNumber) {
                System.out.println ("Your number is greater than the guessed ");
            } else if (playerAttempt < guessedNumber) {
                System.out.println ("Your number is less than the guessed ");
            }

            System.out.println ("You guessed");
        }
    }
}
