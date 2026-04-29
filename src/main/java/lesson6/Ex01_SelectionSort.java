package lesson6;

import java.util.Arrays;

public class Ex01_SelectionSort {

    public static void main(String[] args) {
        int[] values = {29, 10, 14, 37, 13};
        int[] moreValues = {64, 25, 12, 22, 11};

        printLessonHeader();
        printPseudocode();

        demonstrateSort("Example 1", values);
        demonstrateSort("Example 2", moreValues);
    }

    private static void printLessonHeader() {
        System.out.println("===============================================");
        System.out.println(" Lesson 6 - Selection Sort");
        System.out.println("===============================================\n");
    }

    private static void printPseudocode() {
        System.out.println("Pseudocode:");
        System.out.println("selectionSort(array)");
        System.out.println("    for i from 0 to length(array) - 2");
        System.out.println("        minIndex = i");
        System.out.println("        for j from i + 1 to length(array) - 1");
        System.out.println("            if array[j] < array[minIndex]");
        System.out.println("                minIndex = j");
        System.out.println("        if minIndex != i");
        System.out.println("            swap array[i] with array[minIndex]\n");
    }

    private static void demonstrateSort(String label, int[] original) {
        int[] copy = Arrays.copyOf(original, original.length);

        System.out.println(label);
        System.out.println("Before sort: " + Arrays.toString(copy));
        selectionSort(copy);
        System.out.println("After sort:  " + Arrays.toString(copy));
        System.out.println();
    }

    public static void selectionSort(int[] values) {
        for (int index = 0; index < values.length - 1; index++) {
            int minIndex = index;

            for (int candidate = index + 1; candidate < values.length; candidate++) {
                if (values[candidate] < values[minIndex]) {
                    minIndex = candidate;
                }
            }

            if (minIndex != index) {
                int temp = values[index];
                values[index] = values[minIndex];
                values[minIndex] = temp;
            }
        }
    }
}