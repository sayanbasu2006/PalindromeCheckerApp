import java.util.Scanner;
/**
 * =========================================================
 * MAIN CLASS - UseCase3PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
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
 * @version 3.0
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
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Input Text: ");
            String text = scanner.nextLine();

            int left = 0;
            int right = text.length() - 1;
            boolean isPalindrome = true;

            while (left < right) {

                if (text.charAt(left) != text.charAt(right)) {
                    isPalindrome = false;
                    break;
                }

                left++;
                right--;
            }

            if (isPalindrome) {
                System.out.println("String is Palindrome");
            } else {
                System.out.println("String is NOT Palindrome");
            }

            scanner.close();
    }
}