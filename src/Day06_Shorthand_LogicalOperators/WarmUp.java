package Day06_Shorthand_LogicalOperators;

public class WarmUp {

    public static void main(String[] args) {
        double numberofGallons = 3;
        double numberofLiters = numberofGallons * 3.785;
        String result = numberofGallons+ "gallons equal to: " +numberofLiters+ " galons";
        System.out.println(result);

        System.out.println("===================================================================");

        double numberOfLiters = 100;
        double litersToGalons =  numberOfLiters / 3.785;
        String result2 = numberOfLiters+" liters equal to "+litersToGalons+" galons";
        System.out.println(result2);

        System.out.println("===================================================================");
        int a = 200; // 199
        int b = -a++ +  - --a *  a-- % 2;
        // b =  -200  +  -200  * 200 % 2
        //  b =  -200 + -40000  %  2
        //  b =  -200 + 0
        // b = -200;

        System.out.println(b);
        System.out.println(a);

        int x = 300;
        int y = 400;
        int z =  x  +   y   -  x * y + x / y;
        //  z = 300 +  400  - 300 * 400 + 300 / 400
        // z = 300 + 400 - 120000 + 300 / 400             300/400 ==> 0.75;
        // z = 300 + 400 - 120000 + 0
        // z = 700 - 120000 = -119300

        System.out.println(z);

    }
}
