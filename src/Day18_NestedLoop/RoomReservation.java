package Day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

    /*
    Assignment:
    write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
                should ask which bedroom do you wanna reserve
                    if user provided invalid entry => please re-enter
                    calculate the total price
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            if answer either yes or no ==> please re-enter
     */
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Which bedroom would you like to reserve?");
            String bedroom = input.nextLine();

            String price = "";

            if (bedroom.equalsIgnoreCase("King Bed")) {
                price += "It will be $120";
            } else if (bedroom.equalsIgnoreCase("Queen Bed")) {
                price += "It will be $100";
            } else if (bedroom.equalsIgnoreCase("Single Bed")) {
                price += "It will be $80";
            }else {
                price += "Invalid entry. Please re-enter.";
                price = input.nextLine();
            }
            System.out.println(price);

            System.out.println("Do you want to reserve another room?");
            String room2 = input.next();

            while (! (room2.equalsIgnoreCase("no") || room2.equalsIgnoreCase("yes"))) {
                System.out.println("Please re-enter a valid response");
                room2 = input.next();
            }

            if (room2.equalsIgnoreCase("no")){
                System.out.println("Your total price is: "+price);
                break;
            }


        }
    }
}
