package ch14utilitiesfactories.string;

public class Driver {

    public static void main(String[] args) {
        String str = "anna";
        System.out.println("Original String: " + str);
        String reversed = StringUtils.reverse(str);
        System.out.println("Reversed String: " + reversed);
        String upper = StringUtils.upperCase(str);
        System.out.println("String to upper case: " + upper);
        System.out.println("Palindrome check: " + StringUtils.isPalindrome(str));
    }
}
