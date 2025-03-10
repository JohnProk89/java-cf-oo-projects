package ch14utilitiesfactories.validation;

public class Driver {

    public static void main(String[] args) {
        String strGood = "I am good";
        String strBad = "I am way out of limits bro, or maybe now I am indeed";
        int numGood = 9;
        int numBad = -4;
        System.out.printf("String: '%s' is within limits: %b\n", strGood, ValidationUtils.isLengthOK(strGood));
        System.out.printf("String: '%s' is within limits: %b\n", strBad, ValidationUtils.isLengthOK(strBad));
        System.out.printf("Number: '%d' is within limits: %b\n", numGood, ValidationUtils.isNumberOK(numGood));
        System.out.printf("Number: '%d' is within limits: %b\n", numBad, ValidationUtils.isNumberOK(numBad));
    }
}
