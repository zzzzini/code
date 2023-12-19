import java.util.function.BiFunction;
import java.util.function.Function;

class Person2
{
	private String name;
	private int age;
	
	public Person2(String name) {
		this.name = name;
	}
	
	public Person2(String name, int age)
	{
		this(name);
		this.age = age;
	}
}
public class LambdaEx2 {
	
	public static void main(String[] args) {
		Function<String, Person2> func1 = Person2 :: new;
		Person2 man = func1.apply("Kim");
		
		BiFunction<String, Integer, Person2> func2 = Person2 :: new;
		Person2 woman = func2.apply("Kim", 24);
	}

}
