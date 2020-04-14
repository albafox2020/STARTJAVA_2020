class Cycle {
    public static void main(String[] args) {
        for (int firstResult = 0; firstResult <= 20; firstResult++) {
            System.out.println(" (1)  " + firstResult);
        }

        int secondResult = 6;
        while (secondResult >= -6) {
            System.out.println(" (2) " + secondResult);
            secondResult = secondResult - 2;
        }

        int thirdResult = 10;
        int sum = 0;
        do {
            thirdResult++;
            if (thirdResult % 2 != 0) sum = sum + thirdResult;
        } while (thirdResult < 20); {
            System.out.println(" (3) "+ sum);
        }
    }
}
