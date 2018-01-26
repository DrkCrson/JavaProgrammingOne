package Chapter8;

import java.util.Scanner;

/**
 * Program displays a system of sales based off an Salesmen ID and the day of
 * the week.
 *
 * @author Nicholas Jackson
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"A", "B", "C", "D"};
        String[] days = {"M", "T", "W", "H", "F"};
        double[][] sales = new double[4][5];
        String resp = "y";
        String dcod, ncod;

        do {
            //sales man
            do {
                System.out.println("Enter the ID of a Salesman (A, B, C, or D): ");
                ncod = input.next().toUpperCase();
            } while (!"A".equals(ncod) && !"B".equals(ncod) && !"C".equals(ncod) && !"D".equals(ncod));

            //day of the week
            do {
                System.out.println("Enter the day in Question (M, T, W, H, F): ");
                dcod = input.next().toUpperCase();
            } while (!"M".equals(dcod) && !"T".equals(dcod) && !"W".equals(dcod) && !"H".equals(dcod) && !"F".equals(dcod));

            sales = Values(names, days, ncod, dcod, sales);

            //yes or no
            do {
                System.out.println(" (y or n): ");
                resp = input.next();
            } while (!resp.equalsIgnoreCase("y") && !resp.equalsIgnoreCase("n"));

        } while (resp.equalsIgnoreCase("y"));

        System.out.println("    M   T    W   H   F");
        System.out.println("A [" + sales[0][0] + " " + sales[0][1] + " " + sales[0][2] + " " + sales[0][3] + " " + sales[0][4] + "]");
        System.out.println("B [" + sales[1][0] + " " + sales[1][1] + " " + sales[1][2] + " " + sales[1][3] + " " + sales[1][4] + "]");
        System.out.println("C [" + sales[2][0] + " " + sales[2][1] + " " + sales[2][2] + " " + sales[2][3] + " " + sales[2][4] + "]");
        System.out.println("D [" + sales[3][0] + " " + sales[3][1] + " " + sales[3][2] + " " + sales[3][3] + " " + sales[3][4] + "]");
    }

    /**
     * Rate Method
     *
     * @param rate displays the rate of a sale depending on the salesman
     */
    /**
     *
     * @param names shows the names based of the salesmen ID
     * @param days shows the days of the week
     * @param nc a name of a value for the sales
     * @param dc another name a value for the sales
     * @param rate the rate of the sale
     * @return the rate of the sales
     */
    public static double[][] Values(String[] names, String[] days, String nc, String dc, double[][] rate) {
        Scanner input = new Scanner(System.in);
        int row = java.util.Arrays.binarySearch(names, nc);
        int column = 0;
        for (int i = 0; i < days.length; ++i) {
            if (days[i].equals(dc)) {
                column += i;
            }
        }
        System.out.println("Please enter in new Sales: ");
        double price = input.nextDouble();
        rate[row][column] += price;
        return rate;

    }

}
