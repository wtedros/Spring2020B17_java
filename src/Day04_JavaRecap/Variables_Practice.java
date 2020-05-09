package Day04_JavaRecap;

public class Variables_Practice {

    public static void main(String[] args) {
        // byte num2 = 129; error because it is out of range

        // double > float > long > int > short > byte

        // byte num1 = 100;
        //short s1 = num1;

        /*
        int 1num = 100; error because
        variable name should start only with letters
        can have a number at the end
        must be unique
        the only characters should be $ or _
        no spaces in between
        */

        /*
        whole numbers, compiler prefers int
        decimal numbers, compiler prefers double
         */

        float f1 = 100;
        System.out.println(f1);

        char a1 = 'a';
        // byte char =
        System.out.println(a1);

        int a2 = 'a';
        System.out.println(a1);

        System.out.println(10 > 5+5); //false

        System.out.println(!true); //false

        boolean r1 = true != !false; //false

        boolean r2 = !(9>10); //true because 10 > 9
        boolean r3 = !(10>9); //false because 9 is not > 10
        boolean r4 = !(9>10) != !(10>9); // true because true does not equal false

    }
}
