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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Text: ");
        String name = scanner.nextLine();
        String reversed = "";
        for(int i=name.length()-1;i>=0;i--){
            reversed += name.charAt(i);
        }
        if(reversed.equals(name)){
            System.out.println("String is Palindrome");
        }
        scanner.close();
    }
}