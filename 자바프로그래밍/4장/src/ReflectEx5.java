import java.lang.reflect.*;

class Example5
{
	private double data = 3.14;
	public Example5 (int x) {}
	private void print(int p , int q) { System.out.print(p+q); }
}

public class ReflectEx5 {

	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
		Class a = Class.forName("Example5");
		Field[] fields = a.getDeclaredFields();
		for(Field field : fields)
		{
			System.out.println(field.getName());
			System.out.println(field.getType());
			field.setAccessible(true);
			Example5 obj = new Example5(0);
			System.out.println(field.get(obj));
			field.setDouble(obj, 2.75);
			System.out.println(field.get(obj));
		}
	}

}
