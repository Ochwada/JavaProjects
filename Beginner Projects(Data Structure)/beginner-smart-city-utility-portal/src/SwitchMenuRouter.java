public class SwitchMenuRouter {

    public static String route(int choice) {
        //  Use switch to route to appropriate menu options

        String result = "";

        switch (choice) {
            case 1:
                result = "Show Profile";
            case 2:
                result = "Pay Bill";
            case 3:
                result = "Update Info";
            case 4:
                result = "Exit";
        }
        return result;
    }

}
