import java.util.Scanner;
/**
 * =========================================================
 * MAIN CLASS - UseCase1PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 1: Application Entry & Welcome Message
 *
 * Description:
 * This class represents the entry point of the
 * Palindrome Checker Management System.
 *
 * At this stage, the application:
 * - Starts execution from the main() method
 * - Displays a welcome message
 * - Shows application version
 *
 * No palindrome logic is implemented yet.
 *
 * The goal is to establish a clear startup flow.
 *
 * @author Developer
 * @version 1.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point.
     *
     * This is the first method executed by the JVM
     * when the program starts.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Text: ");
        String name = scanner.nextLine();
        int j = name.length() - 1;
        boolean isPalindrome = true;
        for (int i = 0; i < name.length() / 2; i++) {

            if (name.charAt(i) != name.charAt(j)) {
                isPalindrome = false;
                break;   // stop checking once mismatch found
            }

            j--;  // move backward
        }
        System.out.println("Is it a Palindrome? : " + isPalindrome);
        scanner.close();
    }
}