package Day13_StringClass;
/*
    input: cyBerTek sChooL
    output:
        Cybertek
        School
 */

import java.util.Scanner;

public class StringManipulations_Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();  // cybertek school

        String lastName = fullName.substring(fullName.indexOf(" ")+1    ); // School
        //cYbeRTEK

        fullName = fullName.substring(0,1).toUpperCase() +  fullName.substring(1).toLowerCase();

        String firstName = fullName.substring(0,  fullName.indexOf(" ") );
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println("Your first name is "+firstName);
        System.out.println("Your last name is "+lastName);



        /*
        Assignment:
            write me a program that asks the user first and last names, then prints the initials.
            ex:
                input:
                    cybertek
                    school
                output:
                    CS
         */


    }



}
