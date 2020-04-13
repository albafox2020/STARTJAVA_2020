class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println(" (1)  " +i);
            }
        int m =6;
        while (m>=-6) {
            System.out.println(" (2) " +m);
            m=m-2;
            }
        int n=10;
        int sum=0;
        do {
            n++;
            if (n % 2 !=0) sum=sum+n;
            }
        while (n<20); {
        System.out.println(" (3) "+sum);
        }
    }
}
