package lesson1;

import java.util.Arrays;

/**
 * Exercise 10: Binary Search — Putting It All Together
 * ------------------------------------------------------
 * A complete program that uses:
 *   - arrays, static methods, loops, conditionals
 *   - the java.util.Arrays library
 * This mirrors the BinarySearch example from the lesson.
 */
public class Ex10_BinarySearch {

    /**
     * Binary search: returns the index of key in sorted array a[],
     * or -1 if not found.
     */
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else                   return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("=== Exercise 10: Binary Search ===\n");

        // A sample sorted array (whitelist)
        int[] whitelist = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};

        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(whitelist));

        // Search for some keys
        int[] keysToFind = {23, 7, 56, 1, 91, 50};
        System.out.println("\n-- Searching for keys --");
        for (int key : keysToFind) {
            int index = rank(key, whitelist);
            if (index == -1) {
                System.out.println("  key=" + key + "  => NOT FOUND");
            } else {
                System.out.println("  key=" + key + "  => found at index " + index);
            }
        }

        // Demo: sort an unsorted array first, then search
        System.out.println("\n-- Sorting an unsorted array, then searching --");
        int[] unsorted = {45, 12, 3, 78, 34, 9, 67, 23};
        System.out.println("  Before sort: " + Arrays.toString(unsorted));
        Arrays.sort(unsorted);
        System.out.println("  After sort:  " + Arrays.toString(unsorted));
        int searchKey = 34;
        int result = rank(searchKey, unsorted);
        System.out.println("  rank(" + searchKey + ") = " + result);

        System.out.println("\n--- End of Exercise 10 ---\n");
    }
}

