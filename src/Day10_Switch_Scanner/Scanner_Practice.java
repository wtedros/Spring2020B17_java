package Day10_Switch_Scanner;

import java.util.Scanner;

public class Scanner_Practice {
// Write a program that asks to enter num1 and num2 and then provides the sum of the two
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number: ");
                    byte num1 = input.nextByte();
        System.out.println("Enter your second number: ");
                    byte num2 = input.nextByte();

        System.out.println("The sum of those two numbers are: "+(num1+num2));
        //or
            int total = (num1+num2);
        System.out.println("The sum of "+num1+" and "+num2+" is "+total);
    }
}
