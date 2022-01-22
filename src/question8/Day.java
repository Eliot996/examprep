package question8;

public class Day {
    private int day;
    private WeekDay dayOfWeek;

    public Day(int day, WeekDay dayOfWeek) {
        this.day = day;
        this.dayOfWeek = dayOfWeek;
    }

    public void nextDay() {
        day++;
        dayOfWeek = dayOfWeek.next();
    }

    public void addDays(int number) {
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

    public static void main(String[] args) {
        Day day = new Day(1, WeekDay.Monday);
        day.addDays(49);

        System.out.println(day.getDay());
        System.out.println(day.getDayOfWeek());
    }
}
