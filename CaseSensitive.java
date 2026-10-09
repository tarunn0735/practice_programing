import java.util.Scanner;

public class CaseSensitive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        if (Character.isUpperCase(character)) {
            System.out.println(character + " is an uppercase alphabet.");
        } else if (Character.isLowerCase(character)) {
            System.out.println(character + " is a lowercase alphabet.");
        } else {
            System.out.println(character + " is not an alphabet.");
        }
    }
}

