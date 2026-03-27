package lesson2;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * Exercise 4: Static Members & Factory Methods
 * --------------------------------------------
 * Highlights class-level counters, timestamping, and a factory that
 * controls object creation.
 */
public class Ex04_StaticMembersAndFactories {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss").withZone(ZoneId.systemDefault());

    private static class Ticket {
        private static int nextId = 1;

        private final int id;
        private final String holder;
        private final String event;
        private final Instant issuedAt;

        private Ticket(String holder, String event) {
            this.id = nextId++;
            this.holder = holder;
            this.event = event;
            this.issuedAt = Instant.now();
        }

        static Ticket issue(String holder, String event) {
            return new Ticket(holder, event);
        }

        static int issuedCount() {
            return nextId - 1;
        }

        @Override
        public String toString() {
            return String.format("Ticket #%d for %s -> %s at %s",
                    id,
                    holder,
                    event,
                    FORMATTER.format(issuedAt));
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Exercise 4: Static Members & Factories ===\n");

        Ticket t1 = Ticket.issue("Ana", "Robotics Lab Access");
        Ticket t2 = Ticket.issue("Bruno", "3D Printing Workshop");
        Ticket t3 = Ticket.issue("Celine", "Guest Lecture");

        System.out.println("Printing issued tickets:");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.printf("\nTotal issued: %d%n", Ticket.issuedCount());

        System.out.println("\n--- End of Exercise 4 ---\n");
    }
}
