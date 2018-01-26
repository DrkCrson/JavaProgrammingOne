package Chapter3;

import java.util.Scanner;

/**
 * Program displays Package comparison of prices and lets you know the cheapest
 * option to ship.
 *
 * @author Nicholas Jackson
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // P is Price, W is Weight
        double OneP;
        double TwoP;
        int OneW;
        int TwoW;
        System.out.println("Enter the Price of Package 1. : ");
        OneP = input.nextDouble();
        System.out.println("Enter the Weight of Package 1. : ");
        OneW = input.nextInt();
        System.out.println("Enter the Price of Package 2. : ");
        TwoP = input.nextDouble();
        System.out.println("Enter the Price of Package 2. : ");
        TwoW = input.nextInt();
        if (OneP / OneW > TwoP / TwoW) {
            System.out.println("Package 2 is a Better Price. ");
        } else if (OneP / OneW == TwoP / TwoW) {
            System.out.println("Package price is the same. ");
        } else {
            System.out.println("Package 1 is a Better Price. ");
        }
    }

}
