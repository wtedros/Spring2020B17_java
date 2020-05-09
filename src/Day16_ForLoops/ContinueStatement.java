package Day16_ForLoops;

public class ContinueStatement {

    public static void main(String[] args) {

        for (int i=0; i<=5; i++) {
            if (i==3) {
                continue;
            }
            System.out.println(i);
        }

        for (int i=0; i<=20; i++) {
            if (i%2==0) { //skips all the even numbers
                continue;
            }
            System.out.println(i+" ");
        }
    }
}
