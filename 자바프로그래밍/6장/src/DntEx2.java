import java.time.*;

public class DntEx2 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2019, 3, 15);
		LocalTime time = LocalTime.of(12, 25);
		LocalDateTime datetime1 = LocalDateTime.of(date, time);
		LocalDateTime datetime2 = LocalDateTime.of(2019,  3, 15, 12, 25);
		OffsetDateTime offDatetime = OffsetDateTime.of(2019,  3, 15, 12, 25, 30, 0, ZoneOffset.ofHours(-9));
		ZonedDateTime zoned = ZonedDateTime.of(2019, 3, 15, 12, 25, 30, 0, ZoneId.systemDefault());
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(datetime1);
		System.out.println(datetime2);
		System.out.println(offDatetime);
		System.out.println(zoned);
	}

}
