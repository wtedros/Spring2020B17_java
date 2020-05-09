package Day07_IfStatements;

// Write a java program that accepts 3 numbers and return the maximum number
// (assume that none of them are equal)

public class MaxNumber {

    public static void main(String[] args) {
        double a = 100.5;
        double b = 200.5;
        double c = 300.5;

        boolean aGreater = a>b && a>c; //if a is greater is greater than b and c, then a is maximum number
        boolean bGreater = b>a && b>c;
        boolean cGreater = c>a && c>b;

        if (aGreater){
            System.out.println(a + " is the maximum number");
        }

        if (bGreater){
            System.out.println(b +" is the maximum number");
        }

        if (cGreater){
            System.out.println(c +" is the maximum number");
        }


    }


}
