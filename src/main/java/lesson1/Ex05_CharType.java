package lesson1;

/**
 * Exercise 5: The char Type
 * ---------------------------
 * Demonstrates char literals, Unicode values,
 * and arithmetic on characters.
 */
public class Ex05_CharType {

    public static void main(String[] args) {
        System.out.println("=== Exercise 5: The char Type ===\n");

        // Basic char literals
        char letter = 'A';
        char digit = '9';
        char symbol = '+';
        System.out.println("letter = " + letter);
        System.out.println("digit  = " + digit);
        System.out.println("symbol = " + symbol);

        // char is actually a 16-bit number (Unicode)
        System.out.println("\n-- char as a number --");
        System.out.println("'A' as int = " + (int) letter);   // 65
        System.out.println("'9' as int = " + (int) digit);    // 57
        System.out.println("'+' as int = " + (int) symbol);   // 43

        // Arithmetic with char
        System.out.println("\n-- Arithmetic on chars --");
        char a = 'a';                      // 97
        char next = (char) (a + 1);        // 'b'
        System.out.println("'a' + 1 = '" + next + "'");

        // Print the alphabet using a loop
        System.out.print("\nAlphabet: ");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Convert digit char to its numeric value
        System.out.println("\n-- Digit char to number --");
        char digitChar = '7';
        int numericValue = digitChar - '0';  // '7' - '0' = 55 - 48 = 7
        System.out.println("'" + digitChar + "' - '0' = " + numericValue);

        System.out.println("\n--- End of Exercise 5 ---\n");
    }
}

