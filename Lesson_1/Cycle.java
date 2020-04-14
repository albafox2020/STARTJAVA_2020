class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(" (1)  " + i);
        }

        int counter1 = 6;
        while (counter1 >= -6) {
            System.out.println(" (2) " + counter1);
            counter1 -= 2;
        }

        int counter2 = 10;
        int sum = 0;
        do {
            counter2++;
            if (counter2 % 2 != 0) {
                sum += counter2;
            }
        } while (counter2 < 20); {
              System.out.println(" (3) "+ sum);
          }
    }
}
