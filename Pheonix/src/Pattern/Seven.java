public class Seven {
    public static void main(String[] args) {
        int i = 0, j = 0, count = 0;

        for (i = 5; i > 0; i--) {
            for (j = i; j > 0; j--) {
                System.out.print(" ");
            }
            
            for (int k = 0; k < 2 * count + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
            count++;
        }
    }
}
