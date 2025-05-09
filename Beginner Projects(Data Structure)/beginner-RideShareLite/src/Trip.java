/****************************************************
 * Trip.java 
 * Author: Ochwada, Ovelek, Hamilton
 * Date: Tuesday, 15.Apr.2025, 08:43 hrs
 * Description: Trip class for RideShareLite
 * Objective: Represents a single trip instance
 ***************************************************/

public class Trip {

    /// ------------ Fields: They are private ------------
    private String tripId;
    private Driver driver;
    private Rider rider; // You can later replace this with a Rider class
    private double distance;
    private double fare;

    /// ------------ Static Trip Counter ------------------
    private static int tripCounter = 100;

    /// ------------ Private Constructor ------------------
    private Trip(Rider rider, Driver driver, double distance) {
        this.tripId = generateTripId();
        this.driver = driver;
        this.rider = rider;
        this.distance = distance;
        this.fare = calculateFare(distance);
    }

    /// ------------ Static Factory Method ----------------
    public static Trip bookTrip(Rider rider, Driver driver, double distance) {
        return new Trip(rider, driver, distance);
    }

    /// ------------ Static Fare Calculator ---------------
    public static double calculateFare(double distance) {
        double baseFare = 4.50;
        double ratePerKm = 1.50;
        return baseFare + (ratePerKm * distance);
    }

    /// ------------ Generate Unique Trip ID --------------
    private static String generateTripId() {
        return "TRIP" + (tripCounter++);
    }

    /// ------------ Getters ------------------------------
    public String getTripId() {
        return tripId;
    }

    public Driver getDriver() {
        return driver;
    }

    public Rider getRider() {
        return rider;
    }

    public double getDistance() {
        return distance;
    }

    public double getFare() {
        return fare;
    }

    /// ------------ toString -----------------------------
    @Override
    public String toString() {
        return "Trip ID: " + tripId +
                ", Driver: " + driver.getName() +
                ", Rider: " + rider +
                ", Distance: " + distance + " km" +
                ", Fare: €" + String.format("%.2f", fare);
    }
}
