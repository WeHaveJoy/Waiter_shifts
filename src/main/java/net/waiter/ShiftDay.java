package net.waiter;

import java.util.ArrayList;
import java.util.List;

public class ShiftDay {
    String dayName;
    List<Shift> shifts = new ArrayList<>();

    public ShiftDay(String dayName) {
        this.dayName = dayName;
    }

    public List<Shift> getShifts() {
        return shifts;
    }

    public void setShifts(List<Shift> shifts) {
        this.shifts = shifts;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public void addShift(Shift shift) {
        this.shifts.add(shift);
    }

    @Override
    public String toString() {
        return "ShiftDay{" +
                "dayName='" + dayName + '\'' +
                ", shifts=" + shifts +
                '}';
    }
}
