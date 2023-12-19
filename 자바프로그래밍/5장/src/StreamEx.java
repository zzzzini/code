import java.util.*;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("이순신", "유관순","홍길동");
		
		// Iterator 이용(JDK 7까지만..)
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			String name = it.next();
			System.out.println(name);
		}
		
		// Stream 이용(JDK 8부터!)
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));
	}
}
