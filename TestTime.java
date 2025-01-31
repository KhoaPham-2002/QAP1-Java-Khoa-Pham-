public class TestTime {
    public static void main(String[] args) {
        // Create two Time objects with specified times using setTime()
        Time t1 = new Time(21, 5, 15);
        Time t2 = new Time(10, 20, 25);

        // Display the initial times before any changes
        System.out.printf("Initial Time for t1: %s%n", t1);
        System.out.printf("Initial Time for t2: %s%n", t2);

        // Call nextSecond() for t1 and previousSecond() for t2
        t1 = t1.nextSecond();  // Advance t1 by 1 second
        t2 = t2.previousSecond();  // Go back 1 second for t2

        // Display the final times after changes
        System.out.printf("After nextSecond() for t1: %s%n", t1);
        System.out.printf("After previousSecond() for t2: %s%n", t2);
    }
}
