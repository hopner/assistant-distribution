package no.vektorprogrammet.logic.timetables;

import java.time.DayOfWeek;

public record TimeInterval(DayOfWeek day, TimeOfDay start, TimeOfDay end) {
    
}
