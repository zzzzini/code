import java.lang.reflect.Method;

class Example
{
	private void print(int p, int q) { System.out.println(p+q); }
}

public class ReflectEx {

	public static void main(String[] args) throws ClassNotFoundException {
		Class a = Class.forName("Example");
		Method[] methods = a.getDeclaredMethods();
		for(Method method : methods)
		{
			System.out.println(method.getName());
			Class[] params = method.getParameterTypes();
			for(int i=0; i<params.length; i++)
				System.out.println(params[i]);
			System.out.println(method.getReturnType());
		}

	}

}