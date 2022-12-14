package singleton;

public class Driver {

    public static Driver driver;

    private Driver(){}

    public static Driver getDriver() {
        if(driver == null) driver = new Driver();
        return driver;
    }
}
