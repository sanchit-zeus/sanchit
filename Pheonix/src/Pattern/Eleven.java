public class Eleven {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 0; i < 5; i++) {
            num = (i % 2 == 0) ? 0 : 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num);
                num = (num == 1) ? 0 : 1;
            }
            System.out.println();
        }
    }
}
