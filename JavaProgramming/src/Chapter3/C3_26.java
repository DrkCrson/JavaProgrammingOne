package Chapter3;

import java.util.Scanner;

/**
 * Program displays
 *
 * @author Nicholas Jackson
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double inp;
        System.out.println("Enter a Value! : ");
        inp = input.nextDouble();
        if ((inp % 5 == 0) && (inp % 6 == 0)) {
            System.out.println("Value can be divided by both! ");
        } else {
            System.out.println("Valuse can't be divided by both!");
        }

        if ((inp % 5 == 0) || (inp % 6 == 0)) {
            System.out.println("Value can be divided by one or the another! ");
        } else {
            System.out.println("Value can't be divided by one or the other");
        }

        if ((inp % 5 == 0) ^ (inp % 6 == 0)) {
            System.out.println("Value can be divided by one but not both!");
        } else {
            System.out.println("Vlaue can't be divided by either");
        }

    }

}
