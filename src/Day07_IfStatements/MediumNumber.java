package Day07_IfStatements;

//write a java program that accepts three numbers and rteurn the mediam number
//                (assume that none of them are equal)

public class MediumNumber {

    public static void main(String[] args) {
        double a = 100;
        double b = 2000;
        double c = 300;

        boolean aMediumNumber = (a<b && a>c) || (a>b && a<c);
        boolean bMediumNumber = (b>a && b<c) || (b<a && b>c);
        boolean cMediumNumber = (c>a && c<b) || (c<a && c>b);

        if (aMediumNumber) {
            System.out.println(a+ " is the medium number");
        }

        if (bMediumNumber) {
            System.out.println(b+ " is the medium number");
        }

        if (cMediumNumber) {
            System.out.println(c+ " is the medium number");
        }
    }
}
