import java.util.Scanner;

public class charac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        if (Character.isLetter(character)) {
            System.out.println(character + " is an alphabet.");
        } else if (Character.isDigit(character)) {
            System.out.println(character + " is a digit.");
        } else {
            System.out.println(character + " is a special character.");
        }
    }
}
