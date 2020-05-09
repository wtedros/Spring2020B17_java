package Day10_Switch_Scanner;

import java.util.Scanner;

public class number_Scanner {
    /*
    Write a program that asks user to enter three numbers.
    Then print out the maximum and minimum number
        number_scanner
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //object of scanner

        System.out.println("Enter your first number: ");
            int num1 = scan.nextInt();

        System.out.println("Enter your second number: ");
            int num2 = scan.nextInt();

        System.out.println("Enter your third number: ");
            int num3 = scan.nextInt();

            int max = (num1>=num2 && num1>=num3)? num1 : (num2>=num1 && num2>=num3)? num2 : num3;
        System.out.println("The maximum number is "+max);

            int min = (num1<=num2 && num1<=num3)? num1 : (num2<=num1 && num2<=num3)? num2 : num3;
        System.out.println("The minimum number is "+min);

    }
}
