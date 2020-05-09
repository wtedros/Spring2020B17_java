package Day03_VariablesContinue;

public class char_boolean {

    public static void main(String[] args) {

        System.out.println('z' == 100); // false according to the ASCII table
        System.out.println('z' == 122); // true

        System.out.println('a' == 'A'); // false because it is a case sensitive language

        System.out.println('a' > 'b'); // false because 97 is not greater 98

        System.out.println('a' != 98-1); // false because 97 equals to 97

        // System.out.println ('a' == "a"); Incorrect

        boolean r1 = 'a' > 50; // true

        boolean r2 = 'b' == 'a'+1; // true because 98 == 97+1
        System.out.println(r2);






    }
}
