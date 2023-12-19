import java.time.*;

public class DnTEx3 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2019, 3, 15);
		LocalTime time = LocalTime.of(12, 25);
		LocalDateTime datetime = LocalDateTime.of(date, time);
		
		int year = datetime.getYear();
		int month = datetime.getMonthValue();
		int day = datetime.getDayOfMonth();
		int hour = datetime.getHour();
		int minute = datetime.getMinute();
		int second = datetime.getSecond();
		int nanoSecond = datetime.getNano();
		int dayOfWeek = datetime.getDayOfWeek().getValue();
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		System.out.println(nanoSecond);
		System.out.println(dayOfWeek);
	}

}
