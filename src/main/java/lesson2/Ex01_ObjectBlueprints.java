package lesson2;

/**
 * Exercise 1: Object Blueprints & References
 * ------------------------------------------
 * Shows how to declare reference variables, instantiate objects,
 * mutate their fields, and understand aliasing versus copying.
 */
public class Ex01_ObjectBlueprints {

    private static class Student {
        String name;
        int enrollmentYear;
        double gpa;

        void describe() {
            System.out.printf("Student{name='%s', year=%d, gpa=%.2f}%n", name, enrollmentYear, gpa);
        }
    }

    private static Student cloneStudent(Student original) {
        Student copy = new Student();
        copy.name = original.name;
        copy.enrollmentYear = original.enrollmentYear;
        copy.gpa = original.gpa;
        return copy;
    }

    public static void main(String[] args) {
        System.out.println("=== Exercise 1: Object Blueprints & References ===\n");

        Student ana = new Student();
        ana.name = "Ana";
        ana.enrollmentYear = 2024;
        ana.gpa = 9.1;

        Student bruno = new Student();
        bruno.name = "Bruno";
        bruno.enrollmentYear = 2023;
        bruno.gpa = 8.4;

        System.out.println("Freshly created objects:");
        ana.describe();
        bruno.describe();

        Student sameAna = ana;
        sameAna.gpa = 9.6;
        System.out.println("\nAfter modifying the alias sameAna (points to ana):");
        System.out.print("ana -> ");
        ana.describe();
        System.out.print("sameAna -> ");
        sameAna.describe();

        Student clonedBruno = cloneStudent(bruno);
        clonedBruno.name = "Bruno (clone)";
        clonedBruno.gpa = 8.9;
        System.out.println("\nCloning creates a distinct object:");
        System.out.print("bruno -> ");
        bruno.describe();
        System.out.print("clonedBruno -> ");
        clonedBruno.describe();

        Student[] cohort = {ana, bruno, clonedBruno};
        System.out.println("\nCohort iteration shows reference order:");
        for (int i = 0; i < cohort.length; i++) {
            System.out.printf("slot %d -> ", i);
            cohort[i].describe();
        }

        System.out.println("\n--- End of Exercise 1 ---\n");
    }
}

