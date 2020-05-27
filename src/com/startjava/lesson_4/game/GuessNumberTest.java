package com.startjava.lesson_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        String answer;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the first player ");
        Player playerOne = new Player(scan.nextLine());
        System.out.println("Enter the name of the second player ");
        Player playerTwo = new Player(scan.nextLine());
        GuessNumber gn = new GuessNumber(playerOne, playerTwo);
        System.out.println("You have 10 attempts ");
        do {
            gn.mainGame();
            do {
                System.out.print("Want to continue? [Yes / No]: ");
                answer = scan.nextLine();
            } while (!(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No")));
        } while (answer.equalsIgnoreCase("Yes"));
    }
}
