import java.util.Random;
import java.util.Scanner;

class GuessNumber {
    String answer;
    void game() {
        do {
            Random random = new Random();
            int guessedNumber = random.nextInt(101);
            boolean checkNumOne = false;
            boolean checkNumTwo = false;

            Player playerOne = new Player();
            System.out.print("Enter the name of the first player ");
            Scanner scanNameOne = new Scanner(System.in);
            playerOne.setName(scanNameOne.nextLine());

            Player playerTwo = new Player();
            System.out.print("Enter the name of the second player ");
            Scanner scanNameTwo = new Scanner(System.in);
            playerTwo.setName(scanNameTwo.nextLine());

            while (true) {

                System.out.print(playerOne.getName() + " enters a number from 0 to 100 ");
                Scanner scanNumberOne = new Scanner(System.in);
                playerOne.setNumber(scanNumberOne.nextInt());

                if (playerOne.getNumber() == guessedNumber) {
                    checkNumOne = true;
                } else if (playerOne.getNumber() > guessedNumber) {
                    System.out.println(playerOne.getName() + " - your number is greater than the guessed ");
                } else if (playerOne.getNumber() < guessedNumber) {
                    System.out.println(playerOne.getName() + " - your number is less than the guessed ");
                }

                System.out.print(playerTwo.getName() + " enters a number from 0 to 100 ");
                Scanner scanNumberTwo = new Scanner(System.in);
                playerTwo.setNumber(scanNumberTwo.nextInt());

                if (playerTwo.getNumber() == guessedNumber) {
                    checkNumTwo = true;
                } else if (playerTwo.getNumber() > guessedNumber) {
                    System.out.println(playerTwo.getName() + " - your number is greater than the guessed ");
                } else if (playerTwo.getNumber() < guessedNumber) {
                    System.out.println(playerTwo.getName() + " - your number is less than the guessed ");
                }

                GuessNumberTest oneWin = new GuessNumberTest();
                if (checkNumOne) {
                    System.out.println(playerTwo.getName() + " is a winner");
                    break;
                }

                GuessNumberTest twoWin = new GuessNumberTest();
                if (checkNumTwo) {
                    System.out.println(playerTwo.getName() +" is a winner");
                    break;
                } else {
                    System.out.println("One more time");
                }
            }

            do {
                System.out.print("Want to continue? [Yes / No]: ");
                Scanner scanAnswer = new Scanner(System.in);
                answer = scanAnswer.next();
            } while (! (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No")));
        } while (answer.equalsIgnoreCase("Yes"));
    }
}
