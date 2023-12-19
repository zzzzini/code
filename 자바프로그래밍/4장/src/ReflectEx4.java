import java.lang.reflect.*;

class Example4
{
	public Example4(int x, int y)
	{
		System.out.println("Constructor!!");
	}
}

public class ReflectEx4 {

	public static void main(String[] args) {
		try {
			Class a = Class.forName("Example4");
			Class[] paramTypes = new Class[2];
			paramTypes[0] = Integer.TYPE;
			paramTypes[1] = Integer.TYPE;
			Constructor cs = a.getConstructor(paramTypes);
			
			Object[] argList = new Object[2];
			argList[0] = new Integer(3);
			argList[1] = new Integer(5);
			Object rtn = cs.newInstance(argList);
		}
		catch(Exception e) {}

	}

}
