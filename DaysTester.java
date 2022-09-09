package Homework.HW3;

public class DaysTester {
    public static void main(String[] args) {
        System.out.println(isWeekDay(EnumDays.MONDAY));
        System.out.println(isWeekDay(EnumDays.SUNDAY));

        System.out.println(isWeekEnd(EnumDays.SATURDAY));
        System.out.println(isWeekEnd(EnumDays.WEDNESDAY));


    }

    public static boolean isWeekDay(EnumDays d) {
        boolean isWorkDay = false;
        switch (d) {
            case MONDAY -> isWorkDay = true;
            case TUESDAY -> isWorkDay = true;
            case WEDNESDAY -> isWorkDay = true;
            case THURSDAY -> isWorkDay = true;
            case FRIDAY -> isWorkDay = true;
        }
        return isWorkDay;
    }

    public static boolean isWeekEnd(EnumDays d) {
        boolean isDayOff = false;
        switch (d) {
            case SATURDAY -> isDayOff = true;
            case SUNDAY -> isDayOff = true;
        }
        return isDayOff;
    }
}
