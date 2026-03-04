package lesson1;

/**
 * Exercise 2: Integer Arithmetic Operators
 * ------------------------------------------
 * Demonstrates +, -, *, / and % on int values.
 * Pay attention to integer division (truncation).
 */
public class Ex02_IntOperators {

    public static void main(String[] args) {
        System.out.println("=== Exercise 2: Integer Arithmetic Operators ===\n");

        int x = 5;
        int y = 3;

        System.out.println("x = " + x + ",  y = " + y);
        System.out.println();

        // Addition
        System.out.println("x + y = " + (x + y));    // 8

        // Subtraction
        System.out.println("x - y = " + (x - y));    // 2

        // Multiplication
        System.out.println("x * y = " + (x * y));    // 15

        // Division (integer — truncates toward zero)
        System.out.println("x / y = " + (x / y));    // 1  (not 1.666...)

        // Remainder (modulus)
        System.out.println("x % y = " + (x % y));    // 2

        System.out.println("\n-- Explore: what happens with negative numbers? --");
        int m = -7;
        int n = 2;
        System.out.println("m = " + m + ",  n = " + n);
        System.out.println("m / n = " + (m / n));    // -3
        System.out.println("m % n = " + (m % n));    // -1

        System.out.println("\n--- End of Exercise 2 ---\n");
    }
}

