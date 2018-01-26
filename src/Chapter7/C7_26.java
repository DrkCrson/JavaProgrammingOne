package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program displays a Grading System that takes an Users input and shows the
 * grade the user will have based off their input.
 *
 * @author Nicholas Jackson
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean equal;
        System.out.println("Please enter the length of the arrays: ");
        int length = input.nextInt();
        int[] listOne = new int[length];
        int[] listTwo = new int[length];
        System.out.println("Enter " + length + " values for the first list: ");
        for (int x = 0; x < listOne.length; ++x) {
            listOne[x] = input.nextInt();
        }
        System.out.println("Enter " + length + " values for the second list: ");
        for (int x = 0; x < listTwo.length; ++x) {
            listTwo[x] = input.nextInt();
        }
        equalArray(listOne, listTwo);
    }

    /**
     * Method checks to see if both lists are equal, then prints if lists are
     * equal.
     *
     * @param arrayOne First list of values
     * @param arrayTwo Second list of values
     */
    public static void equalArray(int[] arrayOne, int[] arrayTwo) {
        boolean correct = false;
        for (int x = 0; x <= arrayOne.length; ++x) {

            if (arrayOne[x] == arrayTwo[x]) {
                correct = true;
            } else {
                correct = false;
            }
        }

        if (correct = true) {

            System.out.print("Your lists are strictly identical.");
        } else {
            System.out.print("Your lists are not. ");
        }
    }
}
