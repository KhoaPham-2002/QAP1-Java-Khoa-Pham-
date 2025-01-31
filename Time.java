public class Time {
    private int hour;
    private int minute;
    private int second;

    // Constructor with constraints
    public Time(int hour, int minute, int second) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            System.out.println("Invalid time structure! Hour must be between 0 and 23.");
        }

        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            System.out.println("Invalid time structure! Minute must be between 0 and 59.");
        }

        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            System.out.println("Invalid time structure! Second must be between 0 and 59.");
        }
    }


    // Getter methods
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Setter methods with proper invalid input handling
    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        } else {
            System.out.println("Invalid time structure! Hour must be between 0 and 23.");
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        } else {
            System.out.println("Invalid time structure! Minute must be between 0 and 59.");
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59) {
            this.second = second;
        } else {
            System.out.println("Invalid time structure! Second must be between 0 and 59.");
        }
    }

    // Method to set all time values at once
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // toString method to return time in "hh:mm:ss" format
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Method to advance by 1 second and return a new Time object
    public Time nextSecond() {
        int newSecond = second + 1;
        int newMinute = minute;
        int newHour = hour;

        if (newSecond == 60) {
            newSecond = 0;
            newMinute += 1;
            if (newMinute == 60) {
                newMinute = 0;
                newHour += 1;
                if (newHour == 24) {
                    newHour = 0;
                }
            }
        }

        return new Time(newHour, newMinute, newSecond);  // Return a new Time object
    }

    // Method to go back by 1 second and return a new Time object
    public Time previousSecond() {
        int newSecond = second - 1;
        int newMinute = minute;
        int newHour = hour;

        if (newSecond < 0) {
            newSecond = 59;
            newMinute -= 1;
            if (newMinute < 0) {
                newMinute = 59;
                newHour -= 1;
                if (newHour < 0) {
                    newHour = 23;
                }
            }
        }

        return new Time(newHour, newMinute, newSecond);  // Return a new Time object
    }
}
