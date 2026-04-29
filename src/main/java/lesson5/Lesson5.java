package lesson5;

import java.util.Arrays;

/**
 * Lesson 5: Bubble Sort
 * ---------------------
 * Bubble sort compares neighboring values and swaps them when they are
 * in the wrong order. After each pass, the biggest remaining value moves
 * to the end of the unsorted part of the array.
 */
public class Lesson5 {

    /*
     * Pseudocode:
     *
     * bubbleSort(array)
     *     for i from 0 to array.length - 2
     *         for j from 0 to array.length - i - 2
     *             if array[j] > array[j + 1]
     *                 swap array[j] with array[j + 1]
     */
    public static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] numbers, int firstIndex, int secondIndex) {
        int temp = numbers[firstIndex];
        numbers[firstIndex] = numbers[secondIndex];
        numbers[secondIndex] = temp;
    }

    public static void main(String[] args) {
        System.out.println("=== Lesson 5: Bubble Sort ===\n");

        int[] values = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Before sorting: " + Arrays.toString(values));

        long startTime = System.nanoTime();
        bubbleSort(values);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("After sorting:  " + Arrays.toString(values));
        System.out.println("Time used:      " + duration + " nanoseconds");
        System.out.println("Time used:      " + (duration / 1_000_000.0) + " milliseconds");

        System.out.println("\n--- End of Lesson 5 ---");
    }
}
