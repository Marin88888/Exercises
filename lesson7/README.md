# Lesson 7 - Insertion Sort

Lesson 7 introduces the insertion sort algorithm with short pseudocode and a runnable Java example.

## Pseudocode

```text
insertionSort(array)
    for i from 1 to length(array) - 1
        currentValue = array[i]
        j = i - 1

        while j >= 0 and array[j] > currentValue
            array[j + 1] = array[j]
            j = j - 1

        array[j + 1] = currentValue
```

## How to Run

Compile the lesson:

```powershell
javac -d out src\main\java\lesson7\*.java
```

Run the exercise:

```powershell
java -cp out lesson7.Ex01_InsertionSort
```

Or run the lesson launcher:

```powershell
java -cp out lesson7.RunAllExercises
```