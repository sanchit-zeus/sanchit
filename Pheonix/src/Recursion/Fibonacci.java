public class Fibonacci {

    void fibonacci(int n) {
        int i = 0, j = 1, next;

        if (n >= 1) {
            System.out.print(i + " ");
        }

        if (n >= 2) {
            System.out.print(j + " ");
        }

        for (int k = 0; k < n - 2; k++) {
            next = i + j;
            i = j;
            j = next;

            System.out.print(next + " ");
        }
    }

    public static void main(String[] args) {

        Fibonacci obj = new Fibonacci();
        obj.fibonacci(50);
    }
}
