import java.util.Scanner;

/**
 * =========================================================
 * MAIN CLASS - UseCase11PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Goal:
 * Encapsulate palindrome logic in a class
 * while keeping everything in the same file.
 *
 * Concepts Used:
 * - Encapsulation
 * - Single Responsibility Principle
 *
 * @author Developer
 * @version 11.0
 */

public class PalindromeCheckerApp {

    // ===============================
    // Inner Service Class
    // ===============================
    static class PalindromeChecker {

        // Public method exposed
        public boolean checkPalindrome(String text) {

            if (text == null) {
                return false;
            }

            // Normalize (ignore spaces, case, special chars)
            text = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            int left = 0;
            int right = text.length() - 1;

            while (left < right) {

                if (text.charAt(left) != text.charAt(right)) {
                    return false;
                }

                left++;
                right--;
            }

            return true;
        }
    }

    // ===============================
    // Main Method (UI Layer)
    // ===============================
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Text: ");
        String input = scanner.nextLine();

        // Create object of inner class
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is NOT Palindrome");
        }

        scanner.close();
    }
}