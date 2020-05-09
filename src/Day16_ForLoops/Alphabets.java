package Day16_ForLoops;

public class Alphabets {

    public static void main(String[] args) {
        String upperCase = ""; //A~Z
        String lowerCase = ""; // a~z

        for(char ch = 'A'; ch <= 'Z'; ch++){
            upperCase += ch;
        }

        System.out.println(upperCase);

        for(char ch = 'a'; ch <= 'z'; ch++){
            lowerCase += ch;
        }

        System.out.println(lowerCase);

        // Aa Bb Cc Dd ....
        String result = "";

        for(int i=0; i <= upperCase.length()-1; i++ ){

            result +=   upperCase.charAt(i)+"" + lowerCase.charAt(i)+" " ;

        }

        System.out.println(result);

        System.out.println('a' + ""+ 'b');

        //second solution
        int a = 97;
        int A = 65;

        String result2 ="";
        for(int i =0 ; i < 26; i++ ){
            char ch = (char)(A +i);  // upper case characters
            //          65
            char ch2 = (char)(a +i);
            //                97+0

            result2 += ch + "" +ch2+" ";
        }

        System.out.println(result2);

        // OR

        for(int i =97 ; i <= 122; i++ ){ // lowercase Alphabet
            char ch1= (char)+i;
            System.out.print(ch1+" ");
        }
        System.out.println();
        // A = 65  ==> Z= 90
        for(int i =65 ; i <= 90; i++ ) {// uppercase
            char ch2 = (char) +i;
            System.out.print(ch2+" ");
        }







    }
}
