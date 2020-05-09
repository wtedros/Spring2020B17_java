package Day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {

    public static void main(String[] args) {

        //days_month_year

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");

        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf) );

        /*
        create a date called birthDay: month/Days/year
                eX: 2020 04  23
                    Aprl/23/20
         */

        DateTimeFormatter bday = DateTimeFormatter.ofPattern("MMMM/dd/yy");

        LocalDate date2 = LocalDate.now();
        System.out.println(date2.format(bday) );



    }

}