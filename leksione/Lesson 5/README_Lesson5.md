# Lesson 5: Bubble Sort

This lesson explains bubble sort using the runnable Java example in `src/main/java/lesson5/Lesson5.java`.

## Goal

Students should understand how repeated neighbor comparisons can move large values toward the end of an array.

## Main Ideas

- Bubble sort compares two neighboring values.
- If the values are in the wrong order, it swaps them.
- After each full pass, the largest unsorted value is placed in its final position.
- Bubble sort is simple to understand, but inefficient for large arrays.

## Run From PowerShell

Compile:

```powershell
javac -d out src\main\java\lesson5\Lesson5.java
```

Run:

```powershell
java -cp out lesson5.Lesson5
```

If `javac` is not available on PATH, use the IntelliJ bundled JDK path:

```powershell
& "C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.2\jbr\bin\javac.exe" -d out src\main\java\lesson5\Lesson5.java
& "C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.2\jbr\bin\java.exe" -cp out lesson5.Lesson5
```

## Student Practice

1. Change the input array in `main`.
2. Predict the array after the first full pass.
3. Count how many comparisons happen for an array of 7 values.
4. Explain why the largest value reaches the end first.
