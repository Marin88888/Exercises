package lesson1;

/**
 * Exercise 3: Double (Floating-Point) Arithmetic
 * -------------------------------------------------
 * Demonstrates +, -, *, / on double values.
 * Shows scientific notation and precision behavior.
 */
public class Ex03_DoubleOperators {

    public static void main(String[] args) {
        System.out.println("=== Exercise 3: Double Arithmetic Operators ===\n");

        // Basic operations
        System.out.println("3.141 - 0.03   = " + (3.141 - 0.03));       // 3.111
        System.out.println("2.0 - 2.0e-7   = " + (2.0 - 2.0e-7));      // 1.9999998
        System.out.println("100 * 0.015     = " + (100 * 0.015));        // 1.5
        System.out.println("6.02e23 / 2.0   = " + (6.02e23 / 2.0));     // 3.01e23

        // Precision matters!
        System.out.println("\n-- Precision demo --");
        double a = 0.1 + 0.2;
        System.out.println("0.1 + 0.2       = " + a);                    // not exactly 0.3!
        System.out.println("Expected: 0.3, but floating point is approximate.");

        // Mixing int and double (automatic promotion)
        System.out.println("\n-- Type promotion: int + double --");
        int intVal = 5;
        double doubleVal = 3.0;
        double result = intVal / doubleVal;   // int is promoted to double
        System.out.println("5 / 3.0 = " + result);   // 1.6666...
        System.out.println("5 / 3   = " + (5 / 3));  // 1 (integer division!)

        System.out.println("\n--- End of Exercise 3 ---\n");
    }
}

