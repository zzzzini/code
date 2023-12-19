import java.lang.annotation.*;

@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({
	ElementType.PACKAGE,
	ElementType.TYPE,
	ElementType.CONSTRUCTOR,
	ElementType.FIELD,
	ElementType.METHOD,
	ElementType.ANNOTATION_TYPE,
	ElementType.LOCAL_VARIABLE,
	ElementType.PARAMETER,
	ElementType.TYPE_PARAMETER,
	ElementType.TYPE_USE
	
})
public @interface AnnotationEx
{
	public enum DAY
	{
		MON, TUE, WED, TUR, FRI, SAT, SUN
	}
	
	String today() default "SUN";
	int count() default 7;
	DAY getday() default DAY.SUN;
}