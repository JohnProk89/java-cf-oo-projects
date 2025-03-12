package ch14utilitiesfactories.validation;

/**
 * Validation utility class
 */
public class ValidationUtils {

    /**
     * Checks if a string's length is between 1 and 31 characters
     * @param str the input string
     * @return true if string in limits
     */
    public static boolean isLengthOK(String str) {
        return !str.isEmpty() && str.length() <= 31;
    }

    /**
     * Checks if a number is between 1 and 10
     * @param num the input number
     * @return true if number in limits
     */
    public static boolean isNumberOK(int num) {
        return num >= 1 && num <= 10;
    }
}
