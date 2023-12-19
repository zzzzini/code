import java.util.Scanner;
class compared
{
	public static <T extends Number> int compare (T n1, T n2)
	{
		return Double.compare(n1.doubleValue(), n2.doubleValue());
	}
}

public class examples
{	
	public static void main(String[] args) {
		System.out.println(compared.compare(5,7));
	}
}