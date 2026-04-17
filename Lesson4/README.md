# Lesson4

This lesson contains one exercise:

- `src/main/java/Lesson4/Ex01_MaxOfThreeNumbers.java`

The program reads 3 numbers from the console and prints the biggest number.

## Pseudocode

```text
START
  READ first
  READ second
  READ third

  max <- first
  IF second > max THEN
	max <- second
  END IF

  IF third > max THEN
	max <- third
  END IF

  PRINT max
END
```

## Run

```powershell
Set-Location .
javac -d out src\main\java\Lesson4\Ex01_MaxOfThreeNumbers.java
java -cp out Lesson4.Ex01_MaxOfThreeNumbers
```

