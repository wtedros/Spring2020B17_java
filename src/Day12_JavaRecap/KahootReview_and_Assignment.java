package Day12_JavaRecap;

import java.util.Scanner;

public class KahootReview_and_Assignment {

    public static void main(String[] args) {
        boolean result = true;
        int N = 100;

        if(result){
            N /= 10;   // N = 10
            result = !result;  // result = false

        } if(result){
            N *= 2;
        }else{
            N -= 5;  // N = 5
        }

        System.out.println(N);


        System.out.println( true ==  false !=true );
        //  true == true  ==> true


        System.out.println("=======================================================");
        /*
     Assignment:
        write a program that asks to enter 5 numbers and prints the numbers in ascending order
                Ex:
                    5, 4, 1, 2, 3
                 output:
                    1, 2, 3, 4, 5
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        byte num1 = input.nextByte();
        byte num2 = input.nextByte();
        byte num3 = input.nextByte();

        int greatestNum = (num1>num2 && num1>num3)? num1 : (num2>num1 && num2>num3)? num2 : num3;
        int smallestNum = (num1<num2 && num1<num3)? num1 : (num2<num1 && num2<num3)? num2 : num3;
        int middleNum = (num1<num2 && num1>num3 || num1>num2 && num1<num3)? num1
                : (num2<num1 && num2>num3 || num2>num1 && num2<num3)? num2 : num3;

        System.out.println(smallestNum + "\n" + middleNum + "\n" + greatestNum);



    }
}
