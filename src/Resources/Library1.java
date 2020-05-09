package Resources;

import java.util.Arrays;

public class Library1 {

    public static int[] sortDesending(int[] arr){
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length] ;

        int j = arr.length-1;
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }

        return RevArr;

    }

    public static String Reverse(String str){  // can reverse a string and returns string
        String Reverse = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }

        return  Reverse;
    }


    // remove duplicates from string

    public static String RemoveDuplicates(String str){
        String result =  "";      //AB

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i); //B
            if( !result.contains(""+ch) ){
                result += ch;
            }

        }

        return result;
    }

    // uniques
    public static String uniques(String str){ // "AABCDCD"
        String result = ""; //ACD
        for(int i=0; i < str.length(); i++){
            int num = Frequency(str, str.charAt(i) );
            if( num == 1){
                result += str.charAt(i);
            }
        }

        return result;
    }


    // Frequency of string

    public static int Frequency(String str1, String str2){
        int count = 0 ;
        while(str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2, "");
            // we need to make that we are not counting the same index over again
        }
        return count;
    }


    public static int Frequency(String str, char ch){ // counts the ch' frequency
        char[] arr =  str.toCharArray(); // [A, B, B]

        int count = 0; //1
        for(char each  : arr ){ //3   each: A , B, B
            if(each == ch){
                count++;
            }
        }

        return count;
    }


    // Frequency of Characters

    public static String FrequencyOfChars(String str){
        String NonDup =  Library1.RemoveDuplicates(str)  ;             //ABC
        String result = ""; //counts the frequency of chars

        for(int i =0; i < NonDup.length();i++){
            String ch = ""+NonDup.charAt(i);//  "A"
            int num =  Library1.Frequency(str, ch);
            result += ch+num;
        }

        return result;
    }

    // merge two array and return third one

    // max number from array

    // min number from array

    // odd even numbers

    // longest shortest word




}