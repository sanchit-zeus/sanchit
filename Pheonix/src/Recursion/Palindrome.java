public class Palindrome {

    void checkPalindrome(String str) {
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }

    void checkPalindromeRecursion(String str, int i) {
        str = str.toLowerCase();

        if (i == str.length()) {
            System.out.println("Palindrome");
            return;
        }

        if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
            System.out.println("Not palindrome");
            return;
        }

        checkPalindromeRecursion(str, i + 1);
    }

    public static void main(String[] args) {

        Palindrome obj = new Palindrome();
        obj.checkPalindromeRecursion("MalayalaM", 0);
    }
}
