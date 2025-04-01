public class Car {

    // ================================
    // 🔧✅ Task 1: Instance variables
    // ================================
    // ----- Declare instance variables: brand, model, year, price -----

    private String brand;
    private String model;
    private int year;
    private double price;

    // ================================
    // 🔧✅  Task 3: Static variable (dealer name)
    // ================================
    // Declare static variable dealerName and initialize to "Global Motors"
    static String dealerName ="Global Motors";

    // 🔧✅ Task 4: Static counter
    //  Declare static variable totalCarsCreated
    static int totalCarsCreated = 0;

    // 🔧✅  Task 5: Static block
    // Use static block to initialize dealerName and print a welcome message
    static String initDealerName(){
        String newDealerName = DealershipApp.newDealership();
        return
                "\uD83D\uDE97 Welcome to " + newDealerName + " Car Dealer App \uD83D\uDE99";
    }

    // ================================
    // 🔧✅ Task 1: Constructor
    // ================================
    // Initialize all instance variables and increment totalCarsCreated

    private Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        totalCarsCreated ++;
    }

    public static Car createCar(String brand, String model, int year, double price) {
        return new Car(brand, model, year, price);
    }
    // ================================
    // 🔧✅ Task 6: Instance method to set price
    // ================================
    //  Add a method setPrice(double) with validation
    public void setNewPrice(double newPrice) {
        if (newPrice > 0) {
            this.price = newPrice;
            System.out.println("Price updated to: " + newPrice);
        } else {
            System.out.println("❌ Invalid price. Must be greater than zero.");
        }
    }

    // 🔧✅ Task 7: Apply discount method
    // Add method applyDiscount(double percent) to reduce price
    void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100) {
            double discount = (percent / 100);
            double discountPrice = this.price - (price * discount);

            System.out.println( "----- " +brand + " (" + model + ") -----");
            System.out.println( "Before Discount: " + price);
            System.out.println( "Discount: " + percent + "%");
            System.out.println( "You Saved: € " + (price - discountPrice) );
            setNewPrice(discountPrice);

            System.out.println();
            //System.out.println( "for the " + brand + " (" + model +")");
        } else
            System.out.println("❌ Invalid discount percentage for " + brand + " " + model);

    }

    // 🔧✅ Task 8: Depreciate value
    // Add method depreciate(int currentYear) to reduce price by 10% per year
    void depreciate(int currentYear){
        int age = currentYear - year;
        if (age > 0) {
            double depreciationRate = 0.10;
            double totalDepreciation  = price * (depreciationRate * age);
            double afterDepreciation = price - totalDepreciation;

            System.out.println("_______" + brand + " (" + model + ") _______");

            System.out.println("Original Price: " + price);
            System.out.println("Depreciated by " + age + " years)" );

            setNewPrice(afterDepreciation);
            System.out.printf("\uD83D\uDCB0 New price: €%.2f%n", afterDepreciation);

        } else
            System.out.println("No depreciation applied for " + brand + " " + model + " It`s a New car or Planned car!");

        System.out.println("--- ** ---");
    }

    // 🔧✅ Task 10: Static method to update dealer name
    // Add static method setDealerName(String)
    public static void setDealerName(String newDealerName) {
        System.out.println();
        dealerName = newDealerName;
    }

    // 🔧✅ Task 4: Static method to get total cars
    //  Add static method getTotalCarsCreated()
    public static int getTotalCarsCreated(){
        System.out.println();
        return totalCarsCreated++;
    }

    // ================================
    // 🔧✅ Task 1 + 3: Display Info
    // ================================
    // Add method displayInfo() to print all car details including dealer name
    public String displayInfo() {
        return " ======= Car Information =======\n"
                + " Brand: " + brand + "\n"
                + " Model: " + model + "\n"
                + " Year: " + year + "\n"
                + " Price: " + price + "\n"
                + " Dealer Name: " + dealerName + "\n"
                + "------------------------------------";
    }
    // --------------------------------------------------------------------------

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
