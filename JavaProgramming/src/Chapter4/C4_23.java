package Chapter4;

import java.util.Scanner;

/**
 * Program displays an employer system that will display the total amount of
 * money is taken from an employee based on certain information.
 *
 * @author Nicholas Jackson
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        System.out.println("Enter the Employees’ name: ");
        System.out.println("Number of hours worked this week?: ");
        System.out.println("Hourly pay rate?: ");
        System.out.println("Federal tax withholding rate: ");
        System.out.println("State tax withholding rate: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        double Hour = input.nextDouble();
        double Hourrate = input.nextDouble();
        double Fedtax = input.nextDouble();
        double Statetax = input.nextDouble();
        System.out.printf("Employee name: %s", name);
        System.out.printf("\nHours Worked: %.2f", Hour);
        System.out.printf("\nPay Rate: $%.2f", Hourrate);
        System.out.printf("\nGross Pay: $%.2f", (Hourrate * Hour));
        System.out.print("\nDeductions:");
        double Grosspay = Hourrate * Hour;
        double Fedwithhold = Grosspay * Fedtax;
        double Statewithhold = Grosspay * Statetax;
        System.out.printf("\n\tFederal Withholding (%.2f%%):$%.2f\n", Fedtax * 100, Fedwithhold);
        System.out.printf("\tState Deduction (%.2f%%):$%.2f\n", Statetax * 100, Statewithhold);
        System.out.printf("\tTotal Deduction: $%.2f", Fedwithhold + Statewithhold);
        System.out.printf("\nNet Pay: $%.2f\n", Grosspay - (Fedwithhold + Statewithhold));

    }
}
