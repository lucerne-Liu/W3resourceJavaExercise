package DateTime;

import java.text.DateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//24. Write a Java program to display the dates in the following formats.
//
//        Sample format :
//
//        Default format of LocalDate=2016-09-16
//        16::Sep::2016
//        Default format of LocalDateTime=2016-09-16T11:46:01.455
//        16::Sep::2016 11::46::01
//        Default format of Instant=2016-09-16T06:16:01.456Z
//        Default format after parsing = 2014-04-27T21:39:48
public class DateTime_24 {
    private LocalDate localDate;
    private LocalDateTime localDateTime;
    private Instant instant;

    public DateTime_24() {
        localDate = LocalDate.now();
        localDateTime = LocalDateTime.now();
        instant = Instant.now();
    }

    private void printResult() {
        System.out.println("Default format of LocalDate=" + localDate);
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd::MMM::uuuu", Locale.ENGLISH)));
        System.out.println("Default format of LocalDateTime=" + localDateTime);
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("dd::MMM::uuuu HH::mm::ss", Locale.ENGLISH)));
        LocalDateTime parseTime = LocalDateTime.parse("27::Apr::2014 21::39::48", DateTimeFormatter.ofPattern("dd::MMM::uuuu HH::mm::ss",Locale.ENGLISH));
        System.out.println("Default format of Instant=" + instant);
        System.out.println(parseTime);
    }

    public static void main(String[] args) {
        new DateTime_24().printResult();
    }
}
