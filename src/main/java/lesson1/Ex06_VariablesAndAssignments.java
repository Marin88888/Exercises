package lesson1;

/**
 * Exercise 6: Variables — Declaration, Assignment, Initialization
 * ----------------------------------------------------------------
 * Demonstrates the different kinds of Java statements:
 *   declaration, assignment, initializing declaration,
 *   and implicit assignment (++, +=).
 */
public class Ex06_VariablesAndAssignments {

    public static void main(String[] args) {
        System.out.println("=== Exercise 6: Variables & Assignments ===\n");

        // 1. Declaration — create a variable of a specified type
        int i;
        double c;
        System.out.println("-- Declaration --");
        System.out.println("  int i;      // declared but not yet assigned");
        System.out.println("  double c;   // declared but not yet assigned");

        // 2. Assignment — assign a value to a variable
        int b = 5;
        int a;
        a = b + 3;
        double discriminant;
        double bVal = 4.0;
        c = 2.0;
        discriminant = bVal * bVal - 4.0 * c;
        System.out.println("\n-- Assignment --");
        System.out.println("  a = b + 3           => a = " + a);
        System.out.println("  discriminant = b*b - 4.0*c => " + discriminant);

        // 3. Initializing declaration — declare and assign in one step
        int count = 1;
        double pi = 3.141592625;
        System.out.println("\n-- Initializing declaration --");
        System.out.println("  int count = 1       => count = " + count);
        System.out.println("  double pi = 3.14... => pi    = " + pi);

        // 4. Implicit assignment (shorthand operators)
        System.out.println("\n-- Implicit assignment --");
        i = 10;
        System.out.println("  i = " + i);
        i++;                        // i = i + 1
        System.out.println("  i++ => i = " + i);
        i += 5;                     // i = i + 5
        System.out.println("  i += 5 => i = " + i);
        i -= 3;                     // i = i - 3
        System.out.println("  i -= 3 => i = " + i);
        i *= 2;                     // i = i * 2
        System.out.println("  i *= 2 => i = " + i);

        System.out.println("\n--- End of Exercise 6 ---\n");
    }
}

