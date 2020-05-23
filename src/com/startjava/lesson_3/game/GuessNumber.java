package com.startjava.lesson_3.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class GuessNumber {
        private Player playerOne;
        private Player playerTwo;


        public int getGuessedNumber() {
            return guessedNumber;
        }

        public void setGuessedNumber(int count) {
            this.guessedNumber = count;
        }

        int guessedNumber;

        Scanner scan = new Scanner(System.in);

        public GuessNumber(Player playerOne, Player playerTwo) {
            this.playerOne = playerOne;
            this.playerTwo = playerTwo;
        }

        private void gameOnePl() {
            System.out.print(playerOne.getName() + " enters a number from 0 to 100 ");
            playerOne.setNumber(scan.nextInt());

            if (playerOne.getNumber() > guessedNumber) {
                System.out.println(playerOne.getName() + " - your number is greater than the guessed ");
            } else if (playerOne.getNumber() < guessedNumber) {
                System.out.println(playerOne.getName() + " - your number is less than the guessed ");
            }

            if (playerOne.getCount() == 9) {
                System.out.println(playerOne.getName() + " have ended attempts ");
            }
        }

        private void gameTwoPl() {
            System.out.print(playerTwo.getName() + " enters a number from 0 to 100 ");
            playerTwo.setNumber(scan.nextInt());

            if (playerTwo.getNumber() > guessedNumber) {
                System.out.println(playerTwo.getName() + " - your number is greater than the guessed. One more time. ");
            } else if (playerTwo.getNumber() < guessedNumber) {
                System.out.println(playerTwo.getName() + " - your number is less than the guessed. One more time. ");
            }

            if (playerTwo.getCount() == 9) {
                System.out.println(playerTwo.getName() + " have ended attempts ");
            }
        }

        private void vinner() {
            if (playerOne.getNumber() == guessedNumber) {
                System.out.println(playerOne.getName() + " guessed the number with " + playerOne.getCount() + " attempts! ");
            } else if (playerTwo.getNumber() == guessedNumber) {
                System.out.println(playerTwo.getName() + " guessed the number with " + playerTwo.getCount() + " attempts! ");
            } else {
                System.out.println("No winners ");
            }
        }

        private void copyArr(int[] arrPl, int count) {
            int[] arrPlCopy = Arrays.copyOf(arrPl, count);
            System.out.println(Arrays.toString(arrPlCopy));
        }

        public void startGame() {
            Random random = new Random();
            guessedNumber = random.nextInt(101);
            while (playerOne.getNumber() != guessedNumber || playerTwo.getNumber() != guessedNumber) {
                gameOnePl();
                int countplus1 = playerOne.getCount();
                countplus1++;
                playerOne.setCount(countplus1);
                if (playerOne.getNumber() == guessedNumber) {
                    break;
                }

                gameTwoPl();
                int countplus2 = playerTwo.getCount();
                countplus2++;
                playerTwo.setCount(countplus2);
                if (playerTwo.getNumber() == guessedNumber) {
                    break;
                }
                if ((playerOne.getCount() == 10) || (playerTwo.getCount() == 10)) {
                    break;
                }

            }
            vinner();
            copyArr(playerOne.getArrPl(), playerOne.getCount());
            System.out.println(" ");
            copyArr(playerTwo.getArrPl(), playerTwo.getCount());
            playerOne.fill();
            playerTwo.fill();
            playerOne.setCount(0);
            playerTwo.setCount(0);
        }
}
