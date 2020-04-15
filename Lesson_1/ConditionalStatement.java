import java.util.Scanner;

class ConditionalStatement {
    public static void main(String[] args) {
        System.out.print("enter your age ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age > 20) {
            System.out.println("You are over 20 years old ");
        }

        System.out.print("Are you male or female? ");
        String male = scan.nextLine();
        if (male == "male") {
            System.out.println("You are male");
        }
        if (male != "male") {
            System.out.println("female");
        }

        System.out.print("enter your height ");
        double height = scan.nextDouble();
        if (height < 1.80) {
            System.out.println("Your height < 1.80");
        } else {
            System.out.println("Your height > 1.80");
        }

        System.out.print("Enter the first letter of your name ");
        String firstNameLetter = scan.nextLine();
        if (firstNameLetter == "M") {
            System.out.println("First letter of your name is M ");
        } else if (firstNameLetter == "I") {
            System.out.println("First letter of your name is I ");
        } else {
            System.out.println("First letter of your name is different");
        }
    }
}
