package Day11_Scanner;

import java.util.Scanner;

public class NextLine_Practice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt(); // 30+Enter

        System.out.println("Your age is "+age);

        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Your full name is "+fullName);


    }
}
