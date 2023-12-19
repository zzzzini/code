import java.util.function.*;

public class FuncInterfaceEx {

	public static void main(String[] args) {
		Consumer<String> stringConsumer = str -> System.out.println(str);
		BiConsumer<String, String> biConsumer = (t,u) -> System.out.println(t+u);
		DoubleConsumer doubleConsumer = d -> System.out.println("java" + d);
		ObjDoubleConsumer<String> objDoubleConsumer = (t,d) -> System.out.println(t+d);
		
		stringConsumer.accept("Hello!");
		biConsumer.accept("Hello ", "Java!");
		doubleConsumer.accept(8.0);
		objDoubleConsumer.accept("Java ", 8.0);

	}

}
