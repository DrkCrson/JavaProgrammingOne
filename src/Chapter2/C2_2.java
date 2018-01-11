package Chapter2;

import java.util.Scanner;

/**
 * Program displays Area, Length, and Volume
 *
 * @author Nicholas Jackson
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Radius of the Cylinder! : ");

        double radius = input.nextDouble();

        System.out.println("Enter the Length of the Cylinder! : ");

        double Length = input.nextDouble();

        double Area = radius * radius * 3.14;

        double Volume = Area * Length;

        System.out.println("This is the Area: " + Area + " and this is your Volume:  + volume");

    }
}
