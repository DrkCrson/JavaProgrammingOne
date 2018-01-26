package Chapter4;

import java.util.Scanner;

/**
 * Program displays a Bidding system that will compare the bids of two
 * contractors against each other to determine which contractor is cheaper for
 * the user.
 *
 * @author Nicholas Jackson
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.println("The name of the First Bidder? : ");
        System.out.println("Hours of work required? : ");
        System.out.println("Cost of the First Bidder per hour? : ");
        Scanner input = new Scanner(System.in);
        String firstBidder = input.next();
        int firstHours = input.nextInt();
        double firstRate = input.nextDouble();
        System.out.println("The name of the Second Bidder : ");
        System.out.println("Hours of work required? : ");
        System.out.println("Cost of the Second Bidder per hour?: ");
        String secondBidder = input.next();
        int secondHours = input.nextInt();
        double secondRate = input.nextDouble();

        double firstHourCost = firstHours * firstRate;
        System.out.println("Total cost for First Bidder is: $ "
                + firstHourCost);
        double secondHourCost = secondHours * secondRate;
        System.out.println("Total cost for Second Bidder is $"
                + secondHourCost);

        if (firstHourCost < secondHourCost) {
            System.out.printf("\nThe winner is %s, with a total cost of $%.2f ",
                    firstBidder, firstHourCost);
        }
        if (secondHourCost < firstHourCost) {
            System.out.printf("\nThe winnder is %s, with a total cost of $%.2f ",
                    secondBidder, secondHourCost);
        }
        if (firstHourCost == secondHourCost && firstHours < secondHours) {
            System.out.printf("\nThe winner is %s, with a total cost of $%.2f "
                    + "and a total of %d hours.", firstBidder, firstHourCost,
                    firstHours);
        }
        if (firstHourCost == secondHourCost && secondHours < firstHours) {
            System.out.printf("\nWinner is %s, with Total cost of $%.2f "
                    + "and a Total of %d Hours.", secondBidder,
                    secondHourCost, secondHours);
        }
        if (firstHourCost == secondHourCost && firstHours == secondHours) {
            System.out.printf("\n%s and %s have identical bids. Hours "
                    + "required are %d and Total cost is"
                    + " $%.2f at $%.2f per Hour.", firstBidder, secondBidder, firstHours,
                    firstHourCost, firstRate);
        }
    }
}
