package lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Exercise 3: Composition & Collections
 * -------------------------------------
 * Demonstrates how one object can own other objects and expose
 * meaningful behavior that aggregates their data.
 */
public class Ex03_CompositionAndCollections {

    private static class Student {
        private final String name;
        private final double gpa;

        Student(String name, double gpa) {
            this.name = name;
            this.gpa = gpa;
        }

        public String name() {
            return name;
        }

        public double gpa() {
            return gpa;
        }
    }

    private static class Course {
        private final String title;
        private final String instructor;
        private final List<Student> roster = new ArrayList<>();

        Course(String title, String instructor) {
            this.title = title;
            this.instructor = instructor;
        }

        void enroll(Student student) {
            roster.add(student);
        }

        List<Student> getRosterSnapshot() {
            return Collections.unmodifiableList(roster);
        }

        double averageGpa() {
            if (roster.isEmpty()) {
                return 0;
            }
            double total = 0;
            for (Student student : roster) {
                total += student.gpa();
            }
            return total / roster.size();
        }

        Student bestPerformer() {
            if (roster.isEmpty()) {
                return null;
            }
            Student best = roster.get(0);
            for (Student student : roster) {
                if (student.gpa() > best.gpa()) {
                    best = student;
                }
            }
            return best;
        }

        void printRoster() {
            System.out.printf("Course: %s (Instructor: %s)%n", title, instructor);
            for (int i = 0; i < roster.size(); i++) {
                Student student = roster.get(i);
                System.out.printf(" %d. %s -> GPA %.2f%n", i + 1, student.name(), student.gpa());
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Exercise 3: Composition & Collections ===\n");

        Student ana = new Student("Ana", 9.6);
        Student bruno = new Student("Bruno", 8.4);
        Student celine = new Student("Celine", 9.1);

        Course oop = new Course("Object-Oriented Programming", "Prof. Kodra");
        oop.enroll(ana);
        oop.enroll(bruno);
        oop.enroll(celine);

        oop.printRoster();
        System.out.printf("Average GPA: %.2f%n", oop.averageGpa());

        Student best = oop.bestPerformer();
        if (best != null) {
            System.out.printf("Top performer: %s with GPA %.2f%n", best.name(), best.gpa());
        }

        System.out.println("\nRoster snapshot can be shared without exposing the mutable list:");
        for (Student student : oop.getRosterSnapshot()) {
            System.out.println(" - " + student.name());
        }

        System.out.println("\n--- End of Exercise 3 ---\n");
    }
}
