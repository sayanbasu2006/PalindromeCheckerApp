import java.util.Scanner;

/**
 * =========================================================
 * MAIN CLASS - UseCase10PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 *
 * Goal:
 * Ignore spaces and case while checking palindrome.
 *
 * Concepts Used:
 * - String preprocessing
 * - Regular expressions
 *
 * @author Developer
 * @version 10.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Text: ");
        String text = scanner.nextLine();

        // Step 1: Normalize String
        text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Two Pointer Check
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

        // Step 3: Print Result
        if (isPalindrome) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is NOT Palindrome");
        }

        scanner.close();
    }
}