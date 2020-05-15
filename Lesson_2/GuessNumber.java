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
            Scanner scan = new Scanner(System.in);

            while (playerOne.getNumber() != guessedNumber || playerTwo.getNumber() != guessedNumber){
                System.out.print(playerOne.getName() + " enters a number from 0 to 100 ");
                playerOne.setNumber(scan.nextInt());

                if (playerOne.getNumber() == guessedNumber) {
                    break;
                } else if (playerOne.getNumber()  > guessedNumber) {
                    System.out.println(playerOne.getName() + " - your number is greater than the guessed ");
                } else if (playerOne.getNumber()  < guessedNumber) {
                    System.out.println(playerOne.getName() + " - your number is less than the guessed ");
                }

                System.out.print(playerTwo.getName() + " enters a number from 0 to 100 ");
                playerTwo.setNumber(scan.nextInt());

                if (playerTwo.getNumber() == guessedNumber) {
                     break;
                } else if (playerTwo.getNumber() > guessedNumber) {
                    System.out.println(playerTwo.getName() + " - your number is greater than the guessed. One more time. ");
                } else if (playerTwo.getNumber() < guessedNumber) {
                    System.out.println(playerTwo.getName() + " - your number is less than the guessed. One more time. ");
                }
            }
            if (playerOne.getNumber() == guessedNumber) {
                System.out.println(playerOne.getName() + " is a winner");
            } else {
                System.out.println(playerTwo.getName() +" is a winner");
            }
        }
}
