package Day09_NestedIf_Ternary;

public class NestedIf {

    public static void main(String[] args) {
        boolean USCitizen = true;
        byte age = 30;

        if (USCitizen) {
            if (age>17) {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("Grow up first, and then vote");
            }
        } else {
            System.out.println("Only the US citizens are eligble to vote for Donald Trump");
        }

        System.out.println("===========================================");

        int score = 85;
        String grade = "";

        if(score >= 0 && score<=100) {
            if (score>=90) {
                grade = "A";
            } else if (score >= 80){
                grade = "B";
            } else if (score>= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "fail";
            }
        } else {
            grade = "invalid";
        }

        System.out.println(grade);

        System.out.println("=====================================");

        int score2 = 110;
        String grade2 = "";

        if(score2 >= 0 && score2<=100) {
            grade2 = (score2 >= 90)? "A" : (score2>=80)? "B" : (score2>=70)? "C" : (score2 >= 60)? "D" : "fail";
        } else {
            grade2 = "invalid";
        }

        System.out.println(grade2);
    }
}
