package registration;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if(day > 31){
            throw new IllegalArgumentException("Invalid day of the month");
        }
        if(month > 12){
            throw new IllegalArgumentException("Month does not exist");
        }
        if(year < 1900){
            throw new IllegalArgumentException("Invalid year");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDate() {
        return String.format("%d/%d/%d", day, month,year);
    }
}
