package Day18_NestedLoop;

import java.util.Scanner;

public class SelamReservation {

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
        Scanner scan = new Scanner(System.in);
        int KingBed = 120;
        int QueenBed = 100;
        int singleBed = 80;
        int price =1;
        int totalnight=1;

        while (true) {
            System.out.println("Welcome to the hotel");
            System.out.println("which bedroom do you wanna reserve");
            System.out.println("king Bed is : " + KingBed + "$");
            System.out.println("Queen Bed is :" + QueenBed + "$");
            System.out.println("single Bed is :" + singleBed + "$");
            String bed = scan.nextLine();

            if (bed.equalsIgnoreCase("King Bed")) {
                price = KingBed * totalnight;
            } else if ( bed.equalsIgnoreCase("Queen bed")){
                price = QueenBed * totalnight;
            } else if (bed.equalsIgnoreCase("single bed")){
                price = singleBed * totalnight;
            } else {
                System.out.println("Please re-enter");
                String result = scan.nextLine();
            }

            System.out.println("Do you want to reserve another room:");
            String result = scan.nextLine();

            boolean valid = result.equalsIgnoreCase("yes")|| result.equalsIgnoreCase("No");

            while(!valid) {
                System.out.println("Please Re-Enter");
            }
            if (result.equalsIgnoreCase("No")){
                System.out.println("Your total price is: "+ price );
                break;
            }
        }
    }
}
