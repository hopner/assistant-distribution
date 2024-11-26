package no.vektorprogrammet.logic;

import java.util.Set;
import no.vektorprogrammet.logic.timetables.*;

public class Assistant {
    
    String name;
    Set<TimeInterval> available;


    public Assistant(String name) {
        this.name = name;
    }

    public boolean addAvailableTime(TimeInterval interval) {
        return available.add(interval);
    }

    public boolean isAvailable(TimeInterval interval) {
        for (TimeInterval i : available) {
            if (i.day() == interval.day()) {
                if (i.start().compareTo(interval.start()) <= 0 && i.end().compareTo(interval.end()) >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isAvailable(MathClass mathClass) {
        return isAvailable(mathClass.time());
    }

    @Override
    public String toString() {
        return name;
    }

}
