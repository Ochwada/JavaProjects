public class BonusDigitalClock {

    public static String to12HourFormat(int hour, int minute) {
        String period;

        if (hour == 0) {
            hour = 12;
            period = "AM";
        } else if (hour == 12) {
            period = "PM";
        } else if (hour > 12) {
            hour -= 12;
            period = "PM";
        } else {
            period = "AM";
        }

        return String.format("%d:%02d %s", hour, minute, period);
    }

    public static void main(String[] args) {
        System.out.println(to12HourFormat(14, 30));
        System.out.println(to12HourFormat(9, 15));
        System.out.println(to12HourFormat(0, 0));
        System.out.println(to12HourFormat(12, 0));
    }
}
