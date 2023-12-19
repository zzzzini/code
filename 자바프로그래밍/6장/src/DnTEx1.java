import java.time.*;

public class DnTEx1 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime datetime = LocalDateTime.now();
		OffsetTime offTime = OffsetTime.now();
		OffsetDateTime offDatetime = OffsetDateTime.now();
		ZonedDateTime zoned1 = ZonedDateTime.now();
		ZonedDateTime zoned2 = ZonedDateTime.now(ZoneId.of("Asia/Aden"));
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(datetime);
		System.out.println(offTime);
		System.out.println(offDatetime);
		System.out.println(zoned1);
		System.out.println(zoned2);
	}

}
