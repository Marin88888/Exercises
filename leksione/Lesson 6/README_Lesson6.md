# Lesson 6: Selection Sort

This lesson explains selection sort using the runnable Java example in `src/main/java/lesson6/Lesson6.java`.

## Goal

Students should understand how repeatedly selecting the smallest unsorted value can build a sorted array from left to right.

## Main Ideas

- Selection sort scans the unsorted part of the array.
- It finds the smallest value.
- It swaps that value into the next sorted position.
- It usually performs fewer swaps than bubble sort, but it still uses nested loops.

## Run From PowerShell

Compile:

```powershell
javac -d out src\main\java\lesson6\Lesson6.java
```

Run:

```powershell
java -cp out lesson6.Lesson6
```

If `javac` is not available on PATH, use the IntelliJ bundled JDK path:

```powershell
& "C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.2\jbr\bin\javac.exe" -d out src\main\java\lesson6\Lesson6.java
& "C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.2\jbr\bin\java.exe" -cp out lesson6.Lesson6
```

## Student Practice

1. Change the input array in `main`.
2. Predict the first `minIndex`.
3. Trace one outer-loop pass by hand.
4. Compare the number of swaps with bubble sort.
