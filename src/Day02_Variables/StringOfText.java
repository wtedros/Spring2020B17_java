package Day02_Variables;

public class StringOfText {

    public static void main(String[] args) {

        String employeeName = "Winta";
        String companyName = "Cybertek";
        System.out.println("Winta");

        System.out.println(employeeName); // Winta

        /*
        Employee Name is : Winta
        Company Name is: Bank of America
        Winta works at Bank of America
         */

        System.out.println("Employee Name is: "+employeeName );
        System.out.println("Company Name is:"+companyName);
        System.out.println(employeeName+" works at "+companyName);

        System.out.println("Employee Name is: "+employeeName+"\nCompany Name is: "+companyName+"\n"+ employeeName+" works at "+companyName);
    }
}
