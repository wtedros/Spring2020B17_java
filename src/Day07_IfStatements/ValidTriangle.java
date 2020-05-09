package Day07_IfStatements;

public class ValidTriangle {

    public static void main(String[] args) {

        short angle1 = 30;
        short angle2 = 50;
        short angle3 = 60;

        short SumOfAngles = (short) (angle1 + angle2 + angle3);

        boolean validTriangle = SumOfAngles == 180;

        if (validTriangle){
            System.out.println("The shape is a triangle");
        }

        if (!validTriangle) {
            System.out.println("The shape is not a valid triangle");
        }
    }
}
