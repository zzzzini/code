import java.lang.reflect.*;

class AnnotationEx2
{
	@InsertInt
	private int myAge;
	@InsertInt(data = 30)
	private int age;
	public int getAge() { return age; }
}

public class Annotation_FieldEX {

	public static void main(String[] args) {
		AnnotationEx2 obj = new AnnotationEx2();
		Field[] fields = obj.getClass().getDeclaredFields();
		for(Field field : fields)
		{
			InsertInt an = field.getAnnotation(InsertInt.class);
			if(an != null)
			{
				System.out.println(an.data());
			}
		}

	}

}
