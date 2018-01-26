package Chapter3;

import java.util.Scanner;

/**
 * Program displays a game of Heads or Tails
 *
 * @author Nicholas Jackson
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int CoinSide = (int) (Math.random() * 2);
        Scanner input = new Scanner(System.in);
        int inpu;
        System.out.println("0 (Heads) or 1 (Tails) : ");
        inpu = input.nextInt();
        if (CoinSide == inpu) {
            System.out.println("Correct!");
        } else if (CoinSide != inpu) {
            System.out.println("Wrong!");
        }

    }
}
