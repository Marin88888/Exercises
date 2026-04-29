# Lesson 7: Heap Tree and Heap Sort

This lesson introduces the max-heap data structure and shows how heapsort uses it to sort an array. The runnable Java example is in `src/main/java/lesson7/Lesson7.java`.

## Goal

Students should understand how an array can represent a complete binary tree and how a max-heap supports heapsort.

## Main Ideas

- A heap is a complete binary tree.
- A max-heap keeps the largest value at the root.
- Array index formulas let us store the tree without creating node objects.
- Heapsort first builds a max-heap, then repeatedly moves the largest value to the end.

## Run From PowerShell

Compile:

```powershell
javac -d out src\main\java\lesson7\Lesson7.java
```

Run:

```powershell
java -cp out lesson7.Lesson7
```

If `javac` is not available on PATH, use the IntelliJ bundled JDK path:

```powershell
& "C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.2\jbr\bin\javac.exe" -d out src\main\java\lesson7\Lesson7.java
& "C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.2\jbr\bin\java.exe" -cp out lesson7.Lesson7
```

## Student Practice

1. Change the input array in `main`.
2. Predict the root after `buildMaxHeap`.
3. Draw the heap tree on paper using the printed levels.
4. Trace one `heapifyDown` call.
5. Explain why heapsort returns the values in ascending order.
