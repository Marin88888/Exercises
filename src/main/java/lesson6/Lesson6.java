package lesson6;

import java.util.Arrays;

/**
 * Lesson 6: Selection Sort
 * ------------------------
 * Selection sort repeatedly finds the smallest value in the unsorted
 * part of the array and swaps it into the next correct position.
 */
public class Lesson6 {

    /*
     * Pseudocode:
     *
     * selectionSort(array)
     *     for i from 0 to array.length - 2
     *         minIndex = i
     *
     *         for j from i + 1 to array.length - 1
     *             if array[j] < array[minIndex]
     *                 minIndex = j
     *
     *         swap array[i] with array[minIndex]
     */
    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }

            swap(numbers, i, minIndex);
        }
    }

    private static void swap(int[] numbers, int firstIndex, int secondIndex) {
        int temp = numbers[firstIndex];
        numbers[firstIndex] = numbers[secondIndex];
        numbers[secondIndex] = temp;
    }

    public static void main(String[] args) {
        System.out.println("=== Lesson 6: Selection Sort ===\n");

        int[] values = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Before sorting: " + Arrays.toString(values));

        long startTime = System.nanoTime();
        selectionSort(values);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("After sorting:  " + Arrays.toString(values));
        System.out.println("Time used:      " + duration + " nanoseconds");
        System.out.println("Time used:      " + (duration / 1_000_000.0) + " milliseconds");

        System.out.println("\n--- End of Lesson 6 ---");
    }
}
