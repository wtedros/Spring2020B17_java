package Day03_VariablesContinue;

public class SalaryCalculator {

    public static void main(String[] args) {

        double rate = 40;
        float stateTaxRate = 0.04F;
        float federalTaxRate = 0.22f;
        byte weeklyHours = 40;

        // salary = rate * weeklpyHour * 4 * 12
        double salary = rate * weeklyHours * 52;

        // stateTax = salary * stateTaxRate
        double stateTax = salary * stateTaxRate;

        // federalTax = salary * federalTaxRate
        double federalTax = salary * federalTaxRate;

        // income after tax = salary - (stateTax + federalTax)
        double incomeAfterTax = salary - (stateTax + federalTax);

        System.out.println("Your salary is: "+salary);
        System.out.println("State tax is: "+stateTax);
        System.out.println("Federal tax is: "+federalTax);
        System.out.println("Total tax is: "+ (stateTax+federalTax));

    }
}
