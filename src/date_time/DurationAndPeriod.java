package date_time;

import java.time.LocalDate;
import java.time.Period;

public class DurationAndPeriod {
    public static void main(String[] args) {


        LocalDate dateOfBirth = LocalDate.parse("2003-08-05");
        LocalDate currentDate = LocalDate.now();

        Period timeSinceBirth = Period.between(dateOfBirth, currentDate);

        System.out.println("You have been alive for " + timeSinceBirth.getYears() + " years, "
                + timeSinceBirth.getMonths() + " months, and " + timeSinceBirth.getDays() + " days.");
    }
}

