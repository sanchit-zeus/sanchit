public class Factorial {

    public void factorial(int num, int fact) {

        if (num == 1) {
            System.out.println(fact);
            return;
        }

        fact = fact * num;

        num--;

        factorial(num, fact);

    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();

        obj.factorial(15, 1);
    }
}
