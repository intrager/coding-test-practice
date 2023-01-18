import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Year;
import java.time.LocalDate;

public class Main {
    
    public static void main(String[] args) {
        System.out.println(LocalDate.now(ZoneId.of("Asia/Seoul")));
    }
}