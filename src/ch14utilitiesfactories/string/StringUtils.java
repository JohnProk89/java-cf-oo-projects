package ch14utilitiesfactories.string;

/**
 * String utility class
 */
public class StringUtils {

    private StringUtils(){}

    /**
     * Reverses a string
     * @param str the input string
     * @return the string reversed
     */
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        String reversed;
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        reversed = sb.toString();
        return reversed;
    }

    /**
     * Sets a string to upper case
     * @param str the input string
     * @return the string in upper case
     */
    public static String upperCase(String str) {
        return str.toUpperCase();
    }

    /**
     * Checks if a string is palindrome
     * @param str the input string
     * @return true if the string is a palindrome
     */
    public static boolean isPalindrome(String str) {
        return str.equals(reverse(str));
    }
}
