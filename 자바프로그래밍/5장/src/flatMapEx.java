import java.util.*;

public class flatMapEx {

	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList("Java lambda", "stream mapping example");
		List<String> inputList2 = Arrays.asList("10 20 30", "40 50 60 70");
		
		inputList1.stream()
			.flatMap(data -> Arrays.stream(data.split(" ")))
			.forEach(word -> System.out.println(word));
		System.out.println();
		
		inputList2.stream()
			.flatMapToInt(data -> {
				String[] strArr = data.split(" |, ");
				int[] intArr = new int[strArr.length];
				for(int i=0; i<strArr.length; i++)
					intArr[i] = Integer.parseInt(strArr[i].trim());
				return Arrays.stream(intArr);
			})
			.forEach(number -> System.out.println(number));

	}

}