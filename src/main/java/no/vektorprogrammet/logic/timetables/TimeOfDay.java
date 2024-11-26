package no.vektorprogrammet.logic.timetables;

public class TimeOfDay implements Comparable<TimeOfDay> {
    private int hour;
    private int minute;

    public TimeOfDay(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int hour() {
        return hour;
    }

    public int minute() {
        return minute;
    }

    @Override
    public int compareTo(TimeOfDay other) {
        if (hour != other.hour) {
            return hour - other.hour;
        } else {
            return minute - other.minute;
        }
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof TimeOfDay) {
            TimeOfDay otherTime = (TimeOfDay) other;
            return hour == otherTime.hour && minute == otherTime.minute;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return hour * 60 + minute;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }
} 
