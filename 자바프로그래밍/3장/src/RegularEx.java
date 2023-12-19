public class RegularEx {

	public static void main(String[] args) {
		String str = "Hello Java!";
		System.out.println(str.matches("He"));
		System.out.println(str.matches("(.*)He(.*)"));

	}

}
