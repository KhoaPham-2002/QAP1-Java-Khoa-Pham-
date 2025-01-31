public class Date {
    private int day;
    private int month;
    private int year;

    // Constructor with constraints
    public Date(int day, int month, int year) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Invalid date structure! Day must be between 1 and 31.");
        }

        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Invalid date structure! Month must be between 1 and 12.");
        }

        if (year >= 1900 && year <= 9999) {
            this.year = year;
        } else {
            System.out.println("Invalid date structure! Year must be between 1900 and 9999.");
        }
    }

    // Getter methods
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Setter methods with proper invalid input handling
    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Invalid date structure! Day must be between 1 and 31.");
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Invalid date structure! Month must be between 1 and 12.");
        }
    }

    public void setYear(int year) {
        if (year >= 1900 && year <= 9999) {
            this.year = year;
        } else {
            System.out.println("Invalid date structure! Year must be between 1900 and 9999.");
        }
    }

    // Set all values at once (with constraints)
    public void setDate(int day, int month, int year) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Invalid date structure! Day must be between 1 and 31.");
        }

        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Invalid date structure! Month must be between 1 and 12.");
        }

        if (year >= 1900 && year <= 9999) {
            this.year = year;
        } else {
            System.out.println("Invalid date structure! Year must be between 1900 and 9999.");
        }
    }

    // toString method
    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
