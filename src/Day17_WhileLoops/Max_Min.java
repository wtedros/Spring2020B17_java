package Day17_WhileLoops;
/*
 1. write a program that can ask the user "enter a number" five times and return the maximum number
                hint: you will nedd for loop and if statement
  2. write a program that can ask the user "enter a number" five times and return the minimum number
                hint: you will nedd for loop and if statement
 */

import java.util.Scanner;

public class Max_Min {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int MaxNumber = -2147483647;  // the smallest number int can take; any number the user provided will be greater than this number
        // first user entered variable will be initalized to MaxNumber; then the second greater number will replace it and then the following

        int MinNumber = 2147483647;

        for(int i =1; i <= 5; i++) { // i: 1, 2, 3,4,5
            System.out.println("Enter a number");
            int num = input.nextInt();  // 0, 5, 1, 3, 0

            if(num > MaxNumber){  // to compare each user inputs , and assign the maximum number to MaxNumber
                MaxNumber = num;
            }
            if(num <  MinNumber){
                MinNumber = num;
            }


        }

        System.out.println("Maximum number is "+MaxNumber);
        System.out.println("Minimum number is "+MinNumber);




    }

}

