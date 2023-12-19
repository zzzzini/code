import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		String str = "test";
		Optional<String> optStr1 = Optional.ofNullable(str);
		optStr1.ifPresent(s -> System.out.println(s.charAt(0)));
		
		Optional<String> optStr2 = Optional.ofNullable(null);
		optStr2.ifPresent(s -> System.out.println(s.charAt(0)));
		
		Optional<String> optStr = Optional.ofNullable(null);
		String result = optStr.orElse("test");
		System.out.println(result);

	}

}
