# Lesson 2 Exercises — Working with Objects

Lesson 2 moves beyond primitives and spotlights how Java classes model real-world concepts. Each exercise in `src/main/java/lesson2` is standalone with a `main` method so you can demo it by itself or launch the whole sequence via `RunAllExercises`.

## Exercise Map

| #  | Class Name                              | Focus                                                                 |
|----|-----------------------------------------|-----------------------------------------------------------------------|
| 01 | `Ex01_ObjectBlueprints`                 | Declaring reference variables, instantiating objects, aliasing, clone |
| 02 | `Ex02_ConstructorsAndEncapsulation`     | Constructors, overloading, validation, derived behavior               |
| 03 | `Ex03_CompositionAndCollections`        | Objects containing other objects, `List` operations, aggregation      |
| 04 | `Ex04_StaticMembersAndFactories`        | Static counters, factory methods, timestamps                          |
| —  | `RunAllExercises`                       | Launches Exercises 1–4 sequentially                                   |

## How to Run

Compile only lesson 2 (adjust the JDK path if needed):

```powershell
cd "C:\Users\GBS12554\OneDrive - Sella\Documents\Marin\Exercise"
& "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.2.5\jbr\bin\javac.exe" -d out src\main\java\lesson2\*.java
```

Run a single exercise (example: Exercise 2):

```powershell
cd "C:\Users\GBS12554\OneDrive - Sella\Documents\Marin\Exercise"
& "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.2.5\jbr\bin\java.exe" -cp out lesson2.Ex02_ConstructorsAndEncapsulation
```

Run the entire lesson:

```powershell
cd "C:\Users\GBS12554\OneDrive - Sella\Documents\Marin\Exercise"
& "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.2.5\jbr\bin\java.exe" -cp out lesson2.RunAllExercises
```

## Presentation Tips

- Ask students to predict field values before and after each mutation so they reason about references.
- Highlight how encapsulation lets you protect invariants (Exercise 2) while still offering useful behavior.
- Point out how the factory in Exercise 4 hides object creation details and keeps IDs consistent.

