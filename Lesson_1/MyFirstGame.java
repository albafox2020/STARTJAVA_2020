import java.util.Random;
import java.util.Scanner;

class MyFirstGame {
    public static void main(String [] args) {
        Random random = new Random();
        int guessedNumber = random.nextInt(101);
        System.out.print("Write a number from 0 to 100 ");
        Scanner scan = new Scanner(System.in);
        int keyboardInput = scan.nextInt();
        while (keyboardInput != guessedNumber) {
            System.out.print("enter again ");
            keyboardInput = scan.nextInt();
            if (keyboardInput == guessedNumber) {
            System.out.println ("You guessed");
            } else if (keyboardInput > guessedNumber) {
            System.out.println ("Your number is greater than the guessed ");
            } else if (keyboardInput < guessedNumber) {
            System.out.println ("Your number is less than the guessed ");
            }
        }
    }
}
