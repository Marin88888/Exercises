package lesson1;

/**
 * Exercise 8: Conditional Statements and Loops
 * -----------------------------------------------
 * Demonstrates if, if-else, while loop, and for loop
 * as shown in the lesson's Java statements table.
 */
public class Ex08_ConditionalsAndLoops {

    public static void main(String[] args) {
        System.out.println("=== Exercise 8: Conditionals & Loops ===\n");

        // --- if statement ---
        System.out.println("-- if statement: absolute value --");
        int x = 7;
        System.out.println("  x = " + x);
        if (x < 0) x = -x;   // make x positive
        System.out.println("  After if (x < 0) x = -x;  =>  x = " + x);

        // --- if-else statement ---
        System.out.println("\n-- if-else: find the maximum --");
        int a = 15, b = 23;
        int max;
        if (a > b) max = a;
        else        max = b;
        System.out.println("  a = " + a + ", b = " + b);
        System.out.println("  max = " + max);

        // --- while loop: powers of 2 ---
        System.out.println("\n-- while loop: powers of 2 up to N --");
        int N = 100;
        int v = 1;
        System.out.print("  Powers of 2 <= " + N + ": ");
        while (v <= N) {
            System.out.print(v + " ");
            v = 2 * v;
        }
        System.out.println();

        // --- while loop: Newton's square root ---
        System.out.println("\n-- while loop: sqrt(2) via Newton's method --");
        double c = 2.0;
        double t = c;
        while (Math.abs(t - c / t) > 1e-15 * t) {
            t = (c / t + t) / 2.0;
        }
        System.out.println("  sqrt(2) ≈ " + t);
        System.out.println("  Math.sqrt(2) = " + Math.sqrt(2));

        // --- for loop: sum 1/i (Harmonic numbers) ---
        System.out.println("\n-- for loop: Harmonic sum H(10) --");
        int terms = 10;
        double sum = 0.0;
        for (int i = 1; i <= terms; i++) {
            sum += 1.0 / i;
        }
        System.out.println("  H(" + terms + ") = 1 + 1/2 + 1/3 + ... + 1/10 = " + sum);

        // --- for loop: print points on a circle ---
        System.out.println("\n-- for loop: points on a unit circle (N=8) --");
        int points = 8;
        for (int i = 0; i <= points; i++) {
            double angle = 2 * Math.PI * i / points;
            System.out.printf("  i=%d  angle=%.2f rad  (x=%.3f, y=%.3f)%n",
                    i, angle, Math.cos(angle), Math.sin(angle));
        }

        System.out.println("\n--- End of Exercise 8 ---\n");
    }
}

