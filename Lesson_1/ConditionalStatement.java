import java.util.Scanner;
class ConditionalStatement {
    public static void main (String [] args) {
        System.out.print ("enter your age ");
        Scanner aa = new Scanner (System.in);
        int vozrast = aa.nextInt ();
        if ( vozrast>20) {
            System.out.println ("You are over 20 years old ");
            }
        System.out.print ("enter your gender ");
        Scanner bb = new Scanner (System.in);
        String pol = bb.nextLine ();
        if ( pol=="Male") {
            System.out.println ("Male");
            }
        else {
        System.out.println ("Female");
        }
        System.out.print ("enter your height ");
        Scanner cc = new Scanner (System.in);
        double rost = cc.nextDouble ();
        if ( rost < 1.80) {
            System.out.println ("height < 1.80");
            }
        else {
            System.out.println ("height > 1.80");
            }
        System.out.print ("Your name begins with ");
        Scanner dd = new Scanner (System.in);
        String imy = dd.nextLine ();
        if ( imy== "M") {
            System.out.println ("Your name is M ...");
            }
        else if (imy=="I") {
            System.out.println ("Your name is I ...");
            }
        else {
            System.out.println ("Your name is different");
            }
        }
    }
