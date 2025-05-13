public class BillingCalculator {

    public static double calculateBill(int unitsUsed) {
        // Use if-else and arithmetic to calculate electricity bill
        double bill = 0;

        if (unitsUsed <= 100) {
            bill = unitsUsed * 1;

        } else if (unitsUsed <= 200) {
            bill = (100 * 1) + ((unitsUsed - 100) * 2);
        } else {
            bill = (100 * 1) + (100 * 2) + ((unitsUsed - 200) * 3);
        }

        // Logical & relational operator
        if (unitsUsed > 250) {
            double surcharge = bill * 0.05;
            bill += surcharge;
        }

        return bill;
    }
/*
    public static void main(String[] args) {
        System.out.println("Bill for 90 units: ₹" + calculateBill(90));   // ₹90
        System.out.println("Bill for 150 units: ₹" + calculateBill(150)); // ₹200
        System.out.println("Bill for 270 units: ₹" + calculateBill(270)); // ₹515.25
    }
 */
}
