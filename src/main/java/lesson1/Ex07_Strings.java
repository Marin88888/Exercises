package lesson1;

/**
 * Exercise 7: Strings and Concatenation
 * ----------------------------------------
 * Demonstrates String literals, the + operator for
 * concatenation, and mixing Strings with other types.
 */
public class Ex07_Strings {

    public static void main(String[] args) {
        System.out.println("=== Exercise 7: Strings & Concatenation ===\n");

        // String literals
        String greeting = "Hello";
        String name = "Bob";
        System.out.println("greeting = \"" + greeting + "\"");
        System.out.println("name     = \"" + name + "\"");

        // Concatenation with +
        String message = "Hi, " + "Bob";
        System.out.println("\n-- Concatenation --");
        System.out.println("\"Hi, \" + \"Bob\"   = \"" + message + "\"");

        // Number strings vs number addition
        System.out.println("\n-- Strings that look like numbers --");
        System.out.println("\"12\" + \"34\"       = " + ("12" + "34"));     // "1234"
        System.out.println("\"1\" + \"+\" + \"2\" = " + ("1" + "+" + "2")); // "1+2"
        System.out.println("12 + 34 (int)      = " + (12 + 34));            // 46

        // Concatenating strings with other types
        System.out.println("\n-- Mixing types in concatenation --");
        int age = 20;
        double gpa = 3.85;
        System.out.println("Age: " + age);              // int auto-converted
        System.out.println("GPA: " + gpa);              // double auto-converted
        System.out.println("Result: " + (10 + 20));     // parentheses matter!
        System.out.println("Result: " + 10 + 20);       // without parentheses: "1020"

        // String length and charAt
        System.out.println("\n-- Useful String methods --");
        String word = "Algorithm";
        System.out.println("word = \"" + word + "\"");
        System.out.println("word.length()  = " + word.length());
        System.out.println("word.charAt(0) = " + word.charAt(0));
        System.out.println("word.charAt(4) = " + word.charAt(4));

        System.out.println("\n--- End of Exercise 7 ---\n");
    }
}

