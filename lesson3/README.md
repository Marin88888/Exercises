# Lesson 3 Exercises — Bank Account Walkthrough

Lesson 3 introduces classes and object interactions through a compact banking scenario. The code lives in `src/main/java/lesson3` and keeps each concept in its own class:

- `BankAccount` encapsulates balance state plus deposit/withdraw/display behavior.
- `BankApp` contains the `main` method that drives a sample session against one account.

## How to Build and Run

Use the JetBrains-bundled JDK (adjust the path if your setup differs):

```powershell
cd "C:\Users\maran\IdeaProjects\Exercises"
& "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.2.5\jbr\bin\javac.exe" -d out src\main\java\lesson3\*.java
& "C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.2.5\jbr\bin\java.exe" -cp out lesson3.BankApp
```

The console output mirrors the textbook example so students can compare expected balances before and after each transaction.

