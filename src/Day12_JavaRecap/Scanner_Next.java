package Day12_JavaRecap;

import java.util.Scanner;

public class Scanner_Next {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            //String str = scan.next();

        //System.out.println(str); // next() will print only the first word of your entry

        System.out.println("Enter the number of the building: ");
        // 7921 JonesBranch Dr, McLean VA 22034
            short Bnumber = scan.nextShort();
            String fullAddress = "";
            //fullAddress += Bnumber+" ";

        System.out.println("Enter the street name: ");
            String streetName = scan.next();
            //fullAddress += streetName+" ";

        System.out.println("Enter the type of the road: ");
            String roadType = scan.next();
            //fullAddress += roadType+", ";

        System.out.println("What is your city name, state, zip code");
            String cityName = scan.next();
            //fullAddress += cityName+" ";

            String state = scan.next();
            //fullAddress += state+", ";

            int zipCode = scan.nextInt();
            fullAddress += Bnumber+" "+streetName+" "+roadType+", "+cityName+" "+state+", "+zipCode;

        System.out.println(fullAddress);



    }
}
