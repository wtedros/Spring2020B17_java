package Day08_IfStatements;

public class MultiBranchIf {

    public static void main(String[] args) {

        int a = 100;
        boolean zero = a==0;
        boolean negative = a<0;
        boolean positive = a>0;

        if (zero){
            System.out.println("zero");
        } else if (positive) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}
