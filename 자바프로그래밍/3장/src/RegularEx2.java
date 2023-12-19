public class RegularEx2 {

	public static void main(String[] args) {
		String str = "The cat sat on the mat. And the cat is sleeping.";
		String result1 = str.replaceAll("[Tt]he", "#");
		String result2 = str.replaceAll("^[Tt]he", "#");
		String result3 = str.replaceAll("cat", "#");
		String result4 = str.replaceAll(".$", "#");
		String result5 = str.replaceAll("\\bis\\b", "#");
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
	}

}
