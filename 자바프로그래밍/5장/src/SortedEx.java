import java.util.*;
import java.util.stream.*;

class Studente implements Comparable<Studente>
{
	private String name;
	private int score;
	
	public Studente(String name, int score)
	{
		this.name = name;
		this.score = score;
	}
	
	public int getScore() { return score; }
	
	@Override
	public int compareTo(Studente obj)
	{
		return Integer.compare(score, obj.getScore());
	}
}

public class SortedEx {

	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] {5, 3, 4, 1, 2});
		intStream
			.sorted()
			.forEach(n -> System.out.print(n + " "));
		System.out.println();
		List<Studente> list = Arrays.asList(new Studente("홍길동", 90),
				new Studente("유관순", 80), new Studente("이순신", 95));
		list.stream()
			.sorted()
			.forEach(n -> System.out.print(n.getScore() + " "));
		System.out.println();
		list.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(n -> System.out.print(n.getScore() + " "));
		

	}

}
