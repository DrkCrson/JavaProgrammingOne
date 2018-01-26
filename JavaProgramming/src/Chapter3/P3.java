package Chapter3;

import java.util.Scanner;

/**
 * Program displays a Grading system based on a users input of 2 numbers between
 * a range of 1 and 100.
 *
 * @author Nicholas Jackson
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double FirstNum;
        double SecondNum;
        System.out.println("Enter a number betwwen 1 and 100:");
        FirstNum = input.nextDouble();
        System.out.println("Enter a number between 1 and 100:");
        SecondNum = input.nextDouble();

        // Less Than, Greater Than, Less Than OR Equal To, and Not Equal To Determiner
        if (FirstNum < SecondNum) {
            System.out.println("First number is LESS than Second number.");
        } else;

        if (FirstNum > SecondNum) {
            System.out.println("First number is GREATER than Second number");
        } else;

        if (FirstNum == SecondNum) {
            System.out.println("First number is EQUAL to Second number.");
        } else;

        if (FirstNum <= SecondNum) {
            System.out.println("Frist number is LESS than OR EQUAL to the Second number.");
        } else;

        if (FirstNum != SecondNum) {
            System.out.println("First number is NOT EQUAL to Second number.");
        } else;

        // Proper and Improper Functions & Dividing by 0 
        if (SecondNum == 0) {
            System.out.println("Number CAN'T divided by 0.");
        } else if ((FirstNum / SecondNum) < 1) {
            System.out.println("Proper Function.");
        } else {
            System.out.println("Improper Function.");
        }
        // Grades System Checker

        if (FirstNum >= 90) {
            System.out.println("A");
        } else if (FirstNum >= 80) {
            System.out.println("B");
        } else if (FirstNum >= 70) {
            System.out.println("C");
        } else if (FirstNum >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // Range Determiner
        if ((SecondNum > 1) && (SecondNum < 100)) {
            System.out.println("Number is in Range.");
        } else {
            System.out.println("Out of Range.");
        }

    }
}
