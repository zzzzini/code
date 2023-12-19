import java.time.*;
import java.time.format.DateTimeFormatter;

public class DnTEx6 {

	public static void main(String[] args) {
		LocalDateTime datetime1 = LocalDateTime.parse("2019-12-24T11:59:30");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
		LocalDateTime datetime2 = LocalDateTime.parse("2020/12/31 12:30", formatter);
		
		LocalDate date1 = LocalDate.parse("2019-08-15");
		DateTimeFormatter dformatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date2 = LocalDate.parse("2019-08-15", dformatter);
		
		LocalTime time1 = LocalTime.parse("12:30:20");
		DateTimeFormatter tformatter = DateTimeFormatter.ofPattern("HH-mm-ss");
		LocalTime time2 = LocalTime.parse("11-20-45", tformatter);
		
		System.out.println(datetime1);
		System.out.println(datetime2);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(time1);
		System.out.println(time2);
	}

}
