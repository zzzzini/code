public class RegularEx0 {

	public static void main(String[] args) {
		String str = "123A99B987C77";
		String[] result = str.split("[a-zA-Z]+");
		for(String s : result)
			System.out.println(s);

	}

}
