package Day09_NestedIf_Ternary;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class IfStatement_WithoutCurlyBraces {

    public static void main(String[] args) {
        int number = 100;

        if (number%2==0)
            System.out.println("Even Number");
         else
            System.out.println ("Odd Number");

         //if you only have one statement, you can eliminate the curly braces. It is good to know but a bad habit to have.
    }
}
