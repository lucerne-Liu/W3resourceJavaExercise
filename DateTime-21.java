package DateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

//21. Write a Java program to get the current time in all the available time zones.
public class DateTime_21 {
    private Calendar calendar;

    private DateTime_21() {
        calendar = Calendar.getInstance();
    }

    private void printCurrentTimeInALLTimeZones() {
        String[] timeZoneIds = TimeZone.getAvailableIDs();
        Arrays.stream(timeZoneIds).forEach(id -> {
            calendar.setTimeZone(TimeZone.getTimeZone(id));
            System.out.println(id + ": " + calendar.getTime());
        });
    }

    private void printCurrentTime() {
        ZoneId.SHORT_IDS.forEach((key, value) -> {
            System.out.println(value + ": " + LocalDateTime.now(ZoneId.of(value)));
        });
    }

    public static void main(String[] args) {
        new DateTime_21().printCurrentTime();
    }
}
