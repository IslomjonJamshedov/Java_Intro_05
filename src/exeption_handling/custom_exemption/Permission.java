package exeption_handling.custom_exemption;

public class Permission {


    public static boolean isAgeValid(int age){
        if(age > 16) return true;
        throw new IllegalStateException("Age of " + age + " is restricted!!!");
    }

        public String checkIn(int day) throws Exception {
        if (day < 1 || day > 7) {
            throw new Exception("The input does not represent any day!!!");
        }

        if (day >= 1 && day <= 5) {
            return "Check in hours are from 10 AM to 5 PM";
        } else {
            return "Check in hours are from 10 AM to 3 PM";
        }
    }
}
