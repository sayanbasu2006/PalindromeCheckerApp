import java.util.*;

/**
 * =========================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 13: Performance Comparison
 *
 * Goal:
 * Compare execution time of different palindrome algorithms.
 *
 * Concepts Used:
 * - System.nanoTime()
 * - Algorithm comparison
 *
 * @author Developer
 * @version 13.0
 */

public class UseCase13PalindromeCheckerApp {

    // ==========================================
    // Utility: Normalize
    // ==========================================
    private static String normalize(String text) {
        return text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    // ==========================================
    // 1️⃣ Two Pointer Approach
    // ==========================================
    public static boolean twoPointer(String text) {

        text = normalize(text);
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

    // ==========================================
    // 2️⃣ Stack Approach
    // ==========================================
    public static boolean stackMethod(String text) {

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

    // ==========================================
    // 3️⃣ Deque Approach
    // ==========================================
    public static boolean dequeMethod(String text) {

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

    // ==========================================
    // 4️⃣ Recursive Approach
    // ==========================================
    public static boolean recursiveMethod(String text) {
        text = normalize(text);
        return recursiveHelper(text, 0, text.length() - 1);
    }

    private static boolean recursiveHelper(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return recursiveHelper(text, start + 1, end - 1);
    }

    // ==========================================
    // MAIN METHOD
    // ==========================================
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text for performance comparison: ");
        String input = scanner.nextLine();

        System.out.println("\nRunning performance comparison...\n");

        // Two Pointer
        long start1 = System.nanoTime();
        boolean result1 = twoPointer(input);
        long end1 = System.nanoTime();

        // Stack
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(input);
        long end2 = System.nanoTime();

        // Deque
        long start3 = System.nanoTime();
        boolean result3 = dequeMethod(input);
        long end3 = System.nanoTime();

        // Recursive
        long start4 = System.nanoTime();
        boolean result4 = recursiveMethod(input);
        long end4 = System.nanoTime();

        System.out.println("Two Pointer Result: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Result: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Deque Result: " + result3 +
                " | Time: " + (end3 - start3) + " ns");

        System.out.println("Recursive Result: " + result4 +
                " | Time: " + (end4 - start4) + " ns");

        scanner.close();
    }
}