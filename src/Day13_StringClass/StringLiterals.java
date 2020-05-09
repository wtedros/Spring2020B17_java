package Day13_StringClass;

import java.lang.String; //not necessary, all in this class are imported automatically
public class StringLiterals {

    public static void main(String[] args) {
        String str1 = "Cat"; //saved in String Pool
        String str2 = new String ("Cat"); //saved in Java Heap

        System.out.println(str1+" : "+str2);
        System.out.println(str1 == str2); //false bc they are two different objects

        String str3 = "Cat"; // String pool

        System.out.println(str1 == str3 );  // true,

        String str4 = new String("Cat");
        System.out.println(str2 == str4); // two independent object , false


        String s1 = "Java";  // String Pool, immutable we cannot modify it
        s1 = "JavaScript"; // new object will be created in memory

        System.out.println(s1); // Java Script

        String s2 = "Java"; // no new object will be created in the memory


        System.out.println(s1 == s2 ); // false
        //              "JavaScript" == "Java"

    }
}
