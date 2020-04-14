import java.util.Scanner;

class ConditionalStatement {
    public static void main(String [] args) {
        System.out.print("enter your age ");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt ();
        if (age > 20) {
            System.out.println("You are over 20 years old ");
        }

        System.out.print("enter your gender ");
        String gender = scan.nextLine ();
        if (gender == "Male") {
            System.out.println("Male");
        } else {
              System.out.println("Female");
          }

        System.out.print("enter your height ");
        double height = scan.nextDouble ();
        if (height < 1.80) {
            System.out.println("height < 1.80");
        } else {
              System.out.println("height > 1.80");
          }

        System.out.print("Your name begins with ");
        String name = scan.nextLine ();
        if (name== "M") {
            System.out.println("Your name is M ...");
        } else if (name == "I") {
              System.out.println("Your name is I ...");
        } else {
              System.out.println("Your name is different");
        }
    }
}
