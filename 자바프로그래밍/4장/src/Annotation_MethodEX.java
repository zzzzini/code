import java.lang.reflect.*;

class AnnotationEx3
{
	private int age;
	@InsertInt2(data = 30)
	public int getAge() { return age; }
}
public class Annotation_MethodEX {

	public static void main(String[] args) {
		AnnotationEx3 obj = new AnnotationEx3();
		Method[] methods = obj.getClass().getDeclaredMethods();
		for(Method method : methods)
		{
			InsertInt2 an = method.getAnnotation(InsertInt2.class);
			if(an != null)
			{
				System.out.println(an.data());
			}
		}

	}

}
