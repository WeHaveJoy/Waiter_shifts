package net.waiter;

public class Days {
    int id;
    String weekday ;

    public void setId(int id) {
        this.id = id;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public int getId() {
        return id;
    }

    public String getWeekday() {
        return weekday;
    }

    @Override
    public String toString() {
        return "Days{" +
                "id=" + id +
                ", weekday='" + weekday + '\'' +
                '}';
    }
}
