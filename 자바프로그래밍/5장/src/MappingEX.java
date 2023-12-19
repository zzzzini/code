import java.util.*;
import java.util.stream.*;

public class MappingEX {

	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5 };
		
		IntStream intStream = Arrays.stream(intArr);
		intStream
			.asDoubleStream()
			.forEach(data -> System.out.println(data));
		
		intStream = Arrays.stream(intArr);
		intStream
			.boxed()
			.forEach(obj -> System.out.print(obj.intValue()));

	}

}
