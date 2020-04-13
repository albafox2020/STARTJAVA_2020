import java.util.Random;
import java.util.Scanner;
class MyFirstGame {

    public static void main (String [] args) {
        Random random = new Random();
        int num = 0 + random.nextInt (101 - 0);

        System.out.print ("ugadayte chislo ot 0 do 100 ");
        Scanner aa = new Scanner (System.in);
        int vvod = aa.nextInt ();

        while (vvod != num) {

        System.out.print ("vvedite ese ras");
        Scanner bb = new Scanner (System.in);
        vvod = bb.nextInt ();

        if (vvod==num) {
         System.out.println (" Vi ugadali ");
    }
    else if (vvod> num) {
      System.out.println (" Vase chislo bolse zagadannogo ");
    }
    else if (vvod< num) {
      System.out.println (" Vase chislo mense zagadannogo ");
    }
}


  }
}
