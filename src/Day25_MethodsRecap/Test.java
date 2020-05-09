package Day25_MethodsRecap;

import Resources.Library1;

public class Test {

    public static void main(String[] args) {

        String str = "ABCDABABABABA";
        String result = Library1.RemoveDuplicates(str);

        System.out.println(result);

        String str1 = "AABBCDEB";
        String str2 = "B";

        int num1 =  Library1.Frequency(str1,str2);

        System.out.println(num1);


        String str3 = "MMMNNNJJJJJIIIIUUUUUUYYYYYYYY";
        String result3 =     Library1.FrequencyOfChars(str3);
        System.out.println(result3);



    }

}