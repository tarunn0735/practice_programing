import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input principal amount (P)
        System.out.print("Enter the principal amount (P): ");
        double principal = sc.nextDouble();

        // Input time period (T) in years
        System.out.print("Enter the time period (T) in years: ");
        double time = sc.nextDouble();

        // Input rate of interest (R) in percentage
        System.out.print("Enter the rate of interest (R) in percentage: ");
        double rate = sc.nextDouble();

        // Input compounding frequency (n)
        System.out.print("Enter the compounding frequency (n) per year: ");
        double n = sc.nextDouble();

        // Calculate compound interest
        double compoundInterest = principal * Math.pow(1 + (rate / (n * 100)), n * time) - principal;

        // Display the result
        System.out.println("Compound Interest: " + compoundInterest);
    }
}

