package Chapter4;

import java.util.Scanner;

/**
 * Program displays based on what strings the user enters, determines if it is a
 * substring of the first or second string, then displays the answer.
 *
 * @author Nicholas Jackson
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.println("Enter string S1: " + "\nEnter string S2: ");
        Scanner input = new Scanner(System.in);
        String S1 = input.next();
        String S2 = input.next();

        if (S1.contains(S2)) {
            System.out.println(S2 + " is a substring of " + S1);
        } else {
            System.out.println(S2 + " is not a substring of " + S1);
        }
    }
}
