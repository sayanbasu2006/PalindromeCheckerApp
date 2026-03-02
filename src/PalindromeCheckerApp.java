import java.util.Scanner;
import java.util.Stack;

/**
 * =========================================================
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Goal:
 * Use Stack to reverse characters and validate palindrome.
 *
 * Concepts Used:
 * - Stack (LIFO)
 * - Push operation
 * - Pop operation
 * - Reversal using stack
 *
 * @author Developer
 * @version 5.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Text: ");
        String text = scanner.nextLine();

        Stack<Character> stack = new Stack<>();

        // Step 1: Push characters into stack
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        // Step 2: Pop and compare
        boolean isPalindrome = true;

        for (int i = 0; i < text.length(); i++) {
            char poppedChar = stack.pop();

            if (text.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Step 3: Print result
        if (isPalindrome) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is NOT Palindrome");
        }

        scanner.close();
    }
}