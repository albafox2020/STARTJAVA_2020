package com.startjava.lesson_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class GuessNumber {
        private Player playerOne;
        private Player playerTwo;
        private int guessedNumber;
        private int attemptPlus;
        Scanner scan = new Scanner(System.in);

        public GuessNumber(Player playerOne, Player playerTwo) {
            this.playerOne = playerOne;
            this.playerTwo = playerTwo;
        }

        void startGame() {
            Random random = new Random();
            guessedNumber = random.nextInt(101);

            for (int i = 0; i < 10; i++) {
                if (!makeMove(playerOne, playerOne.getAttempt())) {
                    break;
                } else if (!makeMove(playerTwo, playerOne.getAttempt())) {
                    break;
                } else if (playerTwo.getAttempt() == 9) {
                    break;
                }
            }

            if (playerOne.getAttempt() == 9) {
                System.out.println(playerOne.getName() + " have ended attempts");
            } else if (playerTwo.getAttempt() == 9) {
                System.out.println(playerTwo.getName() + " have ended attempts");
            }

            showEnteredNums(playerOne.getEnteredNums(), playerOne.getAttempt());
            showEnteredNums(playerTwo.getEnteredNums(), playerOne.getAttempt());
            fill(playerOne.getEnteredNums(), playerOne.getAttempt());
            fill(playerTwo.getEnteredNums(), playerOne.getAttempt());
        }

        private boolean makeMove(Player player, int attempt) {
            inputNumber(player, attempt);
            compareNumbers(player, attempt);
            if (player.getEnteredNums(attempt) == guessedNumber) {
                return false;
            }
            return playerOne.getEnteredNums(attempt) != guessedNumber;
        }

        private void inputNumber(Player player, int attempt) {
            System.out.print(player.getName() + ", enter the number: ");
            player.setEnteredNums(scan.nextInt(), attempt);
            attemptPlus = player.getAttempt();
            attemptPlus++;
            player.setAttempt(attemptPlus);
        }

        private void compareNumbers(Player player, int attempt) {
            if (player.getEnteredNums(attempt) > guessedNumber) {
                System.out.println(player.getName() + " - your number is greater than the guessed" + guessedNumber);
            } else if (player.getEnteredNums(attempt) < guessedNumber) {
                System.out.println(player.getName() + " - your number is less than the guessed " + guessedNumber);
            } else {
                System.out.println(player.getName() + " guessed the number " + guessedNumber + " with " + (player.getAttempt() + 1) + " attempts. ");
            }
        }

        private void showEnteredNums(int[] enteredNums,int attempt) {
            int[] enteredNumsCopy = Arrays.copyOf(enteredNums, attempt + 1);
            System.out.println(Arrays.toString(enteredNumsCopy));
        }

        private void fill(int[] enteredNums, int attempt) {
            if (attempt < 9) {
                Arrays.fill(enteredNums, 0, attempt + 1, 0);
            }
        }
}
