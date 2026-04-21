public class Twelve {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 0; i <= n; i++) {
            int loop = 0;
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                loop = j;
            }

            for (int j = 0; j < (n * 2 - i * 2); j++) {
                System.out.print(" ");
            }

            for (int j = loop; j > 0; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
