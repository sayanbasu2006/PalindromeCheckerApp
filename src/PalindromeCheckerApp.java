import java.util.*;

/**
 * =========================================================
 * MAIN CLASS - UseCase12PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Concepts Used:
 * - Interface
 * - Polymorphism
 * - Strategy Pattern
 *
 * @author Developer
 * @version 12.0
 */

public class PalindromeCheckerApp {

    // ==========================================
    // 1️⃣ Strategy Interface
    // ==========================================
    interface PalindromeStrategy {
        boolean check(String text);
    }

    // ==========================================
    // 2️⃣ Stack Strategy Implementation
    // ==========================================
    static class StackStrategy implements PalindromeStrategy {

        public boolean check(String text) {

            text = normalize(text);

            Stack<Character> stack = new Stack<>();

            for (char ch : text.toCharArray()) {
                stack.push(ch);
            }

            for (char ch : text.toCharArray()) {
                if (ch != stack.pop()) {
                    return false;
                }
            }

            return true;
        }
    }

    // ==========================================
    // 3️⃣ Deque Strategy Implementation
    // ==========================================
    static class DequeStrategy implements PalindromeStrategy {

        public boolean check(String text) {

            text = normalize(text);

            Deque<Character> deque = new ArrayDeque<>();

            for (char ch : text.toCharArray()) {
                deque.addLast(ch);
            }

            while (deque.size() > 1) {
                if (!deque.removeFirst().equals(deque.removeLast())) {
                    return false;
                }
            }

            return true;
        }
    }

    // ==========================================
    // Utility: Normalize Input
    // ==========================================
    private static String normalize(String text) {
        return text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    // ==========================================
    // 4️⃣ Context Class
    // ==========================================
    static class PalindromeContext {

        private PalindromeStrategy strategy;

        public PalindromeContext(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean execute(String text) {
            return strategy.check(text);
        }
    }

    // ==========================================
    // Main Method
    // ==========================================
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Based");
        System.out.println("2. Deque Based");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Input Text: ");
        String input = scanner.nextLine();

        PalindromeStrategy strategy;

        // Runtime Strategy Injection
        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        PalindromeContext context = new PalindromeContext(strategy);

        boolean result = context.execute(input);

        if (result) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is NOT Palindrome");
        }

        scanner.close();
    }
}