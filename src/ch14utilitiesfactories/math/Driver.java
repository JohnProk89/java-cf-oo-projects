package ch14utilitiesfactories.math;

public class MathDriver {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = MathHelper.getMaxArrayValue(array);
        int min = MathHelper.getMinArrayValue(array);
        double avg = MathHelper.getAverage(array);

        System.out.printf("Tha array's max value is %d and tha min value is %d and the average is %.2f\n", max, min, avg);
    }
}
