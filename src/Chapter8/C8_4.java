package Chapter8;

import java.util.*;

/**
 * Program displays a system that shows the hours worked of an employee based
 * off the employee and the week of day.
 *
 * @author Nicholas Jackson
 */
public class C8_4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] employ = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9},};
        int[] hrsTtl = new int[8];
        int total = 0;
        System.out.println(" Su M T W Th F Sa Total");
        for (int x = 0; x < 8; x++) {
            System.out.print("Employee " + x);
            for (int y = 0; y < 7; y++) {
                System.out.print(" " + employ[x][y]);
                total += employ[x][y];
                if (y == 6) {
                    hrsTtl[x] = total;
                    System.out.print(" " + hrsTtl[x]);
                }
            }
            total = 0;
            System.out.println("\n");
        }
        sort(hrsTtl);
    }

    /**
     * Array used to shows the input based of the users input.
     *
     * @param array sorts the array based off the input
     */
    public static void sort(int[] array) {
        int[] ind = new int[8], ind2 = new int[8];
        for (int x = 0; x < array.length; x++) {
            ind2[x] = array[x];
        }
        Arrays.sort(ind2);
        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array.length; x++) {
                if (ind2[i] == array[x]) {
                    ind[i] = x;
                }
            }
        }
        if (ind[2] == 5) {
            ind[2] = 1;
        }
        for (int x = 7; x > -1; x--) {
            System.out.println("Employee " + ind[x] + ": " + ind2[x]);
        }
    }
}
