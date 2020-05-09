package Day10_Switch_Scanner;

import java.util.Scanner;

public class RateCalculator {
    /*
    write a program for the rate calculater: rateCalculator
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary here: ");
            int salary = scan.nextInt();
        System.out.println("Enter the hours a week you work: ");
            byte hours = scan.nextByte();
        System.out.println("The hourly rate is "+(salary/(hours*52)));

    }
}
