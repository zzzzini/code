class MyUtil
{
	public static <T extends String> int compare(T s1, T s2)
	{
		return s1.compareTo(s2);
	}
	
	public static <T extends Number> int compare(T n1, T n2)
	{
		return Double.compare(n1.doubleValue(), n2.doubleValue());
	}
}

public class BoundedEx {

	public static void main(String[] args) {
		int result2 = MyUtil.compare(10, 20);
		int result3 = MyUtil.compare(5.14, 4.5);
		int result4 = MyUtil.compare(20, 20.5);
		int result5 = MyUtil.compare(30L, 30L);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		System.out.println("result4 = " + result4);
		System.out.println("result5 = " + result5);
	}

}
