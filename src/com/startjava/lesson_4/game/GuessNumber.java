package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private int guessedNumber;
    private Scanner scan = new Scanner(System.in);
    private Random random = new Random();

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void mainGame() {
        guessedNumber = random.nextInt(101);
        for (int i = 1; i <= 10; i++) {
            playerOne.setAttempt(i);
            if (makeMove(playerOne)) {
                break;
            }
            playerTwo.setAttempt(i);
            if (makeMove(playerTwo)) {
                break;
            }
        }

        System.out.println(Arrays.toString(playerOne.getEnteredNums()));
        System.out.println(Arrays.toString(playerTwo.getEnteredNums()));

        playerOne.fillEnteredNums();
        playerTwo.fillEnteredNums();
    }

    private boolean makeMove(Player player) {
        inputNumber(player);
        if (!compareNumbers(player)) {
            if (player.getAttempt() == 10) {
                System.out.println(player.getName() + " have ended attempts");
            }
            return false;
        } else return true;
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + ", enter the number ");
        player.setNumber(scan.nextInt());
    }

    private boolean compareNumbers(Player player) {
        if (player.getNumber() > guessedNumber) {
            System.out.println(player.getName() + " - your number is greater than the guessed ");
        } else if (player.getNumber() < guessedNumber) {
            System.out.println(player.getName() + " - your number is less than the guessed ");
        } else {
            System.out.println(player.getName() + " guessed the number with " + player.getAttempt() + " attempts ");
            return true;
        }
        return false;
    }
}