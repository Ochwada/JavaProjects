/****************************************************
 * RideShareTest.java 
 * Author: Ochwada, Ovelek, Hamilton
 * Date: Monday, 14.Apr.2025, 17:07 hrs
 * Description: 
 * Objective:
 ***************************************************/

public class RideShareTest {
    public static void main(String[] args) {

        Driver driver1 = Driver.register("Alice", "Sedan");
        Driver driver2 = Driver.register("Bob", "Sedan");

        System.out.println(driver1.getDriverId());
        System.out.println(driver2.getDriverId());

        System.out.println(driver1);

        Rider rider1 = Rider.create("Bob", "Downtown");

        Trip trip = Trip.bookTrip(rider1, driver1, 12.5);
        System.out.println("Total Drivers: " + Driver.getDriverCount());

        System.out.println("Total Drivers: " + Driver.getDriverCount());
        System.out.println("Total Riders: " + Rider.getRiderCount());

        System.out.println(trip);

    }
}

