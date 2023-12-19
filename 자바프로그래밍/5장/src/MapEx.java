import java.util.Arrays;
import java.util.List;

class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public int getScore() { return score; }
}
public class MapEx {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList( new Student("홍길동", 90),
				new Student("유관순", 80), new Student("이순신", 95));
		
		list.stream()
			.mapToInt(Student::getScore)
			.forEach(score -> System.out.println(score));
		
	}

}
