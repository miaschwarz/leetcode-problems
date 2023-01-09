import java.util.ArrayList;

public class Palindromy {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        String iToStr = Integer.toString(x);
        StringBuilder reverseString = new StringBuilder(iToStr);
        reverseString.reverse();
        String result = reverseString.toString();
        if (iToStr.equals(result)) {
            return true;
        } else {
            return false;
        }
    }
}
