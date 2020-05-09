package Day04_JavaRecap;

public class RemainderPractive {

    public static void main(String[] args) {

        int number = 87654;

        boolean oddNumber = number % 2 != 0; //for odd numbers
        boolean evenNumber = number % 2 == 0; //for even number

        boolean divisibleBy3 = number % 3 == 0; //divisible by 3
        boolean divisibleBy5 = number % 5 ==0; //divisible by 5

        System.out.println(number+ " is an odd number "+oddNumber);
        System.out.println(number+ " is an even number "+evenNumber);

        System.out.println(number+ "can be divisible by 3 "+divisibleBy3);
        System.out.println(number+ "can be divisible by 5 "+divisibleBy5);
    }
}
