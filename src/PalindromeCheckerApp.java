import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

/**
 * =========================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Goal:
 * Use Deque to compare front and rear elements.
 *
 * Data Structure Used:
 * - Deque (Double Ended Queue)
 *
 * @author Developer
 * @version 7.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Text: ");
        String text = scanner.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        // Step 1: Insert characters into Deque
        for (int i = 0; i < text.length(); i++) {
            deque.addLast(text.charAt(i));
        }

        boolean isPalindrome = true;

        // Step 2: Compare front and rear
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
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