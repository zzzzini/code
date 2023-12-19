import java.time.*;
import java.time.format.DateTimeFormatter;

public class DnTEx5 {

	public static void main(String[] args) {
		LocalDateTime datetime = LocalDateTime.now();
		String format1 = datetime.format(DateTimeFormatter.BASIC_ISO_DATE);
		String format2 = datetime.format(DateTimeFormatter.ISO_DATE_TIME);
		String format3 = datetime.format(DateTimeFormatter.ISO_DATE);
		String format4 = datetime.format(DateTimeFormatter.ISO_TIME);
		
		ZonedDateTime zonedDatetime = ZonedDateTime.now();
		String format5 = zonedDatetime.format(DateTimeFormatter.ISO_DATE_TIME);
		String format6 = zonedDatetime.format(DateTimeFormatter.ISO_DATE);
		String format7 = zonedDatetime.format(DateTimeFormatter.ISO_TIME);
		
		System.out.println(format1);
		System.out.println(format2);
		System.out.println(format3);
		System.out.println(format4);
		System.out.println(format5);
		System.out.println(format6);
		System.out.println(format7);

	}

}
