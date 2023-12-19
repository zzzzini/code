import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx3 {

	public static void main(String[] args) {
		String sample = "The cat sat on the mat. And the cat is sleeping";
		
		Pattern p = Pattern.compile("[Tt]he");
		Matcher m = p.matcher(sample);
		while(m.find())
		{
			System.out.println(m.group());
			System.out.println("start index = " + m.start());
			System.out.println("end index = " + Integer.toString(m.end()-1));
			System.out.println();
		}

	}

}
