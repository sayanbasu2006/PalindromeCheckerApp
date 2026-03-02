import java.util.Scanner;

/**
 * =========================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Goal:
 * Check palindrome using recursion.
 *
 * Concepts Used:
 * - Recursion
 * - Base condition
 * - Call stack
 *
 * @author Developer
 * @version 9.0
 */

public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Text: ");
        String text = scanner.nextLine();

        boolean result = isPalindrome(text, 0, text.length() - 1);

        if (result) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is NOT Palindrome");
        }

        scanner.close();
    }

    // Recursive Palindrome Method
    public static boolean isPalindrome(String text, int start, int end) {

        // Base Condition (middle reached)
        if (start >= end) {
            return true;
        }

        // If mismatch found
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call for inner substring
        return isPalindrome(text, start + 1, end - 1);
    }
}