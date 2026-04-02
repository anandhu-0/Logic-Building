public class DecimalToBinary {

    static String decimaltobinary(int decimal) {
        String binary = "";

        if (decimal == 0) {
            return "0";
        }

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary;
            decimal /= 2;
        }

        return binary;
    }

}
