import java.util.*;
import java.time.*;
public class DnTEx8 {

	public static void main(String[] args) {
		Date today = new Date();
		Instant instant = today.toInstant();
		LocalDateTime datetime1 = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		ZonedDateTime datetime2 = ZonedDateTime.ofInstant(instant, ZoneId.of("Asia/Seoul"));
		System.out.println(datetime1);
		System.out.println(datetime2);
		
		LocalDateTime now = LocalDateTime.now();
		ZonedDateTime zoned = ZonedDateTime.now();
		Instant instant1 = now.toInstant(ZoneOffset.ofHours(9));
		Instant instant2 = zoned.toInstant();
		Date today1 = Date.from(instant1);
		Date today2 = Date.from(instant2);
		System.out.println(today1);
		System.out.println(today2);

	}

}
