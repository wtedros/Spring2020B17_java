package Day13_StringClass;

public class StringManipulation2 {

    public static void main(String[] args) {

        String str = "Cybertek School is the best";
                  // 01234567
        String schoolName = str.substring(0,8);
        System.out.println(schoolName);

        String fullName = "Kuzzat Altay";
                    //    01234567..
        String firstName = fullName.substring(0,7);
        String lastName = fullName.substring(7); //another form of substring, you just give the beginning
        System.out.println(firstName); //Kuzzat
        System.out.println(lastName); //Altay

        //gmail: altay_kuzzat@gmail.com
        String gmail = lastName.concat("_").concat(firstName).concat("@gmail.com");
        System.out.println(gmail);

        String s1 = "COVID 18";
            s1 = s1.replace("8", "9");
        System.out.println(s1);

        String s2 = "I like C# Programming C# C#";
            s2 = s2.replaceFirst("C#", "Java"); //replaces only the first C#
        System.out.println(s2);


    }
}
