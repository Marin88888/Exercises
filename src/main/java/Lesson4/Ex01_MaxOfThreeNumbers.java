package Lesson4;

import java.util.Scanner;

public class Ex01_MaxOfThreeNumbers {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double first = input.nextDouble();

            System.out.print("Enter second number: ");
            double second = input.nextDouble();

            System.out.print("Enter third number: ");
            double third = input.nextDouble();

            double max = Math.max(first, Math.max(second, third));
            System.out.println("The biggest number is: " + max);
        }
    }
}

