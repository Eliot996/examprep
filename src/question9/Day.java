package question9;

import question8.WeekDay;

public class Day {
    private int day;
    private WeekDay dayOfWeek;

    public Day(int day, WeekDay dayOfWeek) {
        this.day = day;
        this.dayOfWeek = dayOfWeek;
    }

    public void nextDay() {
        if (day > 30) throw new RuntimeException("date cannot be higer than 31!");
        day++;
        dayOfWeek = dayOfWeek.next();
    }

    public void addDays(int number) {
        if (day + number > 31) throw new RuntimeException("date cannot be higer than 31!");
        if (number < 0) throw new IllegalArgumentException("Cannot be smaller than 0");
        day += number;
        dayOfWeek = dayOfWeek.addNumberOfDays(number);
    }

    public int getDay() {
        return day;
    }

    public WeekDay getDayOfWeek() {
        return dayOfWeek;
    }

    @Override
    public String toString() {
        String output = dayOfWeek.toString() + " the " + day;

        if (day > 10 && day < 20){
            output += "th";
        } else {
            int tempDay = day;
            while (tempDay > 10) tempDay -= 10;

            switch (tempDay) {
                case 1 -> output += "st";
                case 2 -> output += "nd";
                case 3 -> output += "rd";
                default -> output += "th";
            }
        }

        return output;
    }

    public static void main(String[] args) {
        Day day = new Day(1, WeekDay.Monday);

        System.out.println(day);

        for (int i = 0; i < 40; i++) {
            day.nextDay();
            System.out.println(day);
        }
    }
}
