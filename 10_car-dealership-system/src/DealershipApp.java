public class DealershipApp {


    static String newDealership (){
        return "Autohaus Royal GmbH";
    }

    public static void main(String[] args) {

        System.out.println(Car.initDealerName());
        System.out.println();

        // 🔧✅ Task 2: Create car objects
        // Create at least 3 Car objects with different data
//         Car car1 = new Car("Toyota", "Corolla", 2020, 15000);
//         Car car2 = new Car("BMW", "3 Series", 2019, 22500);
//         Car car3 = new Car("Ford", "Focus", 2021, 17000);

        Car car1 = Car.createCar("Toyota", "Corolla", 2020, 15000);
        Car car2 = Car.createCar("BMW", "3 Series", 2019, 22500);
        Car car3 = Car.createCar("Ford", "Focus", 2021, 17000);



        Car[] cars = {car1, car2, car3};

        int currentYear = 2025;

        // 🔧✅ Task 2: Display car info
        //  Call displayInfo() on each car
        for (Car car : cars) {
            System.out.println(car.displayInfo());
        }
        System.out.println();

        // 🔧✅  Task 3: Static variable behavior
        // Print dealer name, change it, and show that all cars reflect the change
        System.out.println("Dealer Name: " + Car.dealerName);

        Car.setDealerName(newDealership());
        System.out.println("After Change Dealer Name: " + Car.dealerName);
        System.out.println();

        for (Car car : cars) {
            System.out.println(car.displayInfo());
        }

        // 🔧✅ Task 4: Total cars created
        //  Print total number of cars created using static method
        System.out.println("Total Numbers of Cars: " + Car.getTotalCarsCreated() );

        // 🔧✅ Task 6: Update price
          // Call setPrice()  (in MY case setNewPrice) and print updated car info
        car1.setNewPrice(17000);
        car2.setNewPrice(20000);


        System.out.println(car1.displayInfo());
        System.out.println(car2.displayInfo());

        // 🔧✅ Task 7: Apply discount
        // Apply discount to one or more cars
        System.out.println("============ On Sale =========== ");
        car1.applyDiscount(10);
        //car2.applyDiscount(5);
        car3.applyDiscount(20);

        System.out.println("______________****________________ ");
        System.out.println();
        System.out.println(car1.displayInfo());
        //System.out.println(car2.displayInfo());
        System.out.println(car3.displayInfo());

        // 🔧✅ Task 8: Depreciate price
        //  Call depreciate(currentYear) and print results
//        for (Car car : cars) {
//            car.depreciate(currentYear);
//            System.out.println(car.displayInfo());
//        }
        car1.depreciate(currentYear);
        car2.depreciate(currentYear);

        // 🔧✅ Task 9: DealerStats static methods
        // Call DealerStats.printWelcomeMessage() and other utility methods
        DealerStats.printWelcomeMessage();
        DealerStats.printSummary();
    }

// =================   ===============   =========
    //     Car car4 = new Car("Volkswagen", "Golf", 2018, 14200);
//         Car car5 = new Car("Toyota", "Yaris", 2020, 15000);
//         Car car6 = new Car("BMW", "X1", 2019, 22500);
//         Car car7 = new Car("Ford", "Focus", 2022, 17000);
//         Car car8 = new Car("Volkswagen", "Golf", 2020, 14200);
//         Car car9 = new Car("Toyota", "Corolla", 2021, 15000);
//         Car car10 = new Car("Ford", "Fiesta", 2018, 15000);

    //Car[] cars = {car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};





}
