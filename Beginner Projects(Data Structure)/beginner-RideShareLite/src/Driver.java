/****************************************************
 * Driver.java 
 * Author: Ochwada, Ovelek, Hamilton
 * Date: Monday, 14.Apr.2025, 17:06 hrs
 * Description:  RideShareLite
 * Objective: Java Group Assignment: Ride Sharing System
 ***************************************************/

public class Driver {

    /// ------------ Fields: They are private ------------
    private String name;
    private String driverId;
    private String vehicleType;
    private double rating;

    ///  ------------ Non-Static Fields -------------------
    private static int driverCount = 100;


    ///  ------------ Overloaded Constructors -------------------
    // No-arg Constructor
    private Driver() {
        this.name = "Unknown";
        this.driverId = generateDriverId();
        this.vehicleType = "Unknown";
        this.rating = 0.0 ;
        driverCount++;
    }

    // Parameterized
    private Driver(String name, String vehicleType) {
        this.name = name;
        this.driverId = generateDriverId();
        this.vehicleType = vehicleType;
        this.rating = rating;
        driverCount++;
    }

    ///  ------------Static Factory Method : register  -------------------
    public static Driver register(String name, String vehicleType) {
        return new Driver(name, vehicleType);
    }


    ///  ------------ Generate New Driver ID --------------
    public static String generateDriverId(){
        return "GER B" + driverCount;
    }

    ///  ------------ Setters & Getters ------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getDriverId() {
        return driverId;
    }

    public double getRating() {
        return rating;
    }

    public static int getDriverCount() {
        return driverCount-100;
    }
}
