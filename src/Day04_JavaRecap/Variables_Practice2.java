package Day04_JavaRecap;

public class Variables_Practice2 {

    public static void main(String[] args) {

        /*
        task: write a program to find the area and perimeter of the circle
            radious = ?
            Pi = 3.14

            Area = r * r * 3.14
            P = 2 * 3.14 * r
         */

        double radius = 2.5; //MUST
        double PI = 3.14;
        double area = radius * radius * PI;
        double perimeter = 2 * PI * radius;

        // The area of the circle that has a radius of 2.5 is: Area

        System.out.println("The area of the circle that has a radius of "+radius+" is: "+area);

        // The perimeter if the circle that has a radius of 2.5 is: Area
        System.out.println("The area of the circle that has a radius of "+radius+" is: "+perimeter);

        double circle1R = 3;
        double circle2R = 5;
        // to compare two circles size, you compare the circles' radius
        boolean circle1 = circle1R > circle2R;
        boolean circle2 = circle2R > circle1R;

        System.out.println(circle2); // true - that circle 2 is larger

        System.out.println(10 / 4); //2, int only accepts whole numbers
        System.out.println(10f / 4); //2.5
        System.out.println(10.0 / 4); //2.5

        double a1 = 10/4;
        System.out.println(a1); //2

        double a2 = 10L / 4; //a2 = 2L; ==> 2.0
        System.out.println(a2);

        double a3 = 10 / 4f; //2.5
        System.out.println(a3);

        /*
        Even number: evenly divisible by 2 ==> x % 2 ==> remainder of 0
        odd number : not evenly divisible by 2 ==> x % 2 !=0
         */


    }
}
