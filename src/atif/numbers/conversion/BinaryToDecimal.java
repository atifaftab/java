package atif.numbers.conversion;

public class BinaryToDecimal {
    public static void main(String[] args) {
        long binaryNumber = 1001;
    }

    public static int convertBinaryToDecimal(long binaryNumber) {
        int decimalNumber = 0, i = 0;
        long remainder;
        while (binaryNumber != 0) {
            remainder = decimalNumber % 10;
            remainder/=remainder;
        }
        return 0;
    }
}
