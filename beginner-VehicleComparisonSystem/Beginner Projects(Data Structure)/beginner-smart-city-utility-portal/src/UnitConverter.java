public class UnitConverter {

    public static String toBinary(int decimal) {
        //  Convert decimal to binary string

        if (decimal == 0) {
            return "0";
        }

        String binary = "";

        while (decimal > 0) {
            int remainder = decimal % 2;

            binary = remainder + binary; // adding infront of the binary value
            decimal = decimal / 2;
        }

        return binary;
    }

    public static String toHex(int decimal) {
        // Convert decimal to hexadecimal string
        if (decimal == 0) {
            return "0";
        }

        String hexDigits = "0123456789ABCDEF";
        String hex = "";

        while (decimal > 0) {
            int remainder = decimal % 16;

            hex = hexDigits.charAt(remainder) + hex;
            decimal = decimal / 16;
        }

        return hex;
    }

    public static int binaryToDecimal(String binary) {
        // Convert binary string to decimal
        int decimal = 0;
        int power = 0;

        // Start from the rightmost digit
        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);

            if (bit == '1') {
                decimal += Math.pow(2, power);
            }

            power++;
        }

        return decimal;
    }
/*
    public static void main(String[] args) {

        System.out.println(toBinary(17));
        System.out.println(toBinary(786));

        System.out.println(toHex(26));
        System.out.println(toHex(255));

        System.out.println(binaryToDecimal("1010"));
        System.out.println(binaryToDecimal("1111"));
    }
*/
}
