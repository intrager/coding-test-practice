import java.time.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        ZonedDateTime todayDate = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(todayDate.getYear());
        System.out.println(todayDate.getMonthValue());
        System.out.println(todayDate.getDayOfMonth());
    }
}