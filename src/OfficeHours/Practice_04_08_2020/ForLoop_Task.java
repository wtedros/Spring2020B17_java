package OfficeHours.Practice_04_08_2020;

public class ForLoop_Task {

    public static void main(String[] args) {
        /*
        print all the numbers between  0~100 that can be divisible by 3 or 5
         */

        for (int i = 0; i <= 100; i++) {
            if (i%3==0 || i%5==0){
                System.out.print(i+" ");
            }
        }

        System.out.println();

        System.out.println("===========================================");

        String name = "Muhtar";
                    // 012345

        int lastIndex = name.length()-1;

        String reverse = "";

        for (int i = lastIndex; i >= 0; i--) {
            reverse += name.charAt(i);
            // or reverse += name.substring(i, i+1);
                                        //  3, 4 ==> a
                                        //  2, 3 ==> n
                                        //  1, 2 ==> n
                                        //  0, 1 ==> A
        }
        System.out.print(reverse);
        System.out.println();

        /*****************************************/

        if (name.equalsIgnoreCase(reverse)){
            System.out.println(name+" is palindrome name");
        } else {
            System.out.println(name+" is not a palindrome name");

        }
    }
}
