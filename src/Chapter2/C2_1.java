package Chapter2;

import java.util.Scanner;

/**
 * Program displays Temperature in Celsius & Converts it to Fahrenheit
 *
 * @author Nicholas Jackson
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Celsius temperature: ");

        double celsius = input.nextDouble();

        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.println("This is your fahrenheit tempature: " + fahrenheit);

    }

}
