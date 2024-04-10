package bitmanipulation;

public class BinaryToDecimal {
    public static int convertToDecimal(String x) {
        int len = x.length();
        int p2 = 1, num = 0;
        for (int i = len - 1; i >= 0; i--) {
            char ch = x.charAt(i);
            if (ch == '1') {
                num = num + p2;
            }
            p2 = p2 * 2;
        }
        return num;
    }

    public static void main(String[] args) {
        // Example usage:
        String binaryNumber = "1010";
        int decimalNumber = convertToDecimal(binaryNumber);
        System.out.println("Decimal representation of " + binaryNumber + " is " + decimalNumber);
    }
}
