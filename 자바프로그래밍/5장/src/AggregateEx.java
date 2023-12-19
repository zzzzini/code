import java.util.*;

public class AggregateEx {

	public static void main(String[] args) {
		long count = Arrays.stream(new int[] {1, 2, 3, 4, 5})
						.filter(n -> n%2==0).count();
		System.out.println("2의 배수 개수 : " + count);
		
		long sum = Arrays.stream(new int[] {1, 2, 3, 4, 5})
				.filter(n -> n%2==0).sum();
		System.out.println("2의 배수 개수 : " + sum);
		
		double avg = Arrays.stream(new int[] {1, 2, 3, 4, 5})
				.filter(n -> n%2==0).average().getAsDouble();
		System.out.println("2의 배수 개수 : " + avg);
		
		int max = Arrays.stream(new int[] {1, 2, 3, 4, 5})
				.filter(n -> n%2==0).max().getAsInt();
		System.out.println("2의 배수 개수 : " + max);
		
		int first = Arrays.stream(new int[] {1, 2, 3, 4, 5})
				.filter(n -> n%2==0).findFirst().getAsInt();
		System.out.println("2의 배수 개수 : " + first);

	}

}
