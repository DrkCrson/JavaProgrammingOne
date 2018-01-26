package Chapter7;

import java.util.*;

/**
 * Program displays an array value and shows the average.
 * @author Nicholas Jackson
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter in an Array Legnth: ");
        int length = input.nextInt();
        int[] array = new int[length];
        array = getValues(array);
        System.out.print("Avgerage :" + getAvg(array));
        printArray(array);
    }

    /**
     * Method to display what the value is.
     *
     * @param array shows the the value and returns the array
     * @return the array of the value
     */
    public static int[] getValues(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int x = 0; x < array.length; ++x) {
            System.out.print("Please enter the value! :");
            array[x] = input.nextInt();
        }
        return array;
    }

    /**
     * Returns average
     *
     * @param array takes the length and returns the average
     * @return the array length
     */
    public static double getAvg(int[] array) {
        double avg = 0;
        for (int x = 0; x < array.length; ++x) {
            avg += array[x];
        }
        avg = avg / array.length;
        return avg;
    }

    /**
     *
     * @param array prints out the array
     */
    public static void printArray(int[] array) {
        System.out.print("Array: " + Arrays.toString(array));
    }
}
