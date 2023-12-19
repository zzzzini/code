import java.util.*;
import java.util.stream.*;

public class StreamEx3 {
	
	public static void print(String str)
	{
		System.out.println(str + " : " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("이순신", "유관순", "홍길동", "김봉근", "이기자", "차차차");
		Stream<String> stream = list.stream();
		stream.forEach(str -> print(str));
		System.out.println();
		Stream<String> pstream = list.parallelStream();
		pstream.forEach(str -> print(str));

	}

}
