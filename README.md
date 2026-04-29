# Exercises

Academic Java exercises for algorithms, programming basics, and data structures.

## Project Structure

- `src/main/java/lesson1` through `src/main/java/lesson7` contain lesson examples.
- `leksione` contains lecture material and lesson README notes.
- `out` is used for compiled class files when running examples locally.

## Lesson 7: Heap Tree and Heap Sort

Lesson 7 is located in `src/main/java/lesson7`.
Lesson notes for Lessons 5, 6, and 7 are in `leksione`.

Compile it from the repository root:

```powershell
& "C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.2\jbr\bin\javac.exe" -d out src\main\java\lesson7\Lesson7.java
```

Run it:

```powershell
& "C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.2\jbr\bin\java.exe" -cp out lesson7.Lesson7
```

If `javac` and `java` are available on your PATH, the shorter commands also work:

```powershell
javac -d out src\main\java\lesson7\Lesson7.java
java -cp out lesson7.Lesson7
```

## Development Notes

- Keep lessons small and focused.
- Add commands to this README when a new lesson needs a specific way to compile or run.
- For GitHub workflow, create a focused branch and pull request for each lesson-sized change.
