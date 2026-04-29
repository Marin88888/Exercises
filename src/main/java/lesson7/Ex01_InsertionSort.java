package lesson7;

import java.util.Arrays;

public class Ex01_InsertionSort {

    public static void main(String[] args) {
        int[] values = {12, 11, 13, 5, 6};
        int[] moreValues = {31, 41, 59, 26, 41, 58};

        printLessonHeader();
        printPseudocode();

        demonstrateSort("Example 1", values);
        demonstrateSort("Example 2", moreValues);
    }

    private static void printLessonHeader() {
        System.out.println("===============================================");
        System.out.println(" Lesson 7 - Insertion Sort");
        System.out.println("===============================================\n");
    }

    private static void printPseudocode() {
        System.out.println("Pseudocode:");
        System.out.println("insertionSort(array)");
        System.out.println("    for i from 1 to length(array) - 1");
        System.out.println("        currentValue = array[i]");
        System.out.println("        j = i - 1");
        System.out.println("        while j >= 0 and array[j] > currentValue");
        System.out.println("            array[j + 1] = array[j]");
        System.out.println("            j = j - 1");
        System.out.println("        array[j + 1] = currentValue\n");
    }

    private static void demonstrateSort(String label, int[] original) {
        int[] copy = Arrays.copyOf(original, original.length);

        System.out.println(label);
        System.out.println("Before sort: " + Arrays.toString(copy));
        insertionSort(copy);
        System.out.println("After sort:  " + Arrays.toString(copy));
        System.out.println();
    }

    public static void insertionSort(int[] values) {
        for (int index = 1; index < values.length; index++) {
            int currentValue = values[index];
            int position = index - 1;

            while (position >= 0 && values[position] > currentValue) {
                values[position + 1] = values[position];
                position--;
            }

            values[position + 1] = currentValue;
        }
    }
}