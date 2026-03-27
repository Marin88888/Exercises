package lesson1;

/**
 * Exercise 4: Boolean Operators and Comparisons
 * ------------------------------------------------
 * Demonstrates &&, ||, !, ^ (boolean operators)
 * and comparison operators ==, !=, <, <=, >, >=
 */
public class Ex04_BooleanAndComparisons {

    public static void main(String[] args) {
        System.out.println("=== Exercise 4: Boolean Operators & Comparisons ===\n");

        // --- Boolean operators ---
        System.out.println("-- Boolean operators --");
        System.out.println("true  && false = " + (true && false));   // false
        System.out.println("false || true  = " + (false || true));   // true
        System.out.println("!false         = " + (!false));          // true
        System.out.println("true  ^ true   = " + (true ^ true));    // false (XOR)
        System.out.println("true  ^ false  = " + (true ^ false));   // true  (XOR)

        // --- Comparison operators (Krahasimet) ---
        System.out.println("\n-- Comparison operators --");
        int a = 10;
        int b = 20;
        System.out.println("a = " + a + ",  b = " + b);
        System.out.println("a == b  : " + (a == b));    // false
        System.out.println("a != b  : " + (a != b));    // true
        System.out.println("a <  b  : " + (a < b));     // true
        System.out.println("a <= b  : " + (a <= b));    // true
        System.out.println("a >  b  : " + (a > b));     // false
        System.out.println("a >= b  : " + (a >= b));    // false

        // --- Combining comparisons with boolean operators ---
        System.out.println("\n-- Combined expressions --");
        int age = 20;
        boolean isStudent = false;
        boolean hasDiscount = (age < 25) && isStudent;
        System.out.println("age = " + age + ", isStudent = " + isStudent);
        System.out.println("hasDiscount = (age < 25) && isStudent = " + hasDiscount);

        int score = 75;
        boolean passed = (score >= 50) && (score <= 100);
        System.out.println("score = " + score);
        System.out.println("passed = (score >= 50) && (score <= 100) = " + passed);

        System.out.println("\n--- End of Exercise 4 ---\n");
    }
}

