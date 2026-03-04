# Lesson 1 Exercises — Primitive Types & Basics

This guide summarizes the runnable examples located in `src/main/java/lesson1`. Use it during class to decide which demonstration to launch next.

## Exercise Map

| #  | Class Name                          | Focus                                                                 |
|----|-------------------------------------|-----------------------------------------------------------------------|
| 01 | `Ex01_PrimitiveTypes`               | Primitive literals (`int`, `double`, `boolean`, `char`) and printing  |
| 02 | `Ex02_IntOperators`                 | Integer arithmetic operators (+ − × ÷ %) and negative inputs          |
| 03 | `Ex03_DoubleOperators`              | Double arithmetic, scientific notation, and mixed-type division       |
| 04 | `Ex04_BooleanAndComparisons`        | Boolean operators (&&, \|\|, !, ^) plus comparison operators          |
| 05 | `Ex05_CharType`                     | Characters as Unicode values, arithmetic on `char`, alphabet loop     |
| 06 | `Ex06_VariablesAndAssignments`      | Declaration, assignment, initialization, and shorthand (`+=`, `++`)   |
| 07 | `Ex07_Strings`                      | String literals, concatenation, mixed types, and helper methods       |
| 08 | `Ex08_ConditionalsAndLoops`         | `if`, `if-else`, `while`, `for`, Newton’s method, harmonic series     |
| 09 | `Ex09_StaticMethods`                | Static method anatomy: `abs`, `isPrime`, `sqrt`, `hypotenuse`, `H`    |
| 10 | `Ex10_BinarySearch`                 | Full example combining arrays, methods, conditionals, and loops       |
| —  | `RunAllExercises`                   | Master launcher that invokes Exercises 1–10 sequentially              |

## How to Run

Compile everything (adjust the JDK path if needed):

```powershell
cd "C:\Users\GBS12554\OneDrive - Sella\Documents\Marin\Exercise"
& "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.2.5\jbr\bin\javac.exe" -d out src\main\java\lesson1\*.java
```

Run a single exercise (example: Exercise 3):

```powershell
cd "C:\Users\GBS12554\OneDrive - Sella\Documents\Marin\Exercise"
& "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.2.5\jbr\bin\java.exe" -cp out lesson1.Ex03_DoubleOperators
```

Run the full lesson deck:

```powershell
cd "C:\Users\GBS12554\OneDrive - Sella\Documents\Marin\Exercise"
& "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.2.5\jbr\bin\java.exe" -cp out lesson1.RunAllExercises
```

## Presentation Tips

- Announce which numbered exercise you are about to run so students can follow along.
- Pause between exercises to solicit predictions or quick questions.
- For Exercise 10, invite students to suggest additional keys to search for and rerun the program after editing `keysToFind`.

