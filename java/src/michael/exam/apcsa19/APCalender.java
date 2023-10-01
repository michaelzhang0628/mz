package michael.exam.apcsa19;

public class APCalender {
    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static int numberOfLeapYears(int year1, int year2) {
        int count = 0;
        for (int i = 0; i < (year2 - year1); i++) {
            if (isLeapYear(year1 + i)) {
                count++;
            }
        }
        return count;
    }

    // Only for testing
    private static int firstDayOfYear(int year) {
        if (year == 2023) {
            return 0;
        }
        return 0;
    }

    // Only for testing
    private static int dayOfYear(int month, int day, int year) {
        if (year == 2023) {
            if (month == 9 && day == 4) {
                return 247;
            }
            if (month == 2 && day == 2) {
                return 33;
            }
        }
        return 0;
    }

    public static int dayOfWeek(int month, int day, int year) {
        return (firstDayOfYear(year) + dayOfYear(month, day, year) - 1) % 7;
    }
}
