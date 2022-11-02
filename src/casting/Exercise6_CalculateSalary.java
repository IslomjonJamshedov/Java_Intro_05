package casting;

public class Exercise6_CalculateSalary {
    public static void main(String[] args){
        String salary1 = "5000";
        String salary2 = "6000.25";
        String salary3 = "4000.50";

        double d1 = Double.parseDouble(salary1);
        double d2 = Double.parseDouble(salary2);
        double d3 = Double.parseDouble(salary3);
        /*
        TASK 1
        Find min and max salary

        Expected output:
        Min salary = $4000.50
        Max salary = $6000.25
         */

        System.out.println("Min Salary = " + Math.min (d3, Math.min(d1,d2)));
        System.out.println("Max Salary = " + Math.max (d3, Math.max(d1,d2)));

        /*
        TASK-2
        Calculate the 10 percent of the min salary

        Expected output:
        400.05
         */

        System.out.println("Min Salary = " + Math.min (d3, Math.min(d1,d2)) / 10);



    }
}
