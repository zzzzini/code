import java.lang.reflect.*;

class Example2
{
	public Example2(int x) {}
	public void print(int p, int q) {System.out.println(p+q);}
}

public class ReflectEx2
{
	public static void main(String[] args)
	{
		try {
			Class a = Class.forName("Example2");
			Class[] paramTypes = new Class[2];
			paramTypes[0] = Integer.TYPE;
			paramTypes[1] = Integer.TYPE;
			Method method = a.getMethod("print", paramTypes);
			
			Example2 obj = new Example2(0);
			Object[] argList = new Object[2];
			argList[0] = new Integer(3);
			argList[1] = new Integer(5);
			Object rtn = method.invoke(obj, argList);
		}
		catch(Exception e) {System.out.print("오류");}
	}
}