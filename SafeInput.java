import java.util.Scanner;

public class SafeInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getRangedInt(String prompt, int min, int max) {
        int input;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter an integer.");
                System.out.print(prompt);
                scanner.next();
            }
            input = scanner.nextInt();
            if (input < min || input > max) {
                System.out.println("Input out of range! Please enter a value between " + min + " and " + max + ".");
            }
        } while (input < min || input > max);
        return input;
    }

    public static double getDouble(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a number.");
            System.out.print(prompt);
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
