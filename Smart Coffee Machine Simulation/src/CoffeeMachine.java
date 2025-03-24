
/****************************************************
 * CoffeeMachine.java 
 * Author: Ochwada
 * Date: Friday, 21.Mar.2025, 14:17
 * Description: Simulate a Smart Coffee Machine using Java.
 ***************************************************/

public class CoffeeMachine {


    // --------------------------- Basic Machine Behavior (Methods) ---------------------------
    // ---------- void greetUser(String name) → Greets the user by name.
    public void greetUser(String name){
        //this.name = name;
        System.out.println("Welcome " + name + "!" );
    }

    // ---------- void displayMenu() → Prints available coffee options: Espresso, Americano, Latte.
    public static void displayMenu(){
        String[] coffeeOptions = {"Espresso", "Americano", "Latte"};

        for (int i = 0; i < coffeeOptions.length; i++) {
            System.out.println((i + 1) + ". " + coffeeOptions[i]);
        }
    }
    /*public static void displayMenu(){
        String[] coffeeOptions = {"Espresso", "Americano", "Latte"};
        for (String coffee : coffeeOptions) {
            System.out.println(coffee);
        }
    }*/

    // ---------- int calculateBrewTime(String coffeeType) → Returns estimated brew time based on coffee type.
    public int calculateBrewTime(String coffeeType) {
        switch (coffeeType) {
            case "Espresso":
                return 1;
            case "Americano":
                return 2;
            case "Latte":
                return 3;
            default:
                return 0;
        }
    }
    // --------------------------- ---------------------------  ---------------------------
    // --------------------------- Brewing Coffee (Overloaded Methods) -----------------------
    // void brewCoffee(String type) → Brews coffee with default size and no milk.
    public void brewCoffee( String type ){
        System.out.println( "Brewing " + type + " (Default)... ");
    }

    // Overloaded method to brew coffee with specific size
    public void brewCoffee(String type, int sizeInMl) {
        System.out.println("Brewing " + type + " ("+ sizeInMl + "ml)... ");
    }
    // void brewCoffee(String type, int sizeInMl, boolean withMilk) → Brews a fully customized coffee.
    public void brewCoffee(String type, int sizeInMl, boolean withMilk) {

       /* if(withMilk){
            System.out.println("with milk");
        }else{
            System.out.println("without milk");
        }*/

        String withMilkVar = withMilk ? "with milk": "without milk";

        System.out.println("Brewing "+ type + " ("+ sizeInMl + "ml " + withMilkVar+ ")...");
    }

    // --------------------------- ---------------------------  ---------------------------
    // --------------------------- Value vs Reference Demonstration -----------------------
    // void updateOrderId(int id) → Tries to change a primitive value (showing no effect outside).

    public void updateOrderId(int id) {
        System.out.println("Original Order ID: " + id);

        if(id == 100){
            id = 200;
        }else if(id == 101){
            id = 201;
        }else if(id == 102){
            id = 202;
        } else {
            id = 300;
        }

        System.out.println("After updateOrderId: " + id);
    }

    // Add a method in CoffeeMachine to update Order
    public void updateOrderStatus(Order order) {
        System.out.println("Order status before: " + order.status );
        order.status = "Ready";
        System.out.println("Order status after: " + order.status );
    }


    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();


       coffeeMachine.greetUser("Linda");


        System.out.println("--- Menu ---");
        displayMenu();
        System.out.println();


        coffeeMachine.brewCoffee("Americano"); // Default
        coffeeMachine.brewCoffee("Latte", 250); // 2 input
        coffeeMachine.brewCoffee("Espresso", 150, true); // 3 input
        System.out.println();

        int time ;
        time = coffeeMachine.calculateBrewTime("Latte");
        System.out.println("Estimated brew time: " + time + " minutes");
        System.out.println();


        System.out.println("UPDATE ORDER ID");
        coffeeMachine.updateOrderId(102);

        Order order0 = new Order(100 , "Espresso", 250, true, "null" );
        System.out.println();
        // Pass the Order object (reference type)
        coffeeMachine.updateOrderStatus(order0);
    }
}
