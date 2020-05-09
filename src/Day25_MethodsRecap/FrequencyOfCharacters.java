package Day25_MethodsRecap;

import Resources.Library1;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "AABBCC";  // A2B2C2


        String NonDup = Library1.RemoveDuplicates(str);      //ABC
        String result = "";

        for (int i = 0; i < NonDup.length(); i++) {
            String ch = "" + NonDup.charAt(i);//  "A"
            int num = Library1.Frequency(str, ch);
            result += ch + num;
        }

        System.out.println(result);

    }

    public static String FrequencyOfChars(String str) {
        String NonDup = Library1.RemoveDuplicates(str);      //ABC
        String result = ""; //coantisn the frequency of chars

        for (int i = 0; i < NonDup.length(); i++) {
            String ch = "" + NonDup.charAt(i);//  "A"
            int num = Library1.Frequency(str, ch);
            result += ch + num;
        }

        return result;
    }

}
