public class Print {

    public void printName(String name, int times, int count) {

        if (count == times) {
            return;
        }

        System.out.println(name);

        count++;

        printName(name, times, count);
    }

    public void printNumber(int number, int count) {

        System.out.println(count);

        if (count == number) {
            return;
        }

        count++;

        printNumber(number, count);
    }

    public void printNumberReverse(int number, int count) {

        System.out.println(number);

        if (number == count) {
            return;
        }

        number--;

        printNumberReverse(number, count);
    }

    public void printNumberSum(int number, int sum, int count) {

        sum = sum + count;

        if (number == count) {
            System.out.println(sum);
            return;
        }

        count++;

        printNumberSum(number, sum, count);
    }

    public static void main(String[] args) {
        Print obj = new Print();

        obj.printName("Sanchit", 10, 0);
        obj.printNumber(10, 1);
        obj.printNumberReverse(10, 1);
        obj.printNumberSum(10, 0, 1);
    }
}
