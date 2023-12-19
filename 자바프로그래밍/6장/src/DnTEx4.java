import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DnTEx4 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2019, 3, 15);
		LocalTime time = LocalTime.of(12, 25);
		LocalDateTime datetime = LocalDateTime.of(date, time);
		
		LocalDateTime result1 = datetime
				.withYear(2020)
				.withMonth(2)
				.withDayOfMonth(25);
		LocalDateTime result2 = datetime
				.withHour(11)
				.withMinute(1)
				.withSecond(1)
				.withNano(999999);
		System.out.println(result1);
		System.out.println(result2);
	}

}
