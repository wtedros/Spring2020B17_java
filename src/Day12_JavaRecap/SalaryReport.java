package Day12_JavaRecap;

import java.util.Scanner;

public class SalaryReport {
    /*
    ask user to enter salary
    ask user to enter full name
    ask user to enter company name
    ask user to enter SSN
    ask user to enter JobTitle
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();

        input.nextLine();

        System.out.println("Enter your Full Name: " );
        String fullName = input.nextLine();

        System.out.println("Enter your company's name: ");
        String companyName = input.nextLine();

        System.out.println("Enter SSN: ");
        long SSN = input.nextLong();

        input.nextLine();

        System.out.println("Enter your job title: " );
        String jobTitle = input.nextLine();

        System.out.println("Full name is: "+fullName);
        System.out.println("Job title is: "+jobTitle);
        System.out.println("Company Name: "+companyName);
        System.out.println("SSN: "+SSN);
        System.out.println("Salary is: $"+salary);

    }
}
