package Day13_StringClass;

public class StringManipulation {

    public static void main(String[] args) {

        String str = "Cybertek";
        //            01234567

        char ch1 =  str.charAt(5); // 't'
        System.out.println( ch1 == 'A' );
        //              't' == 'A'   false

        System.out.println( ch1 == 'T');
        //                  't == 'T'  false

        int totalLength =  str.length();
        System.out.println(totalLength);

        System.out.println(totalLength > 250);  // false

        String str2 ="Today is great day, Java is Fun";
        //012345 ....
        int maxIndexNum = str2.length() - 1;
        System.out.println(maxIndexNum);


        String s1 = "Cybertek";
        s1.concat(" School"); // "Cybertek School"

        System.out.println(s1);  // s1 = Cybertek School

        String s2 = "Java";
        System.out.println( s2.concat(" is a programming language")  );      // "Java is a programming langauge"
        System.out.println(s2);

        s2 = s2.concat(" is a programming language");
        System.out.println(s2);

        String r1 = "Java is fun";
            r1 = r1.concat (", and it's easy");
        System.out.println(r1); //Java is fun, and it's easy

        String name1 = "CYBERTEK";
            name1 = name1.toLowerCase(); //converts to lower case
        System.out.println(name1); //cybertek

        String name2 = "cybertek";
            name2 = name2.toUpperCase(); //it capitalizes
        System.out.println(name2);

        String name3 = "     Today is a great      day";
            name3 = name3.trim(); //erases unused blank space
        System.out.println(name3);





    }

}
