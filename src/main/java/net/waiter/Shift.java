package net.waiter;

public class Shift {
    String waiter;
    String weekDay;

    public String getWaiter() {
        return waiter;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    @Override
    public String toString() {
        return "Shift{" +
                "waiter='" + waiter + '\'' +
                ", weekDay='" + weekDay + '\'' +
                '}';
    }
}
