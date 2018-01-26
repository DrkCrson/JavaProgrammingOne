package Chapter7;

import java.util.Arrays;

import java.util.Scanner;

/**
 * Program displays an list of numbers based off Ten Numbers inputed by the
 * User, then shows the smallest number.
 *
 * @author Nicholas Jackson
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 10 Numbers: ");
        double array[] = new double[10];
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }
        System.out.print("Smallest Number is: " + small(array));
    }

    /**
     *
     * @param array shows the array and sorts it
     * @return it returns the smallest number
     */
    public static double small(double array[]) {
        Arrays.sort(array);
        double small = array[0];
        return small;
    }

}
