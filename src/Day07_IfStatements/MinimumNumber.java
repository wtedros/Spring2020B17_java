package Day07_IfStatements;

//write a java program that accepts three numbers and return the minimum number
//				(assume that none of them are equal)

public class MinimumNumber {

    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 400.5;

        if (a<b && a<c){
            System.out.println(a+ " is the smallest number");
        }

        if (b<a && b<c){
            System.out.println(b+ " is the smallest number");
        }

        if (c<a && c<b){
            System.out.println(c+ " is the smallest number");
        }
    }
}
