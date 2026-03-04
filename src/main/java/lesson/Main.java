package lesson;

import java.util.Locale;

public class Main {

    private static final PrimitiveTypeInfo[] PRIMITIVES = new PrimitiveTypeInfo[] {
        new PrimitiveTypeInfo("byte", "8-bit", "byte age = 12;", "Tiny integers; -128..127."),
        new PrimitiveTypeInfo("short", "16-bit", "short year = 2026;", "Legacy APIs, sensor data."),
        new PrimitiveTypeInfo("int", "32-bit", "int score = 9000;", "Default whole-number type."),
        new PrimitiveTypeInfo("long", "64-bit", "long distance = 9_223_372_036_854_775L;", "Use when int overflows."),
        new PrimitiveTypeInfo("float", "32-bit", "float price = 19.99F;", "Decimal with F suffix."),
        new PrimitiveTypeInfo("double", "64-bit", "double pi = 3.14159;", "Default decimal type."),
        new PrimitiveTypeInfo("char", "16-bit", "char grade = 'A';", "Single UTF-16 character."),
        new PrimitiveTypeInfo("boolean", "logical", "boolean ready = true;", "Only true or false.")
    };

    private static final ReferenceTypeInfo[] REFERENCES = new ReferenceTypeInfo[] {
        new ReferenceTypeInfo("String", "Immutable text", "\"Java\""),
        new ReferenceTypeInfo("StringBuilder", "Mutable text buffer", "new StringBuilder()"),
        new ReferenceTypeInfo("BigDecimal", "Exact decimal math", "new BigDecimal(\"10.50\")"),
        new ReferenceTypeInfo("var", "Keyword for local type inference", "var total = 0; // still strongly typed")
    };

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        printTitle("Java Types and Type Conversions");
        showPrimitiveTypes();
        showReferenceTypes();
        showConversions();
    }

    private static void showPrimitiveTypes() {
        printSectionHeader("Primitive Types");
        System.out.printf("  %-9s %-10s %-30s %s%n", "Type", "Size", "Sample", "Notes");
        System.out.println("  " + repeat('-', 9) + " " + repeat('-', 10) + " " + repeat('-', 30) + " " + repeat('-', 24));
        for (PrimitiveTypeInfo type : PRIMITIVES) {
            System.out.printf("  %-9s %-10s %-30s %s%n", type.name, type.size, type.example, type.notes);
        }
    }

    private static void showReferenceTypes() {
        printSectionHeader("Reference Types");
        System.out.printf("  %-15s %-22s %s%n", "Type", "What it represents", "Example usage");
        System.out.println("  " + repeat('-', 15) + " " + repeat('-', 22) + " " + repeat('-', 28));
        for (ReferenceTypeInfo type : REFERENCES) {
            System.out.printf("  %-15s %-22s %s%n", type.name, type.description, type.example);
        }
        System.out.println("\n  Strings and other reference types live on the heap, and the variable stores a reference (an address)." );
        System.out.println("  Using 'var' lets the compiler infer the type, but the variable still has a fixed static type at compile time.\n");
    }

    private static void showConversions() {
        printSectionHeader("Type Conversion Examples");
        demonstrateWidening();
        demonstrateNarrowing();
        demonstrateParsing();
        demonstrateCharMath();
    }

    private static void demonstrateWidening() {
        printSubHeader("Widening (automatic, no data loss)");
        int students = 28;
        double averagedStudents = students; // automatic int -> double
        long worldPopulation = 8_100_000_000L;
        double approxPopulation = worldPopulation; // long -> double
        System.out.printf("    int %d becomes double %.1f automatically.%n", students, averagedStudents);
        System.out.printf("    long %,d becomes double %.2e for scientific notation.%n%n", worldPopulation, approxPopulation);
    }

    private static void demonstrateNarrowing() {
        printSubHeader("Narrowing (explicit cast, possible data loss)");
        double preciseTemperature = 98.6;
        int roundedTemperature = (int) preciseTemperature;
        long farDistance = 1_000_000_000_000L;
        short wrappedDistance = (short) farDistance;
        System.out.printf("    double %.1f cast to int becomes %d.%n", preciseTemperature, roundedTemperature);
        System.out.printf("    long %,d cast to short becomes %d (overflow).%n%n", farDistance, wrappedDistance);
    }

    private static void demonstrateParsing() {
        printSubHeader("Between numbers and text");
        String userInput = "42";
        int parsed = Integer.parseInt(userInput);
        double measurement = 123.456;
        String measurementText = Double.toString(measurement);
        var inferredTotal = parsed + 0.5; // still double at compile time
        System.out.printf("    String '%s' parsed to int is %d.%n", userInput, parsed);
        System.out.printf("    double %.3f converted back to text is '%s'.%n", measurement, measurementText);
        System.out.printf("    'var' lets the compiler infer double for parsed + 0.5 -> %.1f.%n%n", inferredTotal);
    }

    private static void demonstrateCharMath() {
        printSubHeader("char <-> int conversions");
        char grade = 'B';
        int gradeCode = grade; // implicit widening to int
        char nextGrade = (char) (grade + 1);
        System.out.printf("    char '%c' has numeric code %d.%n", grade, gradeCode);
        System.out.printf("    Adding 1 and casting back gives '%c'.%n", nextGrade);
        boolean passed = grade <= 'C';
        System.out.printf("    Comparison with chars is still boolean logic -> %b.%n", passed);
    }

    private static void printTitle(String title) {
        String line = repeat('=', 68);
        System.out.println(line);
        System.out.println(" " + title);
        System.out.println(line + "\n");
    }

    private static void printSectionHeader(String title) {
        System.out.println(repeat('-', 68));
        System.out.println(" " + title);
        System.out.println(repeat('-', 68));
    }

    private static void printSubHeader(String title) {
        System.out.println("  -> " + title);
    }

    private static String repeat(char ch, int count) {
        StringBuilder builder = new StringBuilder(count);
        for (int i = 0; i < count; i++) {
            builder.append(ch);
        }
        return builder.toString();
    }

    private static final class PrimitiveTypeInfo {
        final String name;
        final String size;
        final String example;
        final String notes;

        PrimitiveTypeInfo(String name, String size, String example, String notes) {
            this.name = name;
            this.size = size;
            this.example = example;
            this.notes = notes;
        }
    }

    private static final class ReferenceTypeInfo {
        final String name;
        final String description;
        final String example;

        ReferenceTypeInfo(String name, String description, String example) {
            this.name = name;
            this.description = description;
            this.example = example;
        }
    }
}
