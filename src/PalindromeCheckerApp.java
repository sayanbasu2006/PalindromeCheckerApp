import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

/**
 * =========================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 6: Queue + Stack Based Palindrome Checker
 *
 * Goal:
 * Demonstrate FIFO vs LIFO using Queue and Stack.
 *
 * Data Structures Used:
 * - Stack (LIFO)
 * - Queue (FIFO)
 *
 * @author Developer
 * @version 6.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Text: ");
        String text = scanner.nextLine();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Step 1: Insert into Stack and Queue
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            stack.push(ch);     // LIFO
            queue.add(ch);      // FIFO
        }

        // Step 2: Compare dequeue vs pop
        boolean isPalindrome = true;

        while (!stack.isEmpty()) {

            char fromStack = stack.pop();      // reverse order
            char fromQueue = queue.remove();  // original order

            if (fromStack != fromQueue) {
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