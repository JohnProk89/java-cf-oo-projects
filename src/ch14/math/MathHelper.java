package ch14.math;

/**
 * Utility class on arrays
 */
public class MathHelper {

    /**
     * Gets the max value of an array
     * @param array the input array
     * @return the max value
     */
    public static int getMaxArrayValue(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * Gets the min value of an array
     * @param array the input array
     * @return the min value
     */
    public static int getMinArrayValue(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Calculated the average of all the array values
     * @param array the input array
     * @return the average
     */
    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }
}
