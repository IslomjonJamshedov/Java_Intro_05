package date_time;
import utilities.ScannerHelper;

import java.time.LocalDate;
public class FormatDates {
    public static void main(String[] args) {


        int age = ScannerHelper.getAnAge();

        int currentYear = LocalDate.now().getYear();

        int yearOfBirth = currentYear - age;

        System.out.println("Your year of birth is: " + yearOfBirth);

    }
}




