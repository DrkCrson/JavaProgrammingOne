package Chapter5;

import java.util.Scanner;

/**
 * Program displays a Voting system in which based off the Users input (their
 * vote), it keeps tally and track of the votes, and when the voting is done, it
 * shows the result of the vote.
 *
 * @author Nicholas Jackson
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ya = 0;
        int no = 0;
        int notValid = 0;

        System.out.println("Enter Y to vote yes, N if you wish to vote No, and Q to stop voting!");
        String vote = input.next();

        while (!vote.equalsIgnoreCase("Q")) {

            if (vote.equalsIgnoreCase("Y")) {
                ya++;
            } else if (vote.equalsIgnoreCase("N")) {
                no++;
            } else {
                System.out.println("\nNOT VALID CODE");
                notValid++;
            }

            System.out.println("Enter Y or N");
            vote = input.next();
        }

        int TotalVotes = ya + no + notValid;

        System.out.println("Yes votes: " + ya);
        System.out.println("No votes: " + no);
    }
}
