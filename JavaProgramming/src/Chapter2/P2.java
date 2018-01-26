package Chapter2;

import java.util.Scanner;

/**
 * Program displays Total amount for a meal, breaking down the price of the
 * TOTAL dinner as well as displaying the Sales Tax and Tip, then shows Final
 * Total
 *
 * @author Nicholas Jackson
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double meal;
        double drink;
        double dessert;
        double salesTax;
        double tip;
        double dinner;
        double total;
        double displayTax = 10, displayTip = 15;

        System.out.println("Enter the price of the Meal! : ");
        meal = input.nextDouble();

        System.out.println("Please enter the price of the Drink! : ");
        drink = input.nextDouble();

        System.out.println("And lastly, enter the price of the  Dessert! : ");
        dessert = input.nextDouble();

        // TO get the main juicy numbers:
        dinner = meal + drink + dessert;
        salesTax = dinner * .1;
        tip = (salesTax + dinner) * .15;
        total = dinner + salesTax + tip;

        System.out.println("The Dinner price will be $" + dinner + " with sales tax"
                + " being $" + salesTax + " and the tip being $" + tip + " , making"
                + " your today's total to come out to: $" + total);
    }
}
