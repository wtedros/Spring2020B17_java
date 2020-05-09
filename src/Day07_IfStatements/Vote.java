package Day07_IfStatements;

//write a java program that can identify if a person is eligible to vote for Donald Trump
//based on age and citizenship and preference

public class Vote {

    public static void main(String[] args) {

        int age = 16;
        boolean UScitizen = true;
        boolean LikeTrump = true;

        boolean eligible = age >= 18 && UScitizen == true && LikeTrump ==true;

        if (eligible){
            System.out.println("S/he will vote for Trump");
        }

        if (!eligible){
            System.out.println("S/he will not vote for Trump");
        }
    }
}
