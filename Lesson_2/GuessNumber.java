import java.util.Random;
import java.util.Scanner;

class GuessNumber {
        private Player playerOne;
        private Player playerTwo;

        public GuessNumber(Player playerOne, Player playerTwo) {
            this.playerOne = playerOne;
            this.playerTwo = playerTwo;
        }

        void playGame() {
            Random random = new Random();
            int guessedNumber = random.nextInt(101);
            boolean checkNumOne = false;
            boolean checkNumTwo = false;
            Scanner scan = new Scanner(System.in);

            while (true) {
                System.out.print(playerOne.getName() + " enters a number from 0 to 100 ");
                playerOne.setNumber(scan.nextInt());

                if (playerOne.getNumber() == guessedNumber) {
                    checkNumOne = true;
                } else if (playerOne.getNumber()  > guessedNumber) {
                    System.out.println(playerOne.getName() + " - your number is greater than the guessed ");
                } else if (playerOne.getNumber()  < guessedNumber) {
                    System.out.println(playerOne.getName() + " - your number is less than the guessed ");
                }

                System.out.print(playerTwo.getName() + " enters a number from 0 to 100 ");
                playerTwo.setNumber(scan.nextInt());

                if (playerTwo.getNumber() == guessedNumber) {
                    checkNumTwo = true;
                } else if (playerTwo.getNumber() > guessedNumber) {
                    System.out.println(playerTwo.getName() + " - your number is greater than the guessed ");
                } else if (playerTwo.getNumber() < guessedNumber) {
                    System.out.println(playerTwo.getName() + " - your number is less than the guessed ");
                }

                if (checkNumOne) {
                System.out.println(playerOne.getName() + " is a winner");
                break;
                } else if (checkNumTwo) {
                    System.out.println(playerTwo.getName() +" is a winner");
                    break;
                } else {
                    System.out.println("One more time");
                }
            }
        }
}
