package lesson2;

/**
 * Exercise 2: Constructors & Encapsulation
 * ----------------------------------------
 * Illustrates constructor overloading, invariant checks, and behavior
 * that is derived from private state.
 */
public class Ex02_ConstructorsAndEncapsulation {

    private static class Box {
        private double width;
        private double height;
        private double depth;

        Box(double width, double height, double depth) {
            this.width = ensurePositive(width, "width");
            this.height = ensurePositive(height, "height");
            this.depth = ensurePositive(depth, "depth");
        }

        Box(double edgeLength) {
            this(edgeLength, edgeLength, edgeLength);
        }

        void scale(double factor) {
            double f = ensurePositive(factor, "scale factor");
            width *= f;
            height *= f;
            depth *= f;
        }

        double volume() {
            return width * height * depth;
        }

        double surfaceArea() {
            return 2 * (width * height + width * depth + height * depth);
        }

        @Override
        public String toString() {
            return String.format("Box{w=%.1f, h=%.1f, d=%.1f}", width, height, depth);
        }

        private static double ensurePositive(double value, String label) {
            if (value <= 0) {
                throw new IllegalArgumentException(label + " must be positive. Got " + value);
            }
            return value;
        }
    }

    private static void printBoxReport(String label, Box box) {
        System.out.printf("%s -> %s | volume=%.2f | surface=%.2f%n", label, box, box.volume(), box.surfaceArea());
    }

    public static void main(String[] args) {
        System.out.println("=== Exercise 2: Constructors & Encapsulation ===\n");

        Box shippingCrate = new Box(30, 20, 15);
        Box cubeGiftBox = new Box(5);

        printBoxReport("Shipping crate", shippingCrate);
        printBoxReport("Gift cube", cubeGiftBox);

        System.out.println("\nScaling the gift cube by 1.5 keeps proportions intact:");
        cubeGiftBox.scale(1.5);
        printBoxReport("Gift cube (scaled)", cubeGiftBox);

        System.out.println("\nAttempting to scale by 0 shows how validation protects the object:");
        try {
            cubeGiftBox.scale(0);
        } catch (IllegalArgumentException ex) {
            System.out.println("Caught: " + ex.getMessage());
        }

        System.out.println("\n--- End of Exercise 2 ---\n");
    }
}

