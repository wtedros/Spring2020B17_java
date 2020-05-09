package Day16_ForLoops;

public class BreakStatement {

    public static void main(String[] args) {

        for(int i=1; i<=5; i++) {

            if (i==3) {
                break;
            }
            System.out.println("Hello World");
        }

        // print a~d
        for(char i='a'; i <='z'; i++) {
            if(i=='e') {
                break;
            }
            System.out.println(i);
        }
    }
}
