package Chapter6;

import java.util.Scanner;

/**
 * Program displays a Conversion System that takes the User input of USD and
 * converts it into Euros, Pound, and Yen. It allows the User to do as many
 * conversions as they see fit.
 *
 * @author Nicholas Jackson
 */

public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String resp, type;
        double amount;
        System.out.println("Conversion rate of Euros to USD : ");
        double ed = input.nextDouble();
        System.out.println("Conversion rate of Pound to USD : ");
        double pd = input.nextDouble();
        System.out.println("Conversion rate of Yen to USD : ");
        double yd = input.nextDouble();

        do {
            System.out.println("Enter the amount of USD  your Converting : ");
            amount = input.nextDouble();
            System.out.println("Enter Y for Yen,  P for Pound, or E for Euro : ");
            type = input.next();

            if (type.equalsIgnoreCase("E")) {
                System.out.printf(" %.2f USD is %.2f %s. \n", amount, convert(ed, amount), type);
            } else if (type.equalsIgnoreCase("P")) {
                System.out.printf("%.2f USD is %.2f %s. \n", amount, convert(pd, amount), type);
            } else if (type.equalsIgnoreCase("Y")) {
                System.out.printf("%.2f USD is %.2f %s. \n", amount, convert(yd, amount), type);
            }

            do {
                System.out.println("More Conversions? (y for Yes or n for No):");
                resp = input.next();
            } while (!resp.equalsIgnoreCase("n") && !resp.equalsIgnoreCase("y"));
        } while (resp.equalsIgnoreCase("y"));
    }

    public static double convert(double rate, double amount) {
        double mony, ttl, money;
        if (amount <= 100) {
            ttl = amount - (amount * 0.1);
            money = ttl * rate;
        } else {
            ttl = amount - (amount * 0.05);
            money = ttl * rate;
        }
        mony = money;
        return mony;
    }
}