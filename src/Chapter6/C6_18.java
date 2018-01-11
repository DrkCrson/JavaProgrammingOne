package Chapter6;

import java.util.Scanner;

/**
 * Program displays a Password checker that checks if your password is secure
 * enough to use, based on the password the User inputs. It puts it up against
 * checks and if the password passes, then the program tells the user that the
 * password is good and ready to go.
 *
 * @author Nicholas Jackson
 */

public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Correct = "Valid Password";
        System.out.println("Please enter in your password : ");
        String pass = input.next();
        if (checkLength(pass).equals("no")) {
            Correct = "Invalid Password";

        } else if (lettersAndDigits(pass).equals("no")) {
            Correct = "Invalid Password";

        } else if (containsTwoDigits(pass).equals("no")) {
            Correct = "Invalid password";
        }
        System.out.println(Correct);
    }

    public static String checkLength(String pass) {
        if (pass.length() >= 8) {

            return "yes";
        } else {
            return "no";
        }
    }

    public static String lettersAndDigits(String pass) {
        int no = 0;
        for (int x = 0; x < pass.length(); x++) {
            if (!Character.isLetterOrDigit(pass.charAt(x))) {
                ++no;
            }
        }
        if (no == 0) {
            return "yes";
        } else {
            return "no";
        }
    }

    public static String containsTwoDigits(String pass) {
        int counter = 0;
        for (int x = 0; x < pass.length(); x++) {
            if (Character.isDigit(pass.charAt(x))) {
                ++counter;
            }
        }
        if (counter >= 2) {
            return "yes";
        } else {
            return "no";
        }
    }
}
