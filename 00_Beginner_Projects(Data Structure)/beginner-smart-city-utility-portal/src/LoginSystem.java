/****************************************************
 * LoginSystem.java
 * Author: Ochwada
 * Date: Wednesday, 26.Mar.2025, 9:54 hrs
 * Description: Task 1: Resident Login System
 * Objective:  Use if-else, String comparison, and ternary operators.
 ***************************************************/

public class LoginSystem {

    public static String authenticate(String username, String password) {
        String validUsername = "residence";
        String validPassword = "2025";

        if (username.equals(validUsername)) {
            return password.equals(validPassword) ? "Login successful" : "Invalid credentials";
        }
        return "Invalid credentials";
    }
}
