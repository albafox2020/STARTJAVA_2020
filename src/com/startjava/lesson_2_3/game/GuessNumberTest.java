package com.startjava.lesson_2_3.game;

import java.util.Scanner;

class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of the first player ");
        Player playerOne = new Player(scan.next());
        System.out.print("Enter the name of the second player ");
        Player playerTwo = new Player(scan.next());
        String answer;
        do {
            GuessNumber gn = new GuessNumber(playerOne, playerTwo);
            gn.playGame();
            do {
                System.out.print("Want to continue? [Yes / No]: ");
                answer = scan.next();
            } while (!(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No")));
        } while (answer.equalsIgnoreCase("Yes"));
    }
}
