import java.util.*;

public class FilteringEx {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("이순신", "김철수", "홍길동", "김봉근", "김기자", "김봉근");
		
		list.stream()
			.distinct()
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		list.stream()
			.filter(n -> n.startsWith("김"))
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		list.stream()
			.distinct()
			.filter(n -> n.startsWith("김"))
			.forEach(n -> System.out.println(n));

	}

}
