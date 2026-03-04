package lesson1;

/**
 * Lesson 1 — Run All Exercises
 * ==============================
 * Executes every exercise from 1 to 10 in order.
 * Use this to demonstrate the full lesson in one run,
 * or run each Ex##_*.java individually.
 *
 * Topics covered:
 *   Ex01 - Primitive Data Types & Literals
 *   Ex02 - Integer Arithmetic Operators
 *   Ex03 - Double Arithmetic Operators
 *   Ex04 - Boolean Operators & Comparisons
 *   Ex05 - The char Type
 *   Ex06 - Variables, Declarations & Assignments
 *   Ex07 - Strings & Concatenation
 *   Ex08 - Conditional Statements & Loops
 *   Ex09 - Static Methods
 *   Ex10 - Binary Search (Putting It All Together)
 */
public class RunAllExercises {

    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║   Leksioni 1 — Algoritmikë dhe Programim i       ║");
        System.out.println("║              Avancuar: All Exercises             ║");
        System.out.println("╚══════════════════════════════════════════════════╝\n");

        Ex01_PrimitiveTypes.main(args);
        Ex02_IntOperators.main(args);
        Ex03_DoubleOperators.main(args);
        Ex04_BooleanAndComparisons.main(args);
        Ex05_CharType.main(args);
        Ex06_VariablesAndAssignments.main(args);
        Ex07_Strings.main(args);
        Ex08_ConditionalsAndLoops.main(args);
        Ex09_StaticMethods.main(args);
        Ex10_BinarySearch.main(args);

        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("║          Te gjitha ushtrimet u realizuan         ║");
        System.out.println("╚══════════════════════════════════════════════════╝");
    }
}
