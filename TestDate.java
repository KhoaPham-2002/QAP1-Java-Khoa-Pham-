public class TestDate {
    public static void main(String[] args) {
        // Create a Date object with a valid date
        Date myDate = new Date(29, 9, 2002);
        System.out.printf("Initial Date (My Birthday): %s%n", myDate);

        // Attempt to set invalid values (prints error messages)
        myDate.setDay(32);  // Invalid day
        myDate.setMonth(13); // Invalid month
        myDate.setYear(10000); // Invalid year

        // Modify the date with valid values
        myDate.setDay(30);
        myDate.setMonth(1);
        myDate.setYear(2025);
        System.out.printf("Updated Date (Today Date): %s%n", myDate);

        // Using setDate() to change to a valid date
        myDate.setDate(31, 1, 2025);
        System.out.printf("After setDate()(Tommorow Date): %s%n", myDate);
    }
}

