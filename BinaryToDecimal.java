import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = sc.nextLine();
        sc.close();

        int binaryLength = binaryString.length();
        int decimal = 0;

        for (int i = binaryLength - 1, j = 0; i >= 0; i--, j++) {
            char digit = binaryString.charAt(i);
            if (digit == '1') {
                decimal += Math.pow(2, j);
            } else if (digit != '0') {
                System.err.println("Invalid binary digit: " + digit);
                return;
            }
        }

        System.out.println("Decimal equivalent: " + decimal);
    }
}
