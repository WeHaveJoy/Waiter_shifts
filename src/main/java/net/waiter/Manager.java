package net.waiter;

public class Manager {
    String waiter_name;
    String dayOfWeek;

    public String getWaiter_name() {
        return waiter_name;
    }

    public String getDaysOfWeek() {
        return dayOfWeek;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "waiter_name='" + waiter_name + '\'' +
                ", daysOfWeek='" + dayOfWeek + '\'' +
                '}';
    }
}
