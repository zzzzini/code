import java.util.*;


public class DnTEx {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2016, Calendar.FEBRUARY, 1);
		int day1 = calendar.getActualMaximum(Calendar.DATE);
		System.out.println(day1);
		
		calendar.set(2017, Calendar.FEBRUARY, 1);
		int day2 = calendar.getActualMaximum(Calendar.DATE);
		System.out.println(day2);
	}

}
