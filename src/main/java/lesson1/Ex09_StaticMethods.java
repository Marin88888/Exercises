package lesson1;

/**
 * Exercise 9: Static Methods
 * ----------------------------
 * Demonstrates how to write and call static methods.
 * Implements the examples from the lesson:
 *   abs (int), abs (double), isPrime, sqrt, hypotenuse, H
 */
public class Ex09_StaticMethods {

    // --- Absolute value of an int ---
    public static int abs(int x) {
        if (x < 0) return -x;
        else        return x;
    }

    // --- Absolute value of a double ---
    public static double abs(double x) {
        if (x < 0.0) return -x;
        else          return x;
    }

    // --- Primality test ---
    public static boolean isPrime(int N) {
        if (N < 2) return false;
        for (int i = 2; i * i <= N; i++)
            if (N % i == 0) return false;
        return true;
    }

    // --- Square root (Newton's method) ---
    public static double sqrt(double c) {
        if (c < 0) return Double.NaN;
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > err * t)
            t = (c / t + t) / 2.0;
        return t;
    }

    // --- Hypotenuse of a right triangle ---
    public static double hypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    // --- Harmonic number H(N) = 1 + 1/2 + 1/3 + ... + 1/N ---
    public static double H(int N) {
        double sum = 0.0;
        for (int i = 1; i <= N; i++)
            sum += 1.0 / i;
        return sum;
    }

    // ====================== MAIN ======================
    public static void main(String[] args) {
        System.out.println("=== Exercise 9: Static Methods ===\n");

        // abs
        System.out.println("-- abs (absolute value) --");
        System.out.println("  abs(-5)   = " + abs(-5));
        System.out.println("  abs(3)    = " + abs(3));
        System.out.println("  abs(-2.7) = " + abs(-2.7));

        // isPrime
        System.out.println("\n-- isPrime --");
        int[] testNumbers = {1, 2, 3, 4, 17, 18, 97, 100};
        for (int n : testNumbers) {
            System.out.println("  isPrime(" + n + ") = " + isPrime(n));
        }

        // sqrt
        System.out.println("\n-- sqrt (Newton's method) --");
        System.out.println("  sqrt(2.0)  = " + sqrt(2.0));
        System.out.println("  sqrt(9.0)  = " + sqrt(9.0));
        System.out.println("  sqrt(25.0) = " + sqrt(25.0));
        System.out.println("  sqrt(-1.0) = " + sqrt(-1.0) + "  (NaN for negatives)");

        // hypotenuse
        System.out.println("\n-- hypotenuse --");
        System.out.println("  hypotenuse(3, 4) = " + hypotenuse(3, 4));  // 5.0
        System.out.println("  hypotenuse(5, 12) = " + hypotenuse(5, 12)); // 13.0

        // Harmonic number
        System.out.println("\n-- Harmonic number H(N) --");
        System.out.println("  H(1)  = " + H(1));
        System.out.println("  H(5)  = " + H(5));
        System.out.println("  H(10) = " + H(10));

        System.out.println("\n--- End of Exercise 9 ---\n");
    }
}

