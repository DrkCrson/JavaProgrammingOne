package Chapter2;

import java.util.Scanner;

/**
 * Program displays Total Amount spent and much Gratuity (Tip) you can give
 *
 * @author Nicholas Jackson
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your subtotal: ");

        double subtotal = input.nextDouble();

        System.out.println("Please enter the Gratuity rate you wish to give! : ");

        double Gratuity = input.nextDouble();
        Gratuity = Gratuity / 100 * subtotal;

        double Total = subtotal + Gratuity;

        System.out.println("Your Gratuity is $" + Gratuity + " and the Total is " + Total);

    }

}
