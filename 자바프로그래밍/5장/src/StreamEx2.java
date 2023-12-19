import java.util.*;
import java.util.stream.Stream;

public class StreamEx2 {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("98.3", "67.2", "50.0", "78");
		List<Double> list2 = Arrays.asList(98.3, 67.2, 50.0, 78.0);
		
		double avg1 = list1.stream()
				.mapToDouble(num -> Double.parseDouble(num))
				.average()
				.getAsDouble();
		double avg2 = list2.stream()
				.mapToDouble(Double::doubleValue)
				.average()
				.getAsDouble();
		System.out.println("평균점수 : " + avg1);
		System.out.println("평균점수 : " + avg2);

	}

}
