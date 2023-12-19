import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DnTEx7 {

	public static void main(String[] args) {
		DateTimeFormatter[] formatter = new DateTimeFormatter[8];
		LocalDateTime datetime = LocalDateTime.now();
		
		formatter[0] = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		formatter[1] = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		formatter[2] = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		formatter[3] = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		formatter[4] = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		formatter[5] = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		formatter[6] = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		formatter[7] = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		
		for(int i=0; i<formatter.length; i++)
			System.out.println(datetime.format(formatter[i]));

	}

}
