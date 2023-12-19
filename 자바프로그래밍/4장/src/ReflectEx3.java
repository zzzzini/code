import java.lang.reflect.*;

class Example3
{
	public Example3(int x) {}
}
public class ReflectEx3 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class a = Class.forName("Example3");
		Constructor[] cons = a.getDeclaredConstructors();
		for(Constructor con : cons)
		{
			System.out.println(con.getName());
			Class[] params = con.getParameterTypes();
			for(int i=0; i<params.length; i++)
				System.out.println(params[i]);
		}

	}

}
