package question8;

public enum WeekDay {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday {
        @Override
        public WeekDay next() {
            return Monday;
        }
    };

    public WeekDay next() {
        return values()[ordinal() + 1];
    }

    public WeekDay addNumberOfDays(int number) {
        while (number > 6 - ordinal() ) number -= 7;
        return values()[ordinal() + number];
    }
}
