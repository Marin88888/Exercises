package lesson7;

import java.util.Arrays;

/**
 * Lesson 7: Heap Tree and Heap Sort
 * ---------------------------------
 * A max-heap is a complete binary tree where every parent is greater than
 * or equal to its children. In an array, the tree relationships are:
 *
 * parent index      = (childIndex - 1) / 2
 * left child index  = 2 * parentIndex + 1
 * right child index = 2 * parentIndex + 2
 */
public class Lesson7 {

    /*
     * Exercise goals:
     *
     * 1. Build a max-heap from an unsorted array.
     * 2. Print the heap by levels so it is easier to see the tree shape.
     * 3. Use the heap to sort the array in ascending order.
     *
     * Pseudocode for heapSort:
     *
     * heapSort(array)
     *     buildMaxHeap(array)
     *
     *     for end from array.length - 1 down to 1
     *         swap array[0] with array[end]
     *         heapifyDown(array, 0, end)
     */
    public static void heapSort(int[] numbers) {
        buildMaxHeap(numbers);

        for (int end = numbers.length - 1; end > 0; end--) {
            swap(numbers, 0, end);
            heapifyDown(numbers, 0, end);
        }
    }

    public static void buildMaxHeap(int[] numbers) {
        int lastParentIndex = numbers.length / 2 - 1;

        for (int i = lastParentIndex; i >= 0; i--) {
            heapifyDown(numbers, i, numbers.length);
        }
    }

    private static void heapifyDown(int[] numbers, int parentIndex, int heapSize) {
        int largestIndex = parentIndex;

        while (true) {
            int leftChildIndex = 2 * parentIndex + 1;
            int rightChildIndex = 2 * parentIndex + 2;

            if (leftChildIndex < heapSize && numbers[leftChildIndex] > numbers[largestIndex]) {
                largestIndex = leftChildIndex;
            }

            if (rightChildIndex < heapSize && numbers[rightChildIndex] > numbers[largestIndex]) {
                largestIndex = rightChildIndex;
            }

            if (largestIndex == parentIndex) {
                return;
            }

            swap(numbers, parentIndex, largestIndex);
            parentIndex = largestIndex;
        }
    }

    private static void printHeapAsTree(int[] heap) {
        int level = 0;
        int nextLevelStartsAt = 1;

        System.out.println("Heap tree by levels:");
        System.out.print("Level " + level + ": ");

        for (int i = 0; i < heap.length; i++) {
            if (i == nextLevelStartsAt) {
                level++;
                nextLevelStartsAt = nextLevelStartsAt * 2 + 1;
                System.out.print("\nLevel " + level + ": ");
            }

            System.out.print(heap[i] + " ");
        }

        System.out.println();
    }

    private static void explainArrayPositions(int[] heap) {
        System.out.println("\nIndex relationships inside the heap:");

        for (int parentIndex = 0; parentIndex < heap.length; parentIndex++) {
            int leftChildIndex = 2 * parentIndex + 1;
            int rightChildIndex = 2 * parentIndex + 2;

            if (leftChildIndex >= heap.length) {
                continue;
            }

            System.out.print("Parent " + heap[parentIndex] + " at index " + parentIndex);
            System.out.print(" -> left child " + heap[leftChildIndex] + " at index " + leftChildIndex);

            if (rightChildIndex < heap.length) {
                System.out.print(", right child " + heap[rightChildIndex] + " at index " + rightChildIndex);
            }

            System.out.println();
        }
    }

    private static void swap(int[] numbers, int firstIndex, int secondIndex) {
        int temp = numbers[firstIndex];
        numbers[firstIndex] = numbers[secondIndex];
        numbers[secondIndex] = temp;
    }

    public static void main(String[] args) {
        System.out.println("=== Lesson 7: Heap Tree and Heap Sort ===\n");

        int[] values = {42, 18, 29, 7, 35, 12, 90, 3, 16};
        int[] heapValues = Arrays.copyOf(values, values.length);
        int[] sortedValues = Arrays.copyOf(values, values.length);

        System.out.println("Original array: " + Arrays.toString(values));

        buildMaxHeap(heapValues);
        System.out.println("After buildMaxHeap: " + Arrays.toString(heapValues));
        printHeapAsTree(heapValues);
        explainArrayPositions(heapValues);

        System.out.println("\nBefore heapSort: " + Arrays.toString(sortedValues));

        long startTime = System.nanoTime();
        heapSort(sortedValues);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("After heapSort:  " + Arrays.toString(sortedValues));
        System.out.println("Time used:       " + duration + " nanoseconds");
        System.out.println("Time used:       " + (duration / 1_000_000.0) + " milliseconds");

        System.out.println("\nStudent practice:");
        System.out.println("1. Change the values array and predict the max-heap root.");
        System.out.println("2. Trace one call to heapifyDown by hand.");
        System.out.println("3. Explain why the final heapSort output is ascending.");

        System.out.println("\n--- End of Lesson 7 ---");
    }
}
