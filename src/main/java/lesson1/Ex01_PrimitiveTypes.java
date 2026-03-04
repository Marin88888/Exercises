package lesson1;

/**
 * Exercise 1: Primitive Data Types and Literals
 * -----------------------------------------------
 * Demonstrates the four primitive types in Java:
 *   int, double, boolean, char
 * Shows how to declare variables and print their values.
 */
public class Ex01_PrimitiveTypes {

    public static void main(String[] args) {
        System.out.println("=== Exercise 1: Primitive Data Types & Literals ===\n");

        // --- int: integers (32-bit, two's complement) ---
        int a = 5;
        int b = -42;
        int zero = 0;
        System.out.println("int examples:");
        System.out.println("  a    = " + a);
        System.out.println("  b    = " + b);
        System.out.println("  zero = " + zero);

        // --- double: real numbers (64-bit IEEE 754) ---
        double pi = 3.141592625;
        double small = 1.0e-15;
        double big = 6.02e23;
        System.out.println("\ndouble examples:");
        System.out.println("  pi    = " + pi);
        System.out.println("  small = " + small);
        System.out.println("  big   = " + big);

        // --- boolean: true or false ---
        boolean isJavaFun = true;
        boolean isBoring = false;
        System.out.println("\nboolean examples:");
        System.out.println("  isJavaFun = " + isJavaFun);
        System.out.println("  isBoring  = " + isBoring);

        // --- char: single character (16-bit Unicode) ---
        char letterA = 'a';
        char plus = '+';
        char digit9 = '9';
        char newline = '\n';
        System.out.println("\nchar examples:");
        System.out.println("  letterA = " + letterA);
        System.out.println("  plus    = " + plus);
        System.out.println("  digit9  = " + digit9);
        System.out.println("  newline (unicode value) = " + (int) newline);

        System.out.println("\n--- End of Exercise 1 ---\n");
    }
}

