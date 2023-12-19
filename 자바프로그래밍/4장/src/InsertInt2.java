import java.lang.annotation.*;abstract

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface InsertInt2 {
	int data() default 0;
}
